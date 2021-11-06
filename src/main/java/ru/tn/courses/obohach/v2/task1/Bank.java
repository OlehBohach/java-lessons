package ru.tn.courses.obohach.v2.task1;

import java.util.concurrent.ThreadLocalRandom;

public class Bank {
    float dollar_buy_price;
    float dollar_sell_price;
    public static void main(String[] args) {

    }
    public Bank(){
        this.dollar_buy_price = ThreadLocalRandom.current().nextFloat (0,100);
        this.dollar_sell_price = ThreadLocalRandom.current().nextFloat (0,100);
    }
}
