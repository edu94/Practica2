/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edu94
 */
public interface FigureVisitor {
    
    void visit(Rectangle rectangle);

    void visit(Circle circle);

    void visit(Drawing drawing);
}
