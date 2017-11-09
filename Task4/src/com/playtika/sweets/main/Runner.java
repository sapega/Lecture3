package com.playtika.sweets.main;


import com.playtika.sweets.entity.Sweets;
import com.playtika.sweets.factory.SweetFactory;

public class Runner {
    public static void main(String[] args) {

        Sweets biscuit = SweetFactory.getSweets("Biscuit", "Arahis", 10, 3, "round", "vanilla", 3);
        Sweets chocolate = SweetFactory.getSweets("Chocolate", "Janer", 15, 5, "square", "chocolate", 7);
        Sweets drops = SweetFactory.getSweets("Drops", "Ti-tak", 10, 3, "round", "mint", 1);
        Sweets marmalade = SweetFactory.getSweets("Marmalade", "Bon-Paris", 11, 4, "star", "orange", 5);

        System.out.println("Biscuit: " + biscuit);
        System.out.println("Chocolate: " + chocolate);
        System.out.println("Drops: " + drops);
        System.out.println("Marmalade: " + marmalade);
    }

}

