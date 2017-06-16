package org.apache.struts.edit.model;

/**
 * Created by zhangyue-k on 2017/6/16.
 * User:zhangyue-k
 * Date:2017/6/16
 */
public class Person {

    private String firstName;
    private String lastName;
    private String sport;
    private String gender;
    private String residency;
    private String[] carModels;
    private boolean over21;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSport() {
        return sport;
    }

    public String getGender() {
        return gender;
    }

    public String getResidency() {
        return residency;
    }

    public String[] getCarModels() {
        return carModels;
    }

    public boolean isOver21() {
        return over21;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setResidency(String residency) {
        this.residency = residency;
    }

    public void setCarModels(String[] carModels) {
        this.carModels = carModels;
    }

    public void setOver21(boolean over21) {
        this.over21 = over21;
    }
}
