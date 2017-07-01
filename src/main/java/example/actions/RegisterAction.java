package example.actions;

import com.opensymphony.xwork2.ActionSupport;
import example.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.struts2.convention.annotation.Action;

/**
 * Created by zhangyue-k on 2017/6/25.
 * User:zhangyue-k
 * Date:2017/6/25
 */
public class RegisterAction extends ActionSupport{
    private static final long serialVersionUID = 1L;

    private static final Logger log = LogManager.getLogger(RegisterAction.class);

    private Person personBean;

    //@Action("register-input")
    public String input() throws Exception{
        log.info("In input method of class RegisterAction");

        return INPUT;
    }


    public String excecute() throws Exception{

        log.info("In execute method of class RegisterAction");

        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }
}
