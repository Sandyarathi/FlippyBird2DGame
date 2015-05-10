import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

public class CreditsBox extends Actor 
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
        img.setTransparency(200);
        img.fill();
        img.setColor(Color.YELLOW);
        String[] text = {
            "Game",
            "[Press Escape to exit]",
            "",
            "Created by",
            "TEAM 10",
            "",
            "",
            "Team",
            "Priyadharshini",
            "Manasvini",
            "Sandyarathi",
            "Shanmughanathan",
            "Shruthi",
            "",
            ""
        };
        int fontSize = (height-10)/text.length;
        Font f= new Font("Comic Sans MS", Font.PLAIN, 32);
        img.setFont(f);
        //img.setFont(img.getFont().deriveFont((float)fontSize));
        for(int i = 0; i < text.length; i++) {
            img.drawString(text[i], 10, fontSize*i+fontSize);
        }
        setImage(img);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("escape")) Greenfoot.setWorld(new MenuScreen());
    } 
}





















