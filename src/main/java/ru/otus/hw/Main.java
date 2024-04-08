package  ru.otus.hw;
import java.util.Scanner;


public class Main  {
    public static void main(String[] args) {
        greetings();
        checkSign(1, 5, 10);
        selectCoulour();
        compareNumbers();
        addOrSubtractAndPrint(25,30, true);
    }

    public static void greetings() {
        System.out.print("Hello\nWorld\nFrom\nJava\n");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("result is positive");

        } else {
            System.out.println("result is negative");
        }
    }


    public static void selectCoulour() {

        int data = 1;

        if (data < 10) {

            System.out.println("Red");
        } else if (data <= 20 && data >= 10) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment) {
            System.out.println(initValue+delta);

        } else {
            System.out.println(initValue-delta);
        }
    }
}

