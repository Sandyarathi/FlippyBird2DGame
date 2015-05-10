import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Status extends Observer
{
    String status="NoCoin";
    FlappyBird flappyBird;
    
    public Status(Subject sub)
    {
        super(sub);
        flappyBird=(FlappyBird)sub;
    }
        
    public void update(){
       status=flappyBird.getGameState();
       if(status.equals("hasCoin")){
           status="HasCoin";
        }
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("State: " + status, 30,  Color.ORANGE, Color.BLUE));
    }    
}
