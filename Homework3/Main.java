package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        mergeSortInit();
        removeEvenNumbers();
        rangeSort();

    }
//    Задача 1. Реализовать алгоритм сортировки слиянием
    private static void mergeSortInit(){
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));
    }
    private static int[] mergeSort(int[] array0){
        int[] buffer1 = Arrays.copyOf(array0, array0.length);
        int[] buffer2 = new int[array0.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array0.length);
        return result;
    }
    private static int[] mergesortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    //    Задача 2. Пусть дан произвольный список целых чисел, удалить из него четные числа
    private static void removeEvenNumbers(){
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10);
            array.add(value);
        }
        System.out.println(Arrays.asList(array));
        for (int i = 0; i < array.size(); ) {
            if(array.get(i) % 2 == 0) {
                array.remove(i);
            } else {
                ++i;
            }
        }
        System.out.println(Arrays.asList(array));
    }
    //Задача 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    private static void rangeSort(){
        List<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(51);
            array.add(value);
        }
        System.out.println(Arrays.asList(array));
        int max = array.get(0);
        int min = array.get(0);
        int middle = 0;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) > max) {
                max = array.get(i);
            }
            if(array.get(i) < min) {
                min = array.get(i);
            }
            middle = middle + array.get(i);
        }
        middle = middle / array.size();
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее число: " + middle);
    }
}
