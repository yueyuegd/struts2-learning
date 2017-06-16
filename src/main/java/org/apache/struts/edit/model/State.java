package org.apache.struts.edit.model;

/**
 * Created by zhangyue-k on 2017/6/16.
 * User:zhangyue-k
 * Date:2017/6/16
 */
public class State {
    private String stateAddr;
    private String stateName;

    public State(String stateAddr, String stateName) {
        this.stateAddr = stateAddr;
        this.stateName = stateName;
    }

    public String getStateAddr() {
        return stateAddr;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateAddr(String stateAddr) {
        this.stateAddr = stateAddr;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
