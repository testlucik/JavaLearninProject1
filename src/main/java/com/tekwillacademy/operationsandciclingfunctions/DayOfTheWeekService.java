package com.tekwillacademy.operationsandciclingfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        //Enter the day name and write in the console the day number

        String nameOfTheDay = "Monday";

        int numberOfTheDay;

        switch (nameOfTheDay.toUpperCase()) {
            case "MONDAY":
                numberOfTheDay = 1;
                System.out.println("A Monday case has been discovered");
                break;

            case "TUESDAY":
                numberOfTheDay = 2;
                System.out.println("A Tuesday case has been discovered");
                break;

            case "WEDNESDAY":
                numberOfTheDay = 3;
                System.out.println("A Wednesday case has been discovered");
                break;

            case "THURSDAY":
                numberOfTheDay = 4;
                System.out.println("A Thursday case has been discovered");
                break;

            case "FRIDAY":
                numberOfTheDay = 5;
                System.out.println("A Friday case has been discovered");
                break;

            case "SATURDAY":
                numberOfTheDay = 6;
                System.out.println("A Saturday case has been discovered");
                break;

            case "SUNDAY":
                numberOfTheDay = 7;
                System.out.println("A Sunday case has been discovered");
                break;

            default:
                numberOfTheDay = 0;
                System.out.println("There is not such day defined in the programme");

        }
        System.out.println(numberOfTheDay);

    }
}
