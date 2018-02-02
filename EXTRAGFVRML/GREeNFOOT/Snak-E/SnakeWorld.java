import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeWorld extends World
{

    /**
     * Constructor for objects of class SnakeWorld.
     * 
     */
    public SnakeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(30, 20, 20);
        
        GreenfootImage img = new GreenfootImage(20,20);
        img.drawRect(0,0,19,19);
        setBackground(img);
        
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        addObject(new SnakeHead(), x, y);
        
        addFood();
    }
    
    public void addFood()
    {
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        
        addObject(new Food(), x, y);
    }
}
