package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {



	// write your code here
        List<Person> employeeList = List.of(
                new Person ("Gunnar", "Man", 25000),
                new Person ("Bengt", "Man", 27000),
                new Person ("Natasha", "Kvinna ", 30000),
                new Person ("Gunde-Svan", "Man",35000),
                new Person ("Markus", "Man",40000),
                new Person ("Frida","Kvinna", 23000),
                new Person ("Alice", "Kvinna",40000),
                new Person ("Markus", "Man",45000 ),
                new Person ("Jonas", "Man", 25000),
                new Person ("Jenny", " Kvinna", 32000)



        );

        Person employeeList1 = employeeList.stream().max(Comparator.comparing(Person::getSalary)).orElseThrow();

        out.println("Personen som har högs lön är = " + employeeList1);

        Person employeeList2 = employeeList.stream().min(Comparator.comparing(Person::getSalary)).orElseThrow();
        out.println("Personen som har lägst lön är = "+ employeeList2);

        double employeeList3 = employeeList.stream().mapToDouble(value -> value.getSalary()).summaryStatistics().getAverage();

        out.println("Snittlönen för anställda är = " + employeeList3);

    }

}
