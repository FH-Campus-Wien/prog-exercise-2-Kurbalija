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
        int counter = 1;
        if (row <= 0) {
            System.out.print("Invalid number!");
        }
        for (int b = 1; b <= row ; b++) {
            for (int i = 1; i <= counter || i <=10; i++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.print("\n");
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
        // input your solution here
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