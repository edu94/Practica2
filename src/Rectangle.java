/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edu94
 */
public class Rectangle extends Figure {

    double width;
    double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Rectangle)) {
            return false;
        } else {
            Rectangle rect = (Rectangle) o;
            return super.equals(o) && (this.width == rect.getWidth()) && (this.height == rect.getHeight());
        }
    }
    
    @Override
    public void accept(FigureVisitor fv) {
        fv.visit(this);
    }
}