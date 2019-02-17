/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.pattern;

/**
 *
 * @author Hossam
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectingle;
    private Shape square;
    
    public ShapeMaker(){
        circle = new Circle();
        rectingle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    
    public void drawRectingle(){
       rectingle.draw();
    }
    
    
    public void drawSquare(){
        square.draw();
        
    }
    
}
