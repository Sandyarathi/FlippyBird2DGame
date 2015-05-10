import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
 
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 10;
    private int count = 60;
    public void act() 
    {
        // Add your action code here.
        if(time == 0)
        {
            return;
        }
         
        if(counter())
        {
            time--;
            count = 60;
        }
       
         setImage(new GreenfootImage("Time: " + time, 30,  Color.ORANGE, Color.BLUE));
    }    
     
    private boolean counter()
    {
        if(count > 0)
        {
            count--;
        }
        return count == 0;
    }
     
       
    public void setTime(int timeVal)
    {
        time = timeVal;
    }
     
    public boolean isTimeUp()
    {
        return time == 0;
    }
     
}
