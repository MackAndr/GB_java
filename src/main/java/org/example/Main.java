package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите n: ");
        Scanner input_n= new Scanner(System.in);
        String num = input_n.nextLine();
        int number = Integer.parseInt(num);
        Task1(number);
        Task2();
        Task3();



    }
    // Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void Task1 (int n){
        int triangleN = n * (n + 1) / 2;
        int factorialN = 1;
        int count = 1;
        while (count <= n){
            factorialN = factorialN * count;
            count++;
        }

        System.out.println("n-ое треугольное число = " + triangleN + ", факториал n! = " + factorialN);
    }

    // Задача 2. Вывести все простые числа от 1 до 1000
    public static boolean SimpleNum (int numberA){
        for (int i = 2; i < numberA; i++) {
            if (numberA % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void Task2 (){
        int numberA = 1000;
        System.out.println("Все простые числа от 1 до 1000: ");
        for (int i = 1; i < numberA; i++) {
            if (SimpleNum(i) == true){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //    Задача 3. Реализовать простой калькулятор
    public static void Task3(){
        System.out.println("Введите выражение: ");
        Scanner str = new Scanner(System.in);
        String expression = str.nextLine();
        String expr1 = "";  // часть введенной строки - первое число
        String expr2 = "";  // часть введенной строки - второе число
        int temp = 0;       // маркер, где делить строук на два числа
        int mat = 0;        // операция (+, -, *, /)
        double result = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+'){
                break;
            } else if (expression.charAt(i) == '-') {
                    break;
                } else if (expression.charAt(i) == '*') {
                    break;
                } else if (expression.charAt(i) == '/') {
                break;
            }
            else{
            expr1 = expr1 + expression.charAt(i);
            temp = i+1;
            }
        }

//        expr1 = expr1.trim();
        double number1 = Double.parseDouble(expr1.trim());

        for (int i = temp; i < expression.length(); i++) {
            if (expression.charAt(i) == '+'){
                mat = 1;
            } else if (expression.charAt(i) == '-') {
                mat = 2;;
            } else if (expression.charAt(i) == '*') {
                mat = 3;
            } else if (expression.charAt(i) == '/') {
                mat = 4;
            }
            else{
                expr2 = expr2 + expression.charAt(i);
            }
        }
//        expr2 = expr2.trim();
        double number2 = Double.parseDouble(expr2.trim());

        if (mat == 1){
            result = number1 + number2;
        } else if (mat == 2) {
            result = number1 - number2;
        } else if (mat == 3) {
            result = number1 * number2;
        } else if (mat == 4) {
            result = number1 / number2;
        }
        System.out.printf("%.2f",result);
    }

}