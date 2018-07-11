/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrawingBuilderTest {
    
    private DrawingBuilder db;
    
    @Before
    public void setUp() {
        db = new DrawingBuilder(40.0, 50.0);
    }

    @Test
    public void building_without_components_added() {
        Drawing draw = db.build();
        List<Figure> solution = new ArrayList<>();
        assertEquals(40.0, draw.getX(), 0);
        assertEquals(50.0, draw.getY(), 0);
        assertEquals(solution, draw.getComponents());
    }
    
    @Test
    public void adding_component_and_building() {
        Figure fig = new Rectangle(40.0, 20.0, 10.0, 15.0);
        List<Figure> list = new ArrayList<>();
        list.add(fig);
        Drawing solution = new Drawing(40.0, 50.0, list);
        db.addComponent(fig);
        assertEquals(solution, db.build());
    }
    
    @Test
    public void adding_diferent_components_and_building() {
        List<Figure> list = new ArrayList<>();
        Figure fig1 = new Rectangle(40.0, 20.0, 10.0, 15.0);
        Figure fig2 = new Circle(10.0, 60.0, 5.0);
        Figure fig3 = new Drawing(25.0, 15.0, new ArrayList());
        list.add(fig1);
        list.add(fig2);
        list.add(fig3);
        db.addComponent(fig1);
        db.addComponent(fig2);
        db.addComponent(fig3);
        Drawing solution = new Drawing(40.0, 50.0, list);
        assertEquals(solution, db.build());
    }
    
    @Test
    public void adding_drawingComponent_with_other_components_and_building() {
        Figure figRec = new Rectangle(40.0, 20.0, 10.0, 15.0);
        Figure figCir = new Circle(10.0, 60.0, 5.0);
        Figure figRec2 = new Rectangle(20.0, 25.0, 15.0, 12.5);
        List<Figure> figList = new ArrayList<>();
        figList.add(figCir);
        figList.add(figRec2);
        Figure figDrawing = new Drawing(25.0, 15.0, figList);
        List<Figure> list = new ArrayList<>();
        list.add(figRec);
        list.add(figDrawing);
        db.addComponent(figRec);
        db.addComponent(figDrawing);
        Drawing solution = new Drawing(40.0, 50.0, list);
        assertEquals(solution, db.build());
    }

}