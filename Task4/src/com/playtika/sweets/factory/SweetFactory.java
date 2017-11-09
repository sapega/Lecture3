package com.playtika.sweets.factory;


import com.playtika.sweets.entity.*;

public class SweetFactory {

    public static Sweets getSweets (String type, String name, double price, int weight, String form, String taste, int sugarEmount){
        if("Biscuit".equalsIgnoreCase(type)) return new Biscuit(name,price,weight,form,taste,sugarEmount);
        else if("Chocolate".equalsIgnoreCase(type)) return new Chocolat(name,price,weight,form,taste,sugarEmount);
        else if ("Drops".equalsIgnoreCase(type)) return  new Drops(name,price,weight,form,taste,sugarEmount);
        else if ("Marmalade".equalsIgnoreCase(type)) return new Marmalade(name,price,weight,form,taste,sugarEmount);

        return null;
    }
}

