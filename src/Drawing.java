

import static java.util.Collections.unmodifiableList;
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
public class Drawing extends Figure {

    private final List<Figure> components;

    public Drawing(double x, double y, List<Figure> components) {
        super(x, y);
        this.components = components;
    }

    public List<Figure> getComponents() {
        return unmodifiableList(this.components);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Drawing)) {
            return false;
        } else {
            Drawing drawing = (Drawing) o;
            return super.equals(o) && this.components.equals(drawing.getComponents());
        }
    }
    
    @Override
    public void accept(FigureVisitor av) {
        av.visit(this);
    }
}