package com.playtika.sweets.entity;


public class Marmalade extends Sweets {

    private String name;
    private double price;
    private int weight;
    private String form;
    private String taste;
    private int sugarEmount;

    public Marmalade(String name, double price, int weight, String form, String taste, int sugarEmount) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.form = form;
        this.taste = taste;
        this.sugarEmount = sugarEmount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getForm() {
        return form;
    }

    @Override
    public String getTaste() {
        return taste;
    }

    @Override
    public int getSugarEmount() {
        return sugarEmount;
    }
}
