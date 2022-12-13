import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    /**
     * Creats an apple at a random area at the top of the screen
     */
    public void createApple()
    {
       Apple apple = new Apple();
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(apple, 300, 0); 
    }
}
