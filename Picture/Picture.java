
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square lawn;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle round;
    private Square border;

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
        tower(0);
        tower(120);
        tower(240);
        bigTower(0);
        bigTower(280);
        frontWall(-25);
        frontWall(125);
        frontWall(250);
        roundWindow(30);
        roundWindow(190);
        roundWindow(345);
        for(int i = -35; i < 400;)
        {
            wallBorder(i);
            i+=35;
        }
        
        lawn = new Square();
        lawn.moveVertical(350);
        lawn.changeColor("green");
        lawn.changeSize(500);
        lawn.moveHorizontal(-60);
        lawn.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(400);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
    }
    
    /**
     * Draw a single tower with roof. Takes a position differential as an arg.
     * Pass 0 as arg for first tower
     */
    public void tower(int diff)
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(80);
        wall.makeVisible();
        wall.moveHorizontal(30+diff);
        
        wall2 = new Square();
        wall2.moveVertical(160);
        wall2.changeSize(80);
        wall2.makeVisible();
        wall2.moveHorizontal(30+diff);

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(55+diff);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(40, 120);
        roof.moveHorizontal(80+diff);
        roof.moveVertical(85);
        roof.makeVisible();
    
    }
    
    /**
     * Draw a single tower. Takes a position differential as an arg.
     * Pass 0 as arg for first tower
     */
    public void bigTower(int diff)
    {
        wall = new Square();
        wall.moveVertical(140);
        wall.changeSize(100);
        wall.changeColor("blue");
        wall.makeVisible();
        wall.moveHorizontal(diff);
        
        wall2 = new Square();
        wall2.moveVertical(200);
        wall2.changeSize(100);
        wall2.changeColor("blue");
        wall2.makeVisible();
        wall2.moveHorizontal(diff);
    }
    
    /**
     * Draw a front wall. Takes a position differential as an arg.
     */
    public void frontWall(int diff)
    {
        wall = new Square();
        wall.moveVertical(200);
        wall.changeSize(150);
        wall.changeColor("magenta");
        wall.makeVisible();
        wall.moveHorizontal(diff);
        
   
    }
    
    public void wallBorder(int diff)
    {
        wall = new Square();
        wall.moveVertical(190);
        wall.changeSize(30);
        wall.changeColor("green");
        wall.makeVisible();
        wall.moveHorizontal(diff);
        
   
    }
    
    /**
     * Draw a round window. Takes a position differential as an arg.
     */
    public void roundWindow(int diff)
    {
        round = new Circle();
        round.changeColor("white");
        round.moveHorizontal(diff);
        round.moveVertical(220);
        round.changeSize(80);
        round.makeVisible();
        
   
    }
 

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            wall2.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            lawn.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            wall2.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            
        }
    }

}
