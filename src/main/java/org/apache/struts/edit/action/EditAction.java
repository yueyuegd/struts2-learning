package org.apache.struts.edit.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.edit.model.Person;
import org.apache.struts.edit.model.State;
import org.apache.struts.edit.service.EditService;
import org.apache.struts.edit.service.EditServideInMemory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangyue-k on 2017/6/16.
 * User:zhangyue-k
 * Date:2017/6/16
 */
public class EditAction extends ActionSupport {

    private static final long serialVersionID = 1L;
    private EditService editService = new EditServideInMemory();
    //private EditService editService;
    private Person personBean;
    private String[] sports = {"football","baseball","basketball"};
    private String[] genders = {"male","female","not sure"};
    private List<State> states;

    private String[] carModelsAvaliable = {"Ford","Chrysler","Toyota","Nissan"};


    public String execute() throws Exception{
        editService.savePerson(getPersonBean());
        return SUCCESS;
    }

    public String input() throws Exception{
        setPersonBean(editService.getPerson());
        return INPUT;
    }

    public Person getPersonBean() {
        /*personBean = new Person();
        personBean.setFirstName("Wang");
        personBean.setLastName("Karry");
        personBean.setSport("basketball");
        personBean.setGender("male");
        personBean.setResidency("BeiJing");
        personBean.setOver21(false);
        personBean.setCarModels(new String[]{"AD","BK"});*/
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }

    public List<String> getSports() {
        return Arrays.asList(sports);
    }

    public List<String> getGenders() {
        return Arrays.asList(genders);
    }
    public List<State> getStates(){
        states = new ArrayList<State>();
        states.add(new State("AZ","Arizona"));
        states.add(new State("CA","California"));
        states.add(new State("FL","Florida"));
        states.add(new State("KS","Kansas"));
        states.add(new State("NY","New York"));
        return states;
    }

    public String[] getCarModelsAvaliable() {
        return carModelsAvaliable;
    }
}
