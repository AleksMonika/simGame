package com.example.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoApplication {

    public static void main(String[] args) {
        String Name;
        String LastName;
        int age;

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        Name = scan.nextLine();
        System.out.println("What's your surname?");
        LastName = scan.nextLine();
        System.out.println("What's your age?");
        age = scan.nextInt();
        Sim sim = new Sim(age, LastName, Name);
        System.out.println("Hi " + sim.firstName + " " + sim.surname);
        System.out.println(sim.firstName + " what is your budget?");
        double budget = scan.nextDouble();
        System.out.println("What do you want to eat?(true, false)");
        if (doYouWannaGo(scan)) {
            System.out.println("What do you want to eat nigiri, tomago, california?");
            scan.nextLine();
            String sushiType = scan.nextLine();
            System.out.println("How many rolls do you want?");
            int rolls = scan.nextInt();
            Sushi goforSushi = new Sushi (budget, rolls);
            goforSushi.setSushi(sushiType);
            goforSushi.ifCanGoForSushi();
            goforSushi.setTotal();
            System.out.println(goforSushi.ifCanGoForSushi());
        } else {
            System.out.println("Maybe next time...");
        }
    }



    private static boolean doYouWannaGo(Scanner scan) {
        boolean doYouWannaGo;
        try {
            doYouWannaGo = scan.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Please answer: true or false");
            scan.next();
            doYouWannaGo = doYouWannaGo(scan);
        }
        return doYouWannaGo;
    }
}
