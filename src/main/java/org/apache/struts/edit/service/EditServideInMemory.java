package org.apache.struts.edit.service;

import org.apache.struts.edit.model.Person;

/**
 * Created by zhangyue-k on 2017/6/16.
 * User:zhangyue-k
 * Date:2017/6/16
 */
public class EditServideInMemory implements EditService {

    private static Person person;
    private static String[] carModels = {"Ford","Nissan"};

    static{
        person = new Person();
        person.setFirstName("Bruce");
        person.setLastName("Phillips");
        person.setSport("basketball");
        person.setGender("not sure");
        person.setResidency("KS");
        person.setOver21(true);
        person.setCarModels(carModels);
    }
    public Person getPerson() {
        return EditServideInMemory.person;
    }

    public void savePerson(Person personBean) {
        EditServideInMemory.person.setFirstName(personBean.getFirstName());
        EditServideInMemory.person.setLastName(personBean.getLastName());
        EditServideInMemory.person.setSport(personBean.getSport());
        EditServideInMemory.person.setGender(personBean.getGender());
        EditServideInMemory.person.setResidency(personBean.getResidency());
        EditServideInMemory.person.setOver21(personBean.isOver21());
        EditServideInMemory.person.setCarModels(personBean.getCarModels());

    }
}
