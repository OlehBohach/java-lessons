package ru.tn.courses.obohach.v2.task1;

//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Subtask_1 {
    public static void main(String[] args) {
        ArrayList<Integer> result = find_zero_positions(generate_integer_list());
        System.out.println("Zero positions = " + result);
    }
    public static ArrayList<Integer> generate_integer_list(){
        ArrayList<Integer> list_to_return = new ArrayList<>();
        int size_of_list = ThreadLocalRandom.current().nextInt(1, 10);
        for(int counter = 0; counter < size_of_list; counter++)
            list_to_return.add(ThreadLocalRandom.current().nextInt(0, 2));
        System.out.println("Generated list = " + list_to_return);
        return list_to_return;
    }
    public static ArrayList<Integer> find_zero_positions(ArrayList<Integer> list_to_process){
        ArrayList<Integer> zero_positions = new ArrayList<>();
        for(int counter = 0; counter < list_to_process.size(); counter++)
            if (list_to_process.get(counter) == 0)
                zero_positions.add(counter);
        return zero_positions;
    }
}
