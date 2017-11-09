package com.playtika.sweets.entity;


public abstract class Sweets {

    public abstract String getName();

    public abstract double getPrice();

    public abstract int getWeight();

    public abstract String getForm();

    public abstract String getTaste();

    public abstract int getSugarEmount();


    @Override
    public String toString() {
        return "" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice() +
                ", weight=" + this.getWeight() +
                ", form='" + this.getForm() + '\'' +
                ", taste='" + this.getTaste() + '\'' +
                ", sugarEmount=" + this.getSugarEmount() +
                "";
    }
}

