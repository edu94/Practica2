/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edu94
 */
public abstract class Figure {
    double x;
    double y;
    
    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Figure)) {
            return false;
        } else {
            Figure figure = (Figure) o;
            return (this.x==figure.getX()) && (this.y==figure.getY());
        }
    }

    
    public abstract void accept(FigureVisitor fv);
}
