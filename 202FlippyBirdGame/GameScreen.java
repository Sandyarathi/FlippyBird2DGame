import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameScreen extends Screen
{
    int a=0,b=0,c=0;
    int count =0;
    private int threshold_pipes =60, threshold_coins = 40;
    private Pipe pipe;
    public Coins coin;
    private RandomCoins randomcoins= new RandomCoins() ;
    GameScreen world;
    FlappyBird flappybird = new FlappyBird();
    Score score = new Score(flappybird); 
    Status status = new Status(flappybird); 
    ShowSpeed speed = new ShowSpeed(flappybird); 
    Timer timer= new Timer();
    
    
    public GameScreen()
    {    
        super(true);
        prepare();
    }
    
    private void prepare()
    {
        Pipe pi;     
        
        addObject(flappybird,700,300);       
        addObject(score, 390, 20);    
        addObject(status, 110, 20);

              
        flappybird.attach(score);  
        flappybird.attach(status);        
        
        addObject(speed, 670, 20);  
        addObject(timer, 950, 20);  
        timer.setTime(10);
        PipeCreator c1 = new PipeFactory();
        pipe = c1.getPipes();
        addObject(pipe,411,63);
        
             
    }
    
    public Coins getCoinVal()
    {
        return this.coin;
    }
    
    public void setCoinVal(Coins newCoin)
    {
        this.coin = newCoin;
    }
    
    public void act()  
    {  
        a++;  
        if(a == threshold_pipes)  
        {  
            randomPipesOnScreen();  
            a = 0;  
        }  
       
        c++;
        if (c == threshold_coins)
        {
            randomCoinsOnScreen();
            c=0;
           
        } 
    }  
  
    public void randomPipesOnScreen()  
    {  
        int z = Greenfoot.getRandomNumber(10);  
        int x = Greenfoot.getRandomNumber(getWidth());  
        int y = Greenfoot.getRandomNumber(getHeight()); 
        if(z == 1) {  
            PipeCreator c3 = new PipeFactory();
            pipe = c3.getPipes();
            addObject(pipe,10,y);
        }
    }  
    
   
    
    public void randomCoinsOnScreen()  
    {  
        int z1= Greenfoot.getRandomNumber(10);  
        int y1 = Greenfoot.getRandomNumber(getWidth());  
        int x1 = Greenfoot.getRandomNumber(getHeight());  
          
        if(count < 10){    
            coin =randomcoins.setRandomCoins();
            if (coin != null ){
                addObject(coin, y1, x1);
                count++;
            }
        }
    }
    
    public Timer getTimerObj(){
        return timer;
    }
}