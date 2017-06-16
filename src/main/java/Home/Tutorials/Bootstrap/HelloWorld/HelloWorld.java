package Home.Tutorials.Bootstrap.HelloWorld;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhangyue-k on 2017/5/25.
 * User:zhangyue-k
 * Date:2017/5/25
 */
public class HelloWorld extends ActionSupport {

    public static final String MESSAGE = "Struts is up and running ...";

    public String execute() throws Exception{
        setMessage(MESSAGE);
        return SUCCESS;

    }

    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
