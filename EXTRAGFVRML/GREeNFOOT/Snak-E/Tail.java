import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    private int age = 0;
    private final int maxAge = 50;
        
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        age++;
        if(age == maxAge)
        {
            getWorld().removeObject(this);
        }
    }    
}
