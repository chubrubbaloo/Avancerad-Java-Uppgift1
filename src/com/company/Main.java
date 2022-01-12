package com.company;

// Uppgift 2. Skriv koden till ett eget funktionellt interface samt ge ett exempel på en implementation av ditt interface på lambda-form.

// Funktionellt interface.
@FunctionalInterface
interface MyFunction{
    int apply(int x);
}

public class Main {

    public static void main(String[] args) {

        // Implementation av mitt interface i lambda-form.
        MyFunction addFiveToMe = x -> x + 5;
        useMyInterface(addFiveToMe,10); // Output: 15
    }

    public static void useMyInterface(MyFunction myFunction, int x) {
        System.out.println(myFunction.apply(x));
    }
}
