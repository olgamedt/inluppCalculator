
import java.util.Scanner;

public class Mini_project {

    private static Scanner in = new Scanner(System.in);
    private static boolean isNumber;
    private static boolean quit;
    private static final double pie = 3.14285714286;


    public static void menu() {

        System.out.println("\nWhat do you want to calculate? Press 1-5 or 0 to quit.\n");

        System.out.println("1. Volume of Sphere");

        System.out.println("2. Volume of Cylinder");

        System.out.println("3. Fraction");

        System.out.println("4. Sum");

        System.out.println("5. Calc Point");

        System.out.println("0. Quit");

    }


    public static void sleep(int r){

        try {

            Thread.sleep(r);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }


    public static double sum(int r, int h) {

        double answer = r + h;

        return answer;
    }

    public static int getValue() {

        isNumber = true;

        do {

            System.out.print("Give me a number: ");

            if (in.hasNextInt()) {
                int value = in.nextInt();
                isNumber = false;
                return value;
            } else {
                System.out.println("Only integers!");
                isNumber = true;
                in.next();
                in.reset();
            }

        } while (isNumber);

        return 1;
    }


    public static double volumeOfSphere(int r) {

        double sphere = (4 / 3) * pie * (r * r * r);
        return sphere;
    }

    public static double volumeOfCylinder(int r, int h) {

        double cylinder = pie * ((r * r) * h);
        return cylinder;
    }

    public static double calcPoint(int k, int x, int m){

        double calcPoint = k * x + m;
        return calcPoint;

    }

    public static String fraction(int numerator, int denominator){

    }

    public static void main(String[] args) {

        quit = false;

        while (!quit) {

            menu();
            String choice = in.next();


            switch (choice) {

                case "1":
                    int radius = getValue();
                    double sphere = volumeOfSphere(radius);
                    System.out.printf("The volume of Sphere with the radius %d is %.2f cm3%n", radius, sphere);
                    sleep(1500);
                    break;
                case "2":
                    int radius1 = getValue();
                    int height = getValue();
                    double cylinder = volumeOfCylinder(radius1, height);
                    System.out.printf("The volume of Cylinder with the radius %d and height of %d is %.2f cm3%n", radius1, height, cylinder);
                    sleep(1500);
                    break;
                case "3":
                    //do something
                    break;
                case "4":
                    int r = getValue();
                    int h = getValue();
                    double a = sum(r, h);
                    System.out.printf("Sum of %d + %d = %.0f%n", r, h, a);
                    sleep(2000);
                    break;
                case "5":
                    int k = getValue();
                    int x = getValue();
                    int m = getValue();
                    double b = calcPoint(k, x, m);
                    System.out.printf("y = %d * %d + %d %ny = %.0f%n", k, x, m, b);
                    sleep(2000);
                    break;
                case "0":
                    quit = true;
                    System.out.println("Quitting, Thank you!");
                    sleep(500);
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid choice, only numbers!");
                    break;

            }
        }


    }
}
