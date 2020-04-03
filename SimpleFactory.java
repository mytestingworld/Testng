import org.testng.annotations.Factory;

/**
 * Demo Example Using Factory
 * @author ashish
 */
public class SimpleFactory
{
    @Factory
    public Object[] factoryMethod()
    {
        return new Object[]{new FactoryExample(0),new FactoryExample(1)};
    }

}
