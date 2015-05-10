import greenfoot.*; 
import java.util.*;

public class Subject extends Actor implements ISubject
{
    private String gameState;
    
    private ArrayList<IObserver> observers = new ArrayList<IObserver>() ;
      
    public String getState(){
        return gameState;
    }
    
    public void setState(String status){
        gameState = status;
        notifyObservers();
    }
    
    public void attach(IObserver obj) {
        observers.add(obj) ;
    }

    public void detach(IObserver obj) {
        observers.remove(obj) ;
    }
    
    public void notifyObservers() {
        for (IObserver obj  : observers)
        {
            obj.update();
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
