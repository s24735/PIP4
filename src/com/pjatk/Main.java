package com.pjatk;
import java.util.Scanner;

public class Main {

    private static Scanner scanner= null;

    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
        zadanie4();
        zadanie5();
        zadanie6();
        zadanie7();
        }


    private static void zadanie7(){
        System.out.println("Podaj liczbę a: ");
        int number = scanner.nextInt();
        System.out.println("Podaj liczbę b: ");
        int number2 = scanner.nextInt();
        System.out.println("Podaj liczbę n: ");
        int number3 = scanner.nextInt();

        if(number%number3 ==number2%number3){
            System.out.println("Liczby " + number + " i " + number2 + " przystają do siebie modulo " + number3);
        }else {
            System.out.println("Liczby " + number + " i " + number2 + " nie przystają do siebie modulo " + number3);
        }

    }

    private static void zadanie6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę rzeczywistą: ");
        double number = scanner.nextDouble();

        if(number>0){
            System.out.println("Wartość funkcji signum dla: " + number + " to 1.");
        }else if(number==0){
            System.out.println("Wartość funkcji signum dla: " + number + " to 0. ");
        }else if(number<0){
            System.out.println("Wartość funkcji signum dla: " + number + " to -1. ");
        }

    }

    private static void zadanie5(){
        System.out.println("Podaj numer miesiąca: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: luty, marzec, kwiecień, maj, czerwiec, lipiec, sierpień, wrzesień, październik, listopad, grudzień.");
                break;
            case 2:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: marzec, kwiecień, maj, czerwiec, lipiec, sierpień, wrzesień, październik, listopad, grudzień.");
                break;
            case 3:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: kwiecień, maj, czerwiec, lipiec, sierpień, wrzesień, październik, listopad, grudzień.");
                break;
            case 4:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: maj, czerwiec, lipiec, sierpień, wrzesień, październik, listopad, grudzień.");
                break;
            case 5:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: czerwiec, lipiec, sierpień, wrzesień, październik, listopad, grudzień.");
                break;
            case 6:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: lipiec, sierpień, wrzesień, październik, listopad, grudzień.");
                break;
            case 7:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: sierpień, wrzesień, październik, listopad, grudzień.");
                break;
            case 8:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: wrzesień, październik, listopad, grudzień.");
                break;
            case 9:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: październik, listopad, grudzień.");
                break;
            case 10:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: listopad, grudzień.");
                break;
            case 11:
                System.out.println("Do końca roku czekają Cię jeszcze miesiące: grudzień.");
                break;
            case 12:
                System.out.println("Hura! To już koniec roku.");
                break;
            default:
                System.out.println("Nieprawidłowe dane wejściowe");
        }
    }


    private static void zadanie4(){
        System.out.println("Podaj numer miesiąca: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Wspomniał*ś Styczeń.");
                break;
            case 2:
                System.out.println("Wspomniał*ś Luty.");
                break;
            case 3:
                System.out.println("Wspomniał*ś Marzec.");
                break;
            case 4:
                System.out.println("Wspomniał*ś Kwiecień.");
                break;
            case 5:
                System.out.println("Wspomniał*ś Maj.");
                break;
            case 6:
                System.out.println("Wspomniał*ś Czerwiec.");
                break;
            case 7:
                System.out.println("Wspomniał*ś Lipiec.");
                break;
            case 8:
                System.out.println("Wspomniał*ś Sierpień.");
                break;
            case 9:
                System.out.println("Wspomniał*ś Wrzesień.");
                break;
            case 10:
                System.out.println("Wspomniał*ś Październik.");
                break;
            case 11:
                System.out.println("Wspomniał*ś Listopad.");
                break;
            case 12:
                System.out.println("Wspomniał*ś Grudzień.");
                break;
            default:
                System.out.println("Nieprawidłowe dane wejściowe");
        }

    }


    private static void zadanie3() {
        System.out.println("Podaj liczbę całkowitą -10000 < x < 10000");
        int number = scanner.nextInt();

        if(number / 10 == 0){
            System.out.println("Liczba " + number + " jest jednocyfrowa" );
        }
        else if(number / 100 == 0) {
            System.out.println("Liczba " + number + " jest dwucyfrowa");
        }
        else if(number / 1000 == 0){
            System.out.println("Liczba " + number + " jest trzycyfrowa");
        }
        else if(number / 10000 == 0){
            System.out.println("Liczba " + number + " jest czetrocyfrowa");
        } else{
            System.out.println("Zła liczba");
        }

    }


    private static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Wprowadzona liczba: "+ number);

        if(number % 2 == 0) {
            System.out.println("Liczba " + number + " jest podzielna przez 2");
        } else {
            System.out.println(("Liczba " + number + " nie jest podzielna przez 2"));
        }
        if(number % 3 == 0) {
            System.out.println("Liczba " + number + " jest podzielna przez 3");
        } else {
            System.out.println("Liczba " + number + " nie jest podzielna przez 3");
        }
        if(number % 5 ==0) {
            System.out.println("Liczba " + number + " jest podzielna przez 5");
        } else {
            System.out.println("Liczba " + number + " nie jest podzielna przez 5");
        }



    }

    private static double computeTrapeze(double sideA6, double sideB6, double altitude6) {
        return 0.5*(sideA6 + sideB6 * altitude6);
    }

    private static double computeParallelogram(double sideA5, double altitude5) {
        return sideA5*altitude5;
    }

    private static double computeRhomb(double sideA4, double altitude4) {
        return sideA4*altitude4;
    }

    private static double computeRectangle(double sideA, double sideB) {
        return sideA*sideB;
    }

    private static double computeTriangle(double sideA3, double altitude3) {
        return 0.5*sideA3*altitude3;
    }

    private static double computeSquare(double sideA2) {
        return sideA2*sideA2;
    }
    public static void zadanie1(){
        System.out.println("Wybierz figure");
        scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        switch(number){
            case 1:
                System.out.println("Wybrał*ś prostokąt");
                System.out.println("Podaj długość pierwszego boku: ");
                double sideA = scanner.nextDouble();
                System.out.println("Podaj długość drugiego boku: ");
                double sideB = scanner.nextDouble();
                double result = computeRectangle(sideA,sideB);
                System.out.println("Pole prostokąta jest równe: "+ result);
                break;
            case 2:
                System.out.println("Wybrał*ś kwadrat");
                System.out.println("Podaj długość boku: ");
                double sideA2 = scanner.nextDouble();
                double result2 = computeSquare(sideA2);
                System.out.println("Pole kwadratu jest równe: "+ result2);
                break;
            case 3:
                System.out.println("Wybrał*ś trójkąt");
                System.out.println("Podaj długość pierwszego boku: ");
                double sideA3 = scanner.nextDouble();
                System.out.println("Podaj długość wysokości: ");
                double altitude3 = scanner.nextDouble();
                double result3 = computeTriangle(sideA3,altitude3);
                System.out.println("Pole trójkąta jest równe: "+ result3);
                break;
            case 4:
                System.out.println("Wybrał*ś romb");
                System.out.println("Podaj długość boku: ");
                double sideA4 = scanner.nextDouble();
                System.out.println("Podaj długość wysokości: ");
                double altitude4 = scanner.nextDouble();
                double result4 = computeRhomb(sideA4,altitude4);
                System.out.println("Pole rombu jest równe: "+ result4);
                break;
            case 5:
                System.out.println("Wybrał*ś równoległobok");
                System.out.println("Podaj długość boku: ");
                double sideA5 = scanner.nextDouble();
                System.out.println("Podaj długość wysokości: ");
                double altitude5 = scanner.nextDouble();
                double result5 = computeParallelogram(sideA5,altitude5);
                System.out.println("Pole równoległoboku jest równe: "+result5);
                break;
            case 6:
                System.out.println("Wybrał*ś trapez");
                System.out.println("Podaj długość pierwszego boku: ");
                double sideA6 = scanner.nextDouble();
                System.out.println("Podaj długość drugiego boku: ");
                double sideB6 = scanner.nextDouble();
                System.out.println("Podaj długość wysokości: ");
                double altitude6 = scanner.nextDouble();
                double result6 = computeTrapeze(sideA6,sideB6,altitude6);
                System.out.println("Pole trapezu jest równe: "+result6);
                break;
            default:
                System.out.println("Nie wybrał*ś żadnej figury:(");
                break;
        }
    }
}

