import org.testng.annotations.Test;

/**
 * Class being called by SimpleFactory
 * @author ashish
 */
public class FactoryExample {
    int param;

    public FactoryExample(int param) {
        this.param = param;

    }

    /**
     * Test Method 1
     */
    @Test
    public void testMethod1() {
        int val = param + 10;
        System.out.println("Value is " + val);
    }

    /**
     * Test Method 2
     */
    @Test
    public void testMethod2() {
        int val = param + 20;
        System.out.println("Value is " + val);
    }

}

