package homework5;

import static homework5.HeapSort.printArray;
import static homework5.WokersList.pullWokersList;

public class Main {
    public static void main(String[] args) {
        telephoneNumber();
        wokers();
        pullHeapSort();

    }

    /** Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
     * что 1 человек может иметь несколько телефонов.
      */
    private static void telephoneNumber() {
        PhoneBook people = new PhoneBook();
        people.add("Светлана Петрова", "2668453");
        people.add("Кристина Белова", "2435353");
        people.add("Анна Крутова", "2286535");
        people.add("Анна Крутова", "1975024");
        people.add("Петр Чернышов", "2777701");

        System.out.println(people.find("Анна Крутова"));
    }

    /** Задача 2. Пусть дан список сотрудников:
     Иван Иванов
     Светлана Петрова
     Кристина Белова
     Анна Мусина
     Анна Крутова
     Иван Юрин
     Петр Лыков
     Павел Чернов
     Петр Чернышов
     Мария Федорова
     Марина Светлова
     Мария Савина
     Мария Рыкова
     Марина Лугова
     Анна Владимирова
     Иван Мечников
     Петр Петин
     Иван Ежов
     Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
     Отсортировать по убыванию популярности.
     */

    private static void wokers() {
        WokersList people = new WokersList();
        people.add("Иван", "Иванов");
        people.add("Светлана", "Петрова");
        people.add("Кристина", "Белова");
        people.add("Анна", "Мусина");
        people.add("Анна", "Крутова");
        people.add("Иван", "Юрин");
        people.add("Петр", "Лыков");
        people.add("Павел", "Чернов");
        people.add("Петр", "Чернышов");
        people.add("Мария", "Федорова");
        people.add("Марина", "Светлова");
        people.add("Мария", "Савина");
        people.add("Мария", "Рыкова");
        people.add("Марина", "Лугова");
        people.add("Анна", "Владимирова");
        people.add("Иван", "Мечников");
        people.add("Петр", "Петин");
        people.add("Иван", "Ежов");

        pullWokersList();
    }

    /** Задача 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
     */
    public static void pullHeapSort() {
        int arr[] = {15, 58, 1, 58, 99, 6, 21, 38, 81};
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        System.out.println("Пирамидальная сортировка: ");
        printArray(arr);
    }

}
