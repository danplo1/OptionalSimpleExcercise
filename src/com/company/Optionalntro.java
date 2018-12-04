package com.company;

import java.util.Optional;

/**
 * Created by Daniel_D'AGE on 04.12.2018.
 */
public class Optionalntro {

    public static void main(String[] args) {

        Optional<Employee> employee = EmployeeRepository.find("Paweł"); // wyszukanie pracownika po imieniu

//        if (employee.isPresent()){ // zwraca booleana
//
//            Employee emp = employee.get();
//            System.out.println(emp.getName());
//        }


        employee

                .filter(emp->emp.getAge() > 30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);


        //System.out.println(employeeName);


//        if (employee!=null){
//            System.out.println(employee.getName());
//        }

    }
}
