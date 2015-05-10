public class DeadState implements IGameStates 
{
    FlappyBird flappybird;
    public DeadState(FlappyBird f)
    {
        flappybird=f;
        flappybird.setSpeed(0);        
    }

    public void getCoin(){
       //System.out.println("Flappy Bird receives coin in "+ this.getClass().getName() +" State");
       System.out.println("Cannot receive coin in "+ this.getClass().getName() +" State");
    }
    
    public void die(){
       //System.out.println("Flappy Bird dies in "+ this.getClass().getName() +" State");
       System.out.println("Cannot die in "+ this.getClass().getName() +" State");
    }
    
    public void restart(){
        System.out.println("Restart in "+ this.getClass().getName() +" State");
    }    
}
