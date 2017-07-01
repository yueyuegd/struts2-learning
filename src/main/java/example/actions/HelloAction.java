package example.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by zhangyue-k on 2017/6/25.
 * User:zhangyue-k
 * Date:2017/6/25
 */
public class HelloAction extends ActionSupport{

    private static final long serialVersionUID = 1L;

    private static final Logger log = LogManager.getLogger(HelloAction.class);

    private String message;

    public String execute() throws Exception{
        log.info("In execute method of class Hello");
        message = "Hello from Struts 2 with no XML configuration.";
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
