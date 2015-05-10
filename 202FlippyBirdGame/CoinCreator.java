
public  class CoinCreator  
{
    public CoinCreator()
    {
    }
    
    public Coins makeCoins(String type)
    {
       GoldCoinFactory g = new GoldCoinFactory();
       SilverCoinFactory s = new SilverCoinFactory();
               if(type.equals("gold"))
        {
            return g.getCoin();
        }
              
        if(type.equals("silver"))
        {
            return s.getCoin();
        }
        return null;
    }
    
}
