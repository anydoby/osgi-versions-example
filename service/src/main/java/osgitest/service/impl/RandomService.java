package osgitest.service.impl;

import osgitest.model.Person;
import osgitest.service.PersonService;

public class RandomService implements PersonService {

    String surnamePrefix;

    public RandomService() {
        System.out.println("New service");
    }

    @Override
    public Person getPerson(String name) {
        Person person = new Person();
        person.setFirstName(name);
        person.setLastName(surnamePrefix + name);
        return person;
    }

    public void init() {
        System.out.println("Initializing");
    }

    public void destroy() {
        System.out.println("Destroying");
    }

    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

}
