import greenfoot.*;


public class FlappyBird extends Subject
{
    private int coinsCollected;
    private int speed;
    IGameStates noCoinState;
    IGameStates hasCoinState;
    IGameStates deadState;
    IGameStates currentState;
    
    public void act() 
    {       
        if (Greenfoot.isKeyDown ("left"))
        {move(-4); }
        if (Greenfoot.isKeyDown ("right"))
        {move(4); }
        setRotation(90);
        if (Greenfoot.isKeyDown("up"))
        { move(-4); }
        if (Greenfoot.isKeyDown("down"))
        { move(4); }
        setRotation(0);
        getCoin();
        die();
      } 
      
      public boolean isAtAnyEdge()
   {
       int x = getX();
       int y = getY();
       if (y == 0)
           return true;
       else if (x == 0)
           return true;
       else if (x == getWorld().getWidth()-1)
           return true;
       else if (y == getWorld().getHeight()-1)
           return true;
       else
           return false;
   }  
              
   
    
    public void getCoin()
    {
        Actor g = getOneIntersectingObject(Coins.class); 
        if(g != null) {
            getWorld().removeObject(g);
            Greenfoot.playSound("eating.wav");
            coinsCollected = coinsCollected + 1; 
            System.out.println("State:"+ currentState);
            System.out.println("Speed:"+ speed);
            currentState.getCoin();
            System.out.println("State:"+ currentState);
            System.out.println("Speed:"+ speed);
            notifyObservers();
        }
    }
    
    public void die()
    {
        Actor g = getOneIntersectingObject(Pipe.class);
        
        if(g != null||isAtAnyEdge()||((GameScreen)getWorld()).getTimerObj().isTimeUp()) {
            getWorld().removeObject(this);
            System.out.println("State:"+ currentState);
            System.out.println("Speed:"+ speed);
            currentState.die();
            restart();
        }
    }
    public void restart()
    {
        System.out.println("State:"+ currentState);
        System.out.println("Speed:"+ speed);
        currentState.restart();
        GameOverScreen ms = new GameOverScreen(getGameState());
        Greenfoot.setWorld(ms);
        System.out.println("State:"+ currentState);
        System.out.println("Speed:"+ speed);
    }
    
    public String getGameState(){
       System.out.println(currentState);
       if(currentState.getClass()==deadState.getClass()){
           return "Dead";
       }
       else if(currentState.getClass()==hasCoinState.getClass()){
           return "HasCoin";
       }
       else {
           return "NoCoin";
       }
    }
            
    public FlappyBird(){
        GreenfootImage image = getImage();  
        image.scale(image.getHeight()-20,image.getWidth()-20);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        deadState = new DeadState(this); 
        currentState=noCoinState;
        setSpeed(-1);
    }
    
    public void setSpeed(int s){
        speed=s;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setState(IGameStates cs){
       currentState = cs;
    }
}