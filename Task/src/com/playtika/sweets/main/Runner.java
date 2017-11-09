package com.playtika.sweets.main;


import com.playtika.sweets.builder.Director;
import com.playtika.sweets.builder.Gift;
import com.playtika.sweets.builder.GiftBuilder;
import com.playtika.sweets.builder.NewYearGiftBuilder;
import com.playtika.sweets.entity.*;

public class Runner {
    public static void main(String[] args) throws Throwable {


        Director director = new Director();

        try{
        GiftBuilder newYearGiftBuilder = new NewYearGiftBuilder(
                "New Year Gift", 10, 15, 20, 40);
        director.setGiftBuilder(newYearGiftBuilder);
        director.constructGift();
        Gift gift = director.getGift();
        System.out.println(gift);

        gift.sortSweetsByPrice();

        System.out.println("Gift with sweets sorted by price: " + gift);

        gift.sortSweetsBySugar();
        System.out.println("Gift with sweets sorted by sugar: " + gift);


            Sweets biscuitSweet = new Biscuit("Flaky", 10, 10, "round", "lemon", 5, "wheat");
            Sweets chocolateSweet = new Chocolat("Kar", 4, 5, "flat", "strawberry", 5, "milk");
            Sweets dropsSweet = new Drops("Sik", 5, 10, "round", "mint", 4, "dark");
            Sweets marmaladeSweet = new Marmalade("Jack", 5, 6, "flat", "lemon", 5, "lemon");

            biscuitSweet.makeSweet();
            chocolateSweet.makeSweet();
            dropsSweet.makeSweet();
            marmaladeSweet.makeSweet();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Calling for inappropriate array index");

        } catch (ArrayStoreException e) {
            System.out.println("Array sorted inappropriate manner");

        }catch (AbstractMethodError e){
            System.out.println("Wrong call for abstract method");

        } catch (Exception e) {
            System.out.println("Another exception happened");
        }
    }
}
