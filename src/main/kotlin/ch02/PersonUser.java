package ch02;

import ch02.Person.Person;

/* Java */

public class PersonUser {
    public static void main(String[] args) {
        Person person = new Person("Bob", true);
        System.out.println(person.getName());
        System.out.println(person.isStudent());
        person.setStudent(false);
        System.out.println(person.isStudent());
    }
}
