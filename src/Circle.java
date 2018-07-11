/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edu94
 */
public class Circle extends Figure {

    double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getRadius(){
        return this.r;
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Circle)) {
            return false;
        } else {
            Circle circle = (Circle) o;
            return super.equals(o) && (this.r == circle.getRadius());
        }
    }
    
    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }
}