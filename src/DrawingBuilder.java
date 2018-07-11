
import java.util.ArrayList;
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
public class DrawingBuilder {
    
    private final double x;
    private final double y;
    private final List<Figure> components = new ArrayList<>();

    public DrawingBuilder(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public DrawingBuilder addComponent(Figure figure) {
        this.components.add(figure);
        return this;
    }
    
    public Drawing build() {
        return new Drawing(this.x, this.y, this.components);
    }

}

