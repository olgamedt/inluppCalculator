
import java.util.Scanner;

public class Mini_project {

    public static Scanner in = new Scanner(System.in);
    public static boolean isNumber;


    public static void menu() {

        System.out.println("What do you want to calculate? Press 1-5 or 0 to quit.\n");

        System.out.println("1. Volume of Sphere");

        System.out.println("2. Volume of Cylinder");

        System.out.println("3. Fraction");

        System.out.println("4. Sum");

        System.out.println("5. Calc Point");

        System.out.println("0. Quit");

    }


    public static double sum(int r, int h) {

        double answer = r + h;
        System.out.printf("Sum of %d + %d = %.1f%n", r, h, answer);

        try {

            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        return answer;

    }

    public static int getValue(){

        isNumber = true;

        int value = 0;

        do{

            System.out.print("Give me a number: ");

            if(in.hasNextInt()){
                value = in.nextInt();
                isNumber = false;
            }
            else {
                System.out.println("Only numbers");
                isNumber = true;
                in.next();
                in.reset();
            }

        } while (isNumber);

        return value;
    }



    public static void main(String[] args) {


        boolean quit = false;


        while (!quit) {

            menu();
            String choice = in.next();


            switch (choice) {

                case "1":
                    System.out.println("Choice 1");
                    break;
                case "2":
                    //do something
                    System.out.println("choice 2");
                    break;
                case "3":
                    //do something
                    break;
                case "4":
                    sum(getValue(), getValue());
                    break;
                case "5":
                    //do something
                    break;
                case "0":
                    quit = true;
                    System.out.println("Quitting, Thank you!");
                    System.exit(1);

                    break;
                default:
                    System.out.println("Invalid choice, only numbers!");
                    break;

            }


        }


    }
}
