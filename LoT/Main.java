package LoT;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();

        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1, "Кукла", 20));
        toys.add(new Toy(2, "Мяч", 50));
        toys.add(new Toy(3, "Конструктор", 10));
        toys.add(new Toy(4, "Мягкая игрушка", 40));
        toys.add(new Toy(5, "Настольная игра", 5));

        int numberOfPrizes = 10; // число призов

        controller.fileWriter(toys, "lottery_result.txt", numberOfPrizes);
        System.out.println("С результатами лотереи можно ознакомиться\nв текстовом файле 'lottery_result.txt'");
    }

}