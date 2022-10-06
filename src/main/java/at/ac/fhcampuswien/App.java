package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner eingabe = new Scanner(System.in);
        int counter = 0;
        float biggest = 0;
        while(true){
            counter++;
            System.out.print("Number "+counter+": ");
            float zahl = eingabe.nextFloat();
            if (zahl > biggest) {
                biggest = zahl;
            }
            if(counter == 1 && zahl <= 0) {
                System.out.println("No number entered.");
                break;
            } else if(zahl <= 0) {
                System.out.print("The largest number is ");
                System.out.format("%.2f\n", biggest);
                break;
            }
        }
    }

    //todo Task 2
    public void stairs(){
        Scanner eingabe = new Scanner(System.in);
        System.out.print("n: ");
        int row = eingabe.nextInt();
        if (row <= 0) {
            System.out.println("Invalid number!");
        } else {
            int count = 1;
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++, count++) {
                    System.out.print(count+" ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        int space = 5;
        int punkt = 1;
        for(int i=1; i <= 6; i++) {
            for(int b=1; b <= space; b++) {
                System.out.print(" ");
            }
            for(int b=1; b <= punkt; b++) {
                System.out.print("*");
            }
            System.out.print("\n");
            punkt++;
            punkt++;
            space--;
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner eingabe = new Scanner(System.in);
        int counter = 0;
        int neg = 0;
        int sum = 0;
        float avg = 0;
        while(true){
            counter++;
            System.out.print("Mark " + counter + ": ");
            int note = eingabe.nextInt();
            while(true) {
                if (note < 0 || note > 5) {
                    System.out.println("Invalid mark!");
                    counter--;
                    break;
                } else {
                    if (note == 5) {
                        neg++;
                    }
                    sum = note + sum;
                    break;
                }
            }
            if (note == 0) {
                counter--;
                if (counter != 0) {
                    avg = (float)sum/counter;
                }
                System.out.print("Average: ");
                System.out.format("%.2f\n", avg);
                System.out.println("Negative marks: "+ neg);
                break;
            }
        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();
/*
        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();
*/
        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();
/*
        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
 */
    }
}