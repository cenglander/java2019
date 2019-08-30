package cirkel;

import java.util.Scanner;

public class MyMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int menuChoice;

        do {
            System.out.println("***MENY***\nVälj vilken figur du vill använda.\nSkriv in siffran och tryck Enter.");
            System.out.println("1. Cirkel\n2. Rektangel\n3. Triangel\n0. Avsluta programmet");
            menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1:
                    calculateCircle();
                    break;
                case 2:
                    calculateRectangle();
                    break;
                case 3:
                    calculateTriangle();
                    break;
            }

        } while (menuChoice != 0);
    }

    private static void calculateCircle() {
        int calcChoice;
        System.out.println("Vad är cirkelns radie?");
        double radie = sc.nextDouble();
        Cirkel c1 = new Cirkel(radie);
        System.out.println("Vad vill du räkna ut?\n1. Area\n2. Omkrets\n3. Area och omkrets.");
        calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("Arean är " + c1.area());
        } else if (calcChoice == 2) {
            System.out.println("Omkretsen är " + c1.circumference());
        } else {
            System.out.println("Arean är " + c1.area() + " och omkretsen är " + c1.circumference());
        }
        System.out.println("");
    }

    private static void calculateRectangle() {
        int calcChoice;
        System.out.println("Vad är rektangelns bredd?");
        double width = sc.nextDouble();
        System.out.println("Vad är rektangelns höjd?");
        double height = sc.nextDouble();
        Rectangle r1 = new Rectangle(width, height);
        System.out.println("Vad vill du räkna ut?\n1. Area\n2. Omkrets\n3. Area och omkrets.");
        calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("Arean är " + r1.area());
        } else if (calcChoice == 2) {
            System.out.println("Omkretsen är " + r1.circumference());
        } else {
            System.out.println("Arean är " + r1.area() + " och omkretsen är " + r1.circumference());
        }
        System.out.println("");
    }

    private static void calculateTriangle() {
        int calcChoice;
        System.out.println("Vad är triangelns bredd?");
        double width = sc.nextDouble();
        System.out.println("Vad är triangelns höjd?");
        double height = sc.nextDouble();
        Triangle t1 = new Triangle(width, height);
        System.out.println("Vad vill du räkna ut?\n1. Area\n2. Omkrets\n3. Area och omkrets.");
        calcChoice = sc.nextInt();
        if (calcChoice == 1) {
            System.out.println("Arean är " + t1.area());
        } else if (calcChoice == 2) {
            System.out.println("Omkretsen är " + t1.circumference());
        } else {
            System.out.println("Arean är " + t1.area() + " och omkretsen är " + t1.circumference());
        }
        System.out.println("");
    }

}
