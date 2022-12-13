import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage idleRight = new GreenfootImage[8];
    GreenfootImage idleLeft = new GreenfootImage[8];
    
    String facing = "right";
    
    /**
     * Constructor - A code that runs when an object is created
     */
    public Elephant()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i] = idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);
        }
        
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
        }
        else
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        
        eat();
        
        animateElephant();
    }
    
    /**
     * Eat the apple that is falling and replace with another apple after eaten
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
