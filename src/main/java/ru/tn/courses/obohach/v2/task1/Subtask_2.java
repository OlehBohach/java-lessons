package ru.tn.courses.obohach.v2.task1;
import java.util.ArrayList;
import java.util.Collections;


/*
У вас есть доллары. Вы хотите обменять их на рубли.
Есть информация о стоимости купли-продажи в банках города. В городе N банков.
Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на рубли.
 */
public class Subtask_2 {
    public static void main(String[] args) {
        ArrayList<Float> prices = new ArrayList<>();
        ArrayList<Bank> city_banks = new ArrayList<>(){{
             add(new Bank());
             add(new Bank());
             add(new Bank());
             add(new Bank());
             add(new Bank());
            }};
        System.out.println("Most profitable offer " + chose_profitable_bank(city_banks));
    }
    public static float chose_profitable_bank(ArrayList<Bank> banks_to_compare){
        ArrayList<Float> prices_to_compare = new ArrayList<>();
        for(Bank bank:banks_to_compare)
            prices_to_compare.add(bank.dollar_sell_price);
        System.out.println("Banks sell 1 dollar for - " + prices_to_compare);
        return Collections.min(prices_to_compare);
    }

}
