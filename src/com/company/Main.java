package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Uppgift 2. Skriv koden till ett eget funktionellt interface samt ge ett exempel på en implementation av ditt interface på lambda-form.
// Funktionellt interface.
@FunctionalInterface
interface MyFunction {
    int apply(int x);
}

public class Main {

    public static void main(String[] args) {

        // Implementation av mitt interface i lambda-form.
        MyFunction addFiveToMe = x -> x + 5;
        useMyInterface(addFiveToMe, 10); // Output: 15


        // Uppgift 6. Ge exempel på ett reguljärt uttryck och beskriv vad ditt uttryck matchar på.

        String text = "C# C++ Java 35237 Haris HTML";

        // Letar efter enbart siffror som är 5 karaktärer långt.
        regexChecker("\\s\\d{5}\\s", text);


    }

    public static void regexChecker(String theRegex, String str2Check) {

        // Du definierar ditt reguljära uttryck genom att använda ett mönster
        Pattern checkRegex = Pattern.compile(theRegex);

        // Skapar ett matcher objekt som söker strängen för någonting som matchar det reguljära uttrycket.
        Matcher regexMatcher = checkRegex.matcher(str2Check);

        // Går igenom de positiva matchningarna och printar ut dem.
        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println("Jag hittade en matching på [" + regexMatcher.group() + "]");
            }
            System.out.println("Börjar på index : " + regexMatcher.start());
            System.out.println("och slutar på index : " + regexMatcher.end());

        }
    }

    public static void useMyInterface(MyFunction myFunction, int x) {
        System.out.println(myFunction.apply(x));
    }
}
