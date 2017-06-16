package Home.Tutorials.Bootstrap.HelloWorld;

import com.opensymphony.xwork2.ActionSupport;
import junit.framework.TestCase;

/**
 * Created by zhangyue-k on 2017/5/25.
 * User:zhangyue-k
 * Date:2017/5/25
 */
//用来测试Action HelloWord的测试类
public class HelloWorldTest extends TestCase{

    public void testHelloWorld() throws Exception{
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.execute();

        assertTrue("Expected a success result!", ActionSupport.SUCCESS.equals(result));

        assertTrue("Expected the default message!",HelloWorld.MESSAGE.equals(helloWorld.getMessage()));
    }
}
