import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RandomCoins extends Actor
{
    CoinCreator coinFactory = new CoinCreator();
    Coins coin;
        
    public Coins setRandomCoins()
    {   
         switch ((Greenfoot.getRandomNumber(9999) % 2))
         {
             case 0:
             {
                 coin = coinFactory.makeCoins("gold");
                 break;
             }
            case 1:
             {
                 coin = coinFactory.makeCoins("silver");
                 break;
             }
         }
         return(coin);
    }
}
