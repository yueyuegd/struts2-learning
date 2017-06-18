package org.apache.struts.tutorials.wildcardmethod.model;

/**
 * Created by zhangyue-k on 2017/6/18.
 * User:zhangyue-k
 * Date:2017/6/18
 */
public class Person {

    private int id;
    private String firstName;
    private String lastName;

    public Person(){
        this.id = 1;
        this.firstName = null;
        this.lastName = null;
    }
    public Person(int id,String firstName,String lastName){
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
