package org.apache.struts.edit.service;

import org.apache.struts.edit.model.Person;

/**
 * Created by zhangyue-k on 2017/6/16.
 * User:zhangyue-k
 * Date:2017/6/16
 */
public interface EditService {

    Person getPerson();
    void savePerson(Person person);
}
