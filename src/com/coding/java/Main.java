package com.coding.java;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Double firstNum = getFirstNum("Enter First Number : ");
//        System.out.println(String.format("First Number you entered was %s", firstNum));

        Double secondNum = getSecondNum("Enter Second Number : ");
//        System.out.println(String.format("Second Number you entered was %s", secondNum));

        performAction(firstNum,secondNum);

    }
        public static Double getFirstNum (String ask){
            System.out.print(ask);
            Scanner readFirstNum = new Scanner(System.in);
            String readStr1 = readFirstNum.nextLine();
            Double firstDouble = Double.parseDouble(readStr1);
            return firstDouble;
        }

        public static Double getSecondNum (String ask){
            System.out.print(ask);
            Scanner readSecondNum = new Scanner(System.in);
            String readStr2 = readSecondNum.nextLine();
            Double secondDouble = Double.parseDouble(readStr2);
            return secondDouble;
        }

        public static void choices () {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Quotient");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");
        }

        public static double performAction(double first,double second) {
            System.out.println("\nPlease Enter Your Choice Of Operation ? ");
            choices();

            Scanner scanChoice = new Scanner(System.in);
            int choiceOpn = scanChoice.nextInt();

            switch (choiceOpn) {
                case 1:
                    addNum(first,second);
                    break;
                case 2:
                    subNum(first,second);
                    break;
                case 3:
                    mulNum(first,second);
                    break;
                case 4:
                    quoNum(first,second);
                    break;
                case 5:
                    remNum(first,second);
                    break;
                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong Choice.... ! \n\nPlease Enter a Number From List Below !\n\nValid Choices\n");
                    choices();
                    break;

            }
            return -1;
        }

        public static void addNum(double first, double second) {
        double result = first + second;
        System.out.println(result);
        performAction(first,second);
        }

        public static void subNum(double first, double second) {
            double result = first - second;
            System.out.println(result);
            performAction(first,second);
        }

        public static void mulNum(double first, double second) {
            double result = first * second;
            System.out.println(result);
            performAction(first,second);
        }

        public static void quoNum(double first, double second) {
            double result = first / second;
            System.out.println(result);
            performAction(first,second);
        }

        public static void remNum(double first, double second) {
            double result = first % second;
            System.out.println(result);
            performAction(first,second);
        }

    }
