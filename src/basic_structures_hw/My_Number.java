package basic_structures_hw;

import java.util.Arrays;
import java.util.Scanner;

//this method write a numbers from 0 till 10
public class My_Number {
    public static void numberWriter() throws java.util.InputMismatchException {
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            while (num < 0 || num > 10) {
                System.out.println("Please enter correct number. Number should be in 0-10");
                num = sc.nextInt();
            }
            if (num >= 0 || num <= 10)
                switch (num) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Ten");
                        break;
                }
        } catch (
                java.util.InputMismatchException e) {
            System.out.println("Wrong data. Sorry but you should enter a number");
            numberWriter();
        }
    }

    // method returns min max and avg value of array
    public static void numCounter(int count, double minValue, double maxValue) throws java.util.InputMismatchException {
        double[] array = new double[count];
        for (int i = 0; i < count; i++) {
            array[i] = (Math.random() * ((maxValue - minValue) + 1)) + minValue;
        }
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter MIN to show min number");
        System.out.println("Enter MAX to show max number");
        System.out.println("Enter AVG to show avarage");
        try {
            String s = sc.nextLine();
            switch (s) {
                case "MIN":
                    double min = array[0];
                    for (int i = 0; i < count; i++) {
                        if (min > array[i]) {
                            min = array[i];
                        }
                    }
                    System.out.println(min);
                    break;
                case "MAX":
                    double max = array[0];
                    for (int i = 0; i < count; i++) {
                        if (max < array[i]) {
                            max = array[i];
                        }
                    }
                    System.out.println(max);
                    break;
                case "AVG":
                    double avg = 0;
                    for (int i = 0; i < count; i++)
                        avg += array[i];
                    avg /= count;
                    System.out.println(avg);
                    break;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Enter correct operration");
        }
    }
}


