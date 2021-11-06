package ru.tn.courses.obohach.v2.task1;
/*
Сортировка выбором. Дана последовательность чисел а1, а2, ..., аn.
Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый – на место наибольшего.
Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Subtask_3 {
    public static void main(String[] args) {
        int[] array_to_sort = new int[10];
        for (int counter = 0; counter < array_to_sort.length; counter++) {
            array_to_sort[counter] = ThreadLocalRandom.current().nextInt();
        }
        System.out.println("Array before selection sort = " + Arrays.toString(array_to_sort));
        System.out.println("Array after selection sort = " + Arrays.toString(selection_sort(array_to_sort)));
    }
    public static int[] selection_sort(int[] array_to_process) {
        for (int counter = 0; counter < array_to_process.length; counter++) {
            int position = counter;
            int max_value = array_to_process[counter];
            for (int counter2 = counter + 1; counter2 < array_to_process.length; counter2++) {
                if(array_to_process[counter2] > max_value){
                    position = counter2;
                    max_value = array_to_process[counter2];
                }
            }
            array_to_process[position] = array_to_process[counter];
            array_to_process[counter] = max_value;
        }
        return array_to_process;
    }
}
