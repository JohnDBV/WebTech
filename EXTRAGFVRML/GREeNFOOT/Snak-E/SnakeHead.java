import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeHead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeHead extends Actor
{
    private final int EST = 0;
    private final int SUD = 90;
    private final int VEST = 180;
    private final int NORD = 270;
    
    private final int SPEED = 10;
    private int counter = 0;
    
    public SnakeHead()
    {
        setRotation(Greenfoot.getRandomNumber(4) * 90);
    }
    
    /**
     * Act - do whatever the SnakeHead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        
        if(isTouching(Food.class))
        {
         removeTouching(Food.class);
         SnakeWorld world = (SnakeWorld) getWorld();
         world.addFood();
        }    
    }
    
    private void move()
    {
        counter++;
        
        if(counter == SPEED)
        {
            getWorld().addObject(new Tail(), getX(), getY());
            move(1);
            counter = 0;
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(EST);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(SUD);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(VEST);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(NORD);
        }
    }
}
