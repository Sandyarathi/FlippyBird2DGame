
public class FlappyBirdFactory implements FlappyBirdCreator 
{   
    public FlappyBirdFactory()
    {
    }

    public FlappyBird getFlappyBird()
    {
        return new FlappyBird();
    }
}
