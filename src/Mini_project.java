
import java.util.Scanner;

public class Mini_project {

    private static final Scanner in = new Scanner(System.in);
    private static boolean isNumber;
    private static final double pie = 3.14285714286;


    public static void main(String[] args) {

        boolean quit = false;

        while (!quit) {

            menu();
            String choice = in.next();


            switch (choice) {

                case "1":
                    calcVolumeSphere();
                    break;
                case "2":
                    calcVolumeCylinder();
                    break;
                case "3":
                    calcFraction();
                    break;
                case "4":
                    calcSum();
                    break;
                case "5":
                    calcOfCalcPoint();
                    break;
                case "0":
                    quit = isQuit();
                    break;
                default:
                    System.out.println("Invalid choice, only numbers 1 to 5 and 0!");
                    break;

            }
        }


    }

    private static boolean isQuit() {
        boolean quit;
        quit = true;
        System.out.println("Quitting, Thank you!");
        sleep(500);
        System.exit(1);
        return quit;
    }

    private static void calcOfCalcPoint() {
        int k = getValue();
        int x = getValue();
        int m = getValue();
        if(k <= 0 || x <= 0 || m <= 0){
            System.out.println("Only positive numbers, try again");
            sleep(1000);
            calcOfCalcPoint();
        }
        else {
            double b = calcPoint(k, x, m);
            System.out.printf("y = %d * %d + %d %ny = %.0f%n", k, x, m, b);
            sleep(2000);
        }
    }

    private static void calcVolumeSphere() {
        int radius = getValue();
        if (radius <= 0) {
            System.out.println("Only positive numbers, try again");
            sleep(1000);
            calcVolumeSphere();
        } else {
            double sphere = volumeOfSphere(radius);
            System.out.printf("The volume of Sphere with the radius %d is %.2f cm3%n", radius, sphere);
            sleep(1500);

        }
    }

    private static void calcVolumeCylinder() {
        int radius1 = getValue();
        int height = getValue();
        if (radius1 <= 0 || height <= 0) {
            System.out.println("Only positive numbers, try again");
            sleep(1000);
            calcVolumeCylinder();
        } else {
            double cylinder = volumeOfCylinder(radius1, height);
            System.out.printf("The volume of Cylinder with the radius %d and height of %d is %.2f cm3%n", radius1, height, cylinder);
            sleep(1500);
        }
    }

    private static void calcSum() {
        int r = getValue();
        int h = getValue();
        if (r <= 0 || h <= 0) {
            System.out.println("Only positive numbers, try again");
            sleep(1000);
            calcSum();
        }
        else {
            double a = sum(r, h);
            System.out.printf("Sum of %d + %d = %.0f%n", r, h, a);
            sleep(2000);
        }
    }

    private static void calcFraction() {
        int num = getValue();
        int den = getValue();
        if (den <= 0 || num <= 0) {
            System.out.println("Only positive numbers, closing.. Try again");
            sleep(1000);
            calcFraction();
        } else {
            String fraction = fraction(num, den);
            System.out.println("The mixed fraction is: " + fraction);
            sleep(2000);
        }
    }

    public static void menu() {

        System.out.println("\nWhat do you want to calculate? Press 1-5 or 0 to quit.\n");

        System.out.println("1. Volume of Sphere");

        System.out.println("2. Volume of Cylinder");

        System.out.println("3. Fraction");

        System.out.println("4. Sum");

        System.out.println("5. Calc Point");

        System.out.println("0. Quit");

    }


    public static void sleep(int r) {

        try
        {
            Thread.sleep(r);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


    public static int sum(int r, int h) {

        int answer = r + h;

        return answer;
    }


    public static int getValue() {

        do {
            System.out.print("Give me a number: ");
            if (in.hasNextInt()) {
                int value = in.nextInt();
                isNumber = false;
                return value;

            } else {
                System.out.println("Only positive numbers, try again");
                isNumber = true;
                in.next();
                in.reset();
            }
        } while (isNumber);

        return 1;
    }


    public static double volumeOfSphere(int r) {

        double sphere = (4 * pie * (r * r * r)) / 3;
        return sphere;
    }

    public static double volumeOfCylinder(int r, int h) {

        double cylinder = pie * ((r * r) * h);
        return cylinder;
    }

    public static double calcPoint(int k, int x, int m) {

        double calcPoint = k * x + m;
        return calcPoint;
    }

    public static String fraction(int numerator, int denominator) {

        String mixedNum;
        int wholeNum = numerator / denominator;
        int fraction = numerator % denominator;
        if (numerator > denominator) {
            if (fraction == 0) {
                mixedNum = (wholeNum + ".");
                return mixedNum;
            } else {
                mixedNum = (wholeNum + " " + fraction + "/" + denominator);
                return mixedNum;
            }
        } else {
            mixedNum = (numerator + "/" + denominator);
            return mixedNum;
        }
    }
}
