import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen.
 * 
 * @author Haneesh Suthakar 
 * @version Dec 13, 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /**
     * An act loop for the main world.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,490,117);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,303,295);
        elephant.setLocation(515,122);
        label.setLocation(345,341);
        label.setLocation(330,338);
        Label label2 = new Label("Press \u27f5 to move left and \u27f6 to move right", 30);
        addObject(label2,280,228);
        label2.setLocation(319,239);
        label.setLocation(316,315);
        label2.setLocation(326,219);
        label.setLocation(305,297);
        label.setLocation(246,339);
        elephant.setLocation(302,100);
        label2.setLocation(305,288);
        label.setLocation(306,358);
    }
}
