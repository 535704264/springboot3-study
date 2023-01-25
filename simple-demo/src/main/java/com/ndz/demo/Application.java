package com.ndz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Application {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            Person person = new Person();
            person.setId(i);
            person.setName("jack" + i);
            personList.add(person);
        }
        List<Person> collectPersonList = personList.stream()
                .filter(person -> person.getId() > 5000)
                .collect(Collectors.toList());
        System.out.println(collectPersonList);
    }

}
