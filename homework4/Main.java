package homework4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        returnInvertedList();
//        operationsWithLinkedList();
//        cancelLastOperationCalculator();
    }


    /**Задача 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/
    private static void returnInvertedList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(invertedList(list));
    }
    private static List<Integer> invertedList(List<Integer> list) {
        List<Integer> resultlist = new LinkedList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            resultlist.add(list.get(i));
        }
        return resultlist;
    }
    /** Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец
    очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент
    из очереди, не удаляя.
     */

    private static void operationsWithLinkedList() {
        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        enqueue(5, queue);
        System.out.println(queue);
        System.out.println(dequeue(queue));
        System.out.println(queue);
        System.out.println(first(queue));
        System.out.println(queue);
    }
    private static void enqueue(int element, Deque<Integer> queue) {
        queue.addLast(element);
    }
    private static int dequeue(Deque<Integer> queue) {
        return queue.pollFirst();
    }
    private static int first(Deque<Integer> queue) {
        return queue.peekFirst();
    }
    /** Задача 3. В калькулятор добавьте возможность отменить последнюю операцию.*/
    private static void cancelLastOperationCalculator() {
        Deque<Integer> queue = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            int num = calculator();
            queue.addLast(num);
            System.out.println(queue);
            System.out.println("Для отмены действия введите 'отмена'");
            System.out.println("Для выхода из калькулятора введите 'выход'");
            Scanner scanner = new Scanner(System.in);
            String back = scanner.next();

            if (back.equals("отмена")) {
                queue.pollFirst();
            }
            if (back.equals("выход")) {
                flag = false;
            }
        }
    }
    private static int calculator() {
        System.out.println("Введите число а: ");
        Scanner enterNumber = new Scanner(System.in);
        int a = enterNumber.nextInt();
        System.out.println("Введите число b: ");
        int b = enterNumber.nextInt();
        System.out.println("Введите операцию (+,-,*,/): ");
        char c = enterNumber.next().charAt(0);
        if(c == '+') {
            return sum(a, b);
        } else if (c == '-') {
            return difference(a, b);
        } else if (c == '*') {
            return multiplication(a, b);
        } else if (c == '/') {
            return division(a, b);
        } else {
            System.out.println("Введены неверные значения");
            return 0;
        }
    }
    private static int sum(int a, int b) {
        return a+b;
    }
    private static int difference(int a, int b) {
        return a-b;
    }
    private static int multiplication(int a, int b) {
        return a*b;
    }
    private static int division(int a, int b) {
        return a/b;
    }
    }
