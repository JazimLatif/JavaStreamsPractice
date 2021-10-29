package com.jazimlatif.today;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people =  List.of(new Person("Leo",Gender.Male),
                new Person("Margot",Gender.Female),
                new Person("Brad",Gender.Male),
                new Person("Quentin",Gender.Male),
                new Person("Mia",Gender.Female),
                new Person("Zahir",Gender.Male),
                new Person("Anne",Gender.Female),
                new Person("Jake",Gender.Male),
                new Person("Jazim",Gender.Male));




        List<String> females = people
                .stream()
                .filter(person->person.getGender().equals(Gender.Female))
                .map(person->person.getName())
                .collect(Collectors.toList());

        System.out.println(females);


    }
}
