import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class ShowSpeed extends Actor
{
    FlappyBird flappyBird;
    int speed;
    
    public ShowSpeed(FlappyBird sub)
    {
        super();
        flappyBird = sub;
    }
        
    public void act() 
    {
        speed=flappyBird.getSpeed();
        speed=speed*(-1);
        setImage(new GreenfootImage("Speed: " + speed, 30,  Color.ORANGE, Color.BLUE));
    }    
}
