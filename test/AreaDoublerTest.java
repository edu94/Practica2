/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author edu94
 */
public class AreaDoublerTest {
    
    private AreaDoubler ad;
    private final double scale = Math.sqrt(2.0);
    private Figure fig1;
    private Figure fig1Scaled;
    private Figure fig2;
    private Figure fig2Scaled;
    
    @Before
    public void setUp() {
        ad = new AreaDoubler();
    }
    
    public void createFigures(){
        fig1 = new Rectangle(40.0, 20.0, 10.0, 15.0);
        fig1Scaled = new Rectangle(40.0, 20.0, 10.0*scale, 15.0*scale);
        fig2 = new Circle(10.0, 60.0, 5.0);
        fig2Scaled = new Circle(10.0, 60.0, 5.0*scale);
    }
    
  @Test
    public void test_rectangle_AreaDoubler() {
        Rectangle rect = new Rectangle(20.0, 10.0, 5.0, 10.0);
        rect.accept(ad);
        Rectangle solution = new Rectangle(20.0, 10.0, 5.0*scale, 10.0*scale);
        Rectangle result = (Rectangle) ad.getFigure();
        assertEquals(solution, result);
    }

    @Test
    public void test_circle_AreaDoubler() {
        Circle circle = new Circle(20.0, 30.0, 5.0);
        circle.accept(ad);
        Circle solution = new Circle(20.0, 30.0, 5.0*scale);
        Circle result = (Circle) ad.getFigure();
        assertEquals(solution, result);
    }

    @Test
    public void test_drawing_AreaDoubler() {
        createFigures();
        Drawing d = new DrawingBuilder(40.0, 20.0).addComponent(fig1).addComponent(fig2).build();
        d.accept(ad);
        Drawing solution = new DrawingBuilder(40.0, 20.0).addComponent(fig1Scaled).addComponent(fig2Scaled).build();
        Drawing result = (Drawing) ad.getFigure();
        assertEquals(solution, result);
    }    
   
     @Test
    public void test_drawing_with_drawingcomponent() {
        createFigures();
        List<Figure> list = new ArrayList<>();
        list.add(fig1);
        list.add(fig2);
        Drawing drawingNoBuilder = new Drawing(20.0, 40.0, list);
        Drawing d = new DrawingBuilder(10.0, 30.0).addComponent(drawingNoBuilder).build();
        d.accept(ad);
        Drawing result = (Drawing) ad.getFigure();
        
        List<Figure> listScaled = new ArrayList<>();
        listScaled.add(fig1Scaled);
        listScaled.add(fig2Scaled);
        Drawing drawingScaled = new Drawing(20.0, 40.0, listScaled);
        Drawing expected = new DrawingBuilder(10.0, 30.0).addComponent(drawingScaled).build();
        assertEquals(expected, result);
    }
    
}
