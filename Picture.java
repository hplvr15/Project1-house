/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square square1;
    private Triangle triangle1;
    private Triangle triangle2;
    private Circle circle1;
    private Circle circle2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        square1 = new Square();
        square1.moveHorizontal(-310); 
        square1.moveVertical(0);
        square1.changeSize(300);
        square1.makeVisible();
        square1.changeColor("black");
        
        triangle1 = new Triangle();
        triangle1.moveHorizontal(-160); 
        triangle1.moveVertical(-100);
        triangle1.makeVisible();
        triangle1.changeColor("black");
        
        triangle2 = new Triangle();
        triangle2.moveHorizontal(20); 
        triangle2.moveVertical(-100);
        triangle2.makeVisible();
        triangle2.changeColor("black");
        
        circle1 = new Circle();
        circle1.moveHorizontal(-180); 
        circle1.moveVertical(60);
        circle1.makeVisible();
        circle1.changeColor("yellow");
        
        circle2 = new Circle();
        circle2.moveHorizontal(-30); 
        circle2.moveVertical(60);
        circle2.makeVisible();
        circle2.changeColor("yellow");
        
    }

    /**
     * Change this picture to use color display
     */
    /**public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            square1.changeColor("black");
            triangle1.changeColor("black");
            triangle2.changeColor("black");
            circle1.changeColor("yellow");
            circle2.changeColor("yellow");
        }
    }*/
}
