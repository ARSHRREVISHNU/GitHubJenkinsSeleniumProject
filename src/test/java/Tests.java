import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    public Main main;

    //mvn clean test
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }


    @Test
    public void test3(){
        main = new Main();
        main.initialization("");
    }
}
