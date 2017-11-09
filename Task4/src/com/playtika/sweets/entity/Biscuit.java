package com.playtika.sweets.entity;


public class Biscuit extends Sweets {


    private String name;
    private double price;
    private int weight;
    private String form;
    private String taste;
    private int sugarEmount;

    public Biscuit(String name, double price, int weight, String form, String taste, int sugarEmount) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Biscuit biscuit = (Biscuit) o;

        if (Double.compare(biscuit.price, price) != 0) return false;
        if (weight != biscuit.weight) return false;
        if (sugarEmount != biscuit.sugarEmount) return false;
        if (name != null ? !name.equals(biscuit.name) : biscuit.name != null) return false;
        if (form != null ? !form.equals(biscuit.form) : biscuit.form != null) return false;
        return taste != null ? taste.equals(biscuit.taste) : biscuit.taste == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + weight;
        result = 31 * result + (form != null ? form.hashCode() : 0);
        result = 31 * result + (taste != null ? taste.hashCode() : 0);
        result = 31 * result + sugarEmount;
        return result;
    }
}


