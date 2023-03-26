import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    //mvn clean test
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }
}
