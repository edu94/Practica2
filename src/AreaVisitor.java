
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edu94
 */
public class AreaVisitor implements FigureVisitor {

    private double rectangleArea;
    private double circleArea;
    private List<Double> drawArea;

    @Override
    public void visit(Rectangle rectangle) {

    }

    @Override
    public void visit(Circle circle) {

    }

    @Override
    public void visit(Drawing drawing) {

    }

    public double getArea(Rectangle rectangle) {
        return rectangleArea;
    }

    public double getArea(Circle circle) {
        return circleArea;
    }

    public List<Double> getArea(Drawing drawing) {
        return drawArea;
    }

}
