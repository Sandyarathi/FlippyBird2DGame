public class NoCoinState implements IGameStates 
{
    FlappyBird flappybird;
    public NoCoinState(FlappyBird f)
    {
        flappybird=f;
        flappybird.setSpeed(-1);
    }

    public void getCoin(){
        System.out.println("Flappy Bird received coin in "+ this.getClass().getName() +" State");
        IGameStates hs = new HasCoinState(flappybird);
        flappybird.setState(hs);
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
