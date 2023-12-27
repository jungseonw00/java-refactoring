package ch07;

import static ch07.ItemType2.BOOK;
import static ch07.ItemType2.DVD;
import static ch07.ItemType2.SOFTWARE;

public class Main {
    public static void main(String[] args) {
        Item book = new Item(
            BOOK,
            "세계 역사",
            4800
        );

        Item dvd = new Item(
            DVD,
            "뉴욕의 꿈 특별판",
            3000
        );

        Item soft = new Item(
            SOFTWARE,
            "튜링 머신 에뮬레이터",
            3200
        );

        System.out.println("book = " + book.toString());
        System.out.println("dvd = " + dvd.toString());
        System.out.println("soft = " + soft.toString());
    }
}
