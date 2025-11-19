package ru.netology.services;

public class Main {
    public static void  main(String[] args) {
        FreelancerService service = new FreelancerService();

        System.out.println("Результат 1: " + service.calculate(10_000, 3000, 20_000));

        System.out.println("Результат 2: " + service.calculate(100_000, 60_000, 150_000));
    }
}