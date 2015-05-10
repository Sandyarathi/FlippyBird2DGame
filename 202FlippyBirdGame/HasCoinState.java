public class HasCoinState implements IGameStates 
{
    FlappyBird flappybird;
    
    public HasCoinState(FlappyBird f){
        flappybird=f;
    }

    public void getCoin(){
        System.out.println("Flappy Bird receives coin in "+ this.getClass().getName() +" State");
        System.out.println("Already in "+ this.getClass().getName() +" State");
        flappybird.setSpeed(flappybird.getSpeed()-1);
        if(flappybird.getSpeed()>8)
            flappybird.setSpeed(-8);
    }
    
    public void die(){
        System.out.println("Flappy Bird dies in "+ this.getClass().getName() +" State");
        IGameStates ds = new DeadState(flappybird);
        flappybird.setState(ds);
    }
    
    public void restart(){
       System.out.println("Restart in "+ this.getClass().getName() +" State");
       System.out.println("Cannot Restart in "+ this.getClass().getName() +" State");
    }    
}
