package org.apache.struts.tutorials.wildcardmethod.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts.tutorials.wildcardmethod.model.Person;

import java.util.*;

/**
 * Created by zhangyue-k on 2017/6/18.
 * User:zhangyue-k
 * Date:2017/6/18
 */
public class PersonService {

    private static final Logger log = LogManager.getLogger(PersonService.class);

    private static SortedMap<Integer,Person> people = new TreeMap<Integer, Person>();

    static{
        people.put(0,new Person(0,"Steve","Smith"));
        people.put(1,new Person(1,"Sue","Jones"));
    }

    private static List<Person> personList = new ArrayList<Person>();

    static{
        for(Integer id:people.keySet()){
            personList.add(people.get(id));
        }
    }
    public static List<Person> getPersons(){
        return personList;
    }
    public void save(Person person){
        int newId = getNewId();
        person.setId(newId);
        people.put(newId,person);
        rebuildPersonList();

    }
    private int getNewId(){
        int newId = 0;
        try{

            newId = people.lastKey() + 1;

        }catch(NoSuchElementException e){
            log.info("Id value set to 0");
        }
        return newId;
    }
    public void update(Person person){
        Person tempPerson = people.get(person.getId());
        tempPerson.setFirstName(person.getFirstName());
        tempPerson.setLastName(person.getLastName());
        rebuildPersonList();
    }
    public void deletePerson(int id){
        people.remove(id);
        rebuildPersonList();
    }
    public Person getPerson(int id){
        return people.get(id);
    }
    public static void rebuildPersonList(){
        personList = new ArrayList<Person>();
        for(Integer id:people.keySet()){
            personList.add(people.get(id));
        }
    }
}
