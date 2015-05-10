import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

public class InstructionBox extends Actor
{
    public void addedToWorld(World world) {
        int width = world.getWidth(), height = world.getHeight();
        double rate = 0.1;
        for(double d = rate; d < 1; d += rate) {
            int w = (int)Math.round((double)width*d),
                h = (int)Math.round((double)height*d);
            GreenfootImage img = new GreenfootImage(w, h);
            img.setTransparency(180);
            img.fill();
            setImage(img);
            Greenfoot.delay(1);
        }
        GreenfootImage img = new GreenfootImage(width, height);
        img.setTransparency(180);
        img.fill();
        img.setColor(Color.ORANGE);
        String[] text = {
            "Game Instructions",
            "[Press Escape to exit]",
            "",
            "1. Use navigation keys to move around",
            "       Go right: 'Right Arrow Key'",
            "       Go left: 'Left Arrow Key'",
            "       Go Up: 'Up arrow key'",
            "       Go Down : 'Down arrow key'",
            "2. Dodge the Tunnels",
            "3. Collect coins to earn points",
            "4. Score will help you to go the next level.",
            "       Level 1 - Score 10 points to move to level 2. ",
            "       Level 2 - Score 30 points to move to level 3. ",
            "       Level 3 - Score 60 points to win. ",
            "",
            "                                        Enjoy the Game",
            ""
        };
        int fontSize = (height-10)/text.length;
        //img.setFont(img.getFont().deriveFont((float)fontSize));
        Font f= new Font("Comic Sans MS", Font.PLAIN, 32);
        img.setFont(f);
        for(int i = 0; i < text.length; i++) {
            img.drawString(text[i], 10, fontSize*i+fontSize);
        }
        setImage(img);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("escape")) Greenfoot.setWorld(new MenuScreen());
    } 
}
