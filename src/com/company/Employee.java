package com.company;

/**
 * Optional jest wraperem (klasą opakowującą)na dany obiekt. Klasy opakowujące, jak sama nazwa wskazuje, służą do „opakowania” typów prymitywnych,
 * w ten sposób aby można było ich używać jako obiektów, wraz z wszelkimi dobrodziejstwami wynikającymi z tego faktu.
 * Dzięki nim można na przykład przekazywać
 * do metod odnośniki do obiektów, korzystać ze wspomnianych kolekcji, czy metod udostępnianych przez klasę Object oraz klasy wrapperów.
 * */

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String s) {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
