package org.fasttrackit.code.exceptionsIntro;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your name:");
        String name = scanner.nextLine();
        System.out.println("Please provide your age");
        int age = scanner.nextInt();

        if(age < 18){
            throw new ValidationException("You are a minor!");
        }

        Person person = new Person(name, age);
        System.out.println("The registration was successful!");
        System.out.println(person);

        /*
            CHECKED -> extends Exception ( must be solved ( with try-catch ) or must be thrown up the stack )
            UNCHECKED -> extends RuntimeException ( they are automatically thrown )
         */
    }
}
