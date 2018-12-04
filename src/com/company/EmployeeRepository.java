package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Daniel_D'AGE on 04.12.2018.
 */
public class EmployeeRepository {


    private static Map<String, Employee> employees = new HashMap<>(4);

    static {
        employees.put("Paweł", new Employee("Paweł", 32));
        employees.put("Maciej", new Employee("Maciej", 36));
        employees.put("Tomek ", new Employee("Tomek", 38));
        employees.put("Kasia", new Employee("Kasia", 25));
    }

    private EmployeeRepository() {

    }

    public static Optional<Employee> find(String name) {

        // Optional.empty(); zawsze zwraca pustego optionala
        //Optional.of(null); null

        return Optional.ofNullable(employees.get(name)); // metoda zakłada, że ofNullable nigdy nie bedzie nullem


    }
}
