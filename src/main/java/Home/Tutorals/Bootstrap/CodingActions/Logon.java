package Home.Tutorals.Bootstrap.CodingActions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zhangyue-k on 2017/5/26.
 * User:zhangyue-k
 * Date:2017/5/26
 */
public class Logon extends ActionSupport {

    private String username;
    private String password;

    public String execute() throws Exception{
        if(isInvalid(getUsername())){
            return INPUT;
        }
        if(isInvalid(getPassword())){
            return INPUT;
        }
        return SUCCESS;
    }

    private boolean isInvalid(String value){
        return (value == null || value.length() == 0);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
