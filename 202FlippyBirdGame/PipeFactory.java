
public class PipeFactory implements PipeCreator 
{   
    public PipeFactory()
    {
    }
    public Pipe getPipes()
    {
       return new Pipe();
    }
}
