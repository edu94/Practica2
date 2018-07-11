/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edu94
 */
public class AreaDoubler implements FigureVisitor {

     private final double ratio = Math.sqrt(2.0);
    private Figure result;
    
    @Override
    public void visit(Circle c) {
        result = new Circle(c.getX(), c.getY(), c.getRadius() * ratio);
    }

    @Override
    public void visit(Rectangle r) {
        result = new Rectangle(r.getX(), r.getY(), r.getWidth() * ratio, r.getHeight() * ratio);
    }
    
   @Override
    public void visit(Drawing d) {
        DrawingBuilder db = new DrawingBuilder(d.getX(), d.getY());
        for (Figure f : d.getComponents()) {
            f.accept(this);
            db.addComponent(this.getFigure());
        }
        this.result = db.build();
    }
    
    public Figure getFigure() {
        return result;
    }

}
