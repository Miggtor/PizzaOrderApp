package com.ifz2126006.pizzaorder;

public class Pizza {
    double pizza_size_price;
    double tomato_price = 0;
    double ham_price = 0;

    double bacon_price = 0;
    double mushroom_price = 0;
    double spinach_price = 0;
    double salami_price = 0;
    double pepperoni_price = 0;
    double Sucuk_price = 0;

    public Pizza() {
    }

    public double getBacon_price() {
        return bacon_price;
    }

    public void setBacon_price(double bacon_price) {
        this.bacon_price = bacon_price;
    }

    public double getPizza_size_price() {
        return pizza_size_price;
    }

    public void setPizza_size_price(double pizza_size_price) {
        this.pizza_size_price = pizza_size_price;
    }

    public double getTomato_price() {
        return tomato_price;
    }

    public double getHam_price() {
        return ham_price;
    }

    public void setHam_price(double ham_price) {
        this.ham_price = ham_price;
    }

    public void setTomato_price(double tomato_price) {
        this.tomato_price = tomato_price;
    }

    public double getMushroom_price() {
        return mushroom_price;
    }

    public void setMushroom_price(double mushroom_price) {
        this.mushroom_price = mushroom_price;
    }

    public double getSpinach_price() {
        return spinach_price;
    }

    public void setSpinach_price(double spinach_price) {
        this.spinach_price = spinach_price;
    }

    public double getSalami_price() {
        return salami_price;
    }

    public void setSalami_price(double salami_price) {
        this.salami_price = salami_price;
    }

    public double getPepperoni_price() {
        return pepperoni_price;
    }

    public void setPepperoni_price(double pepperoni_price) {
        this.pepperoni_price = pepperoni_price;
    }

    public double getSucuk_price() {
        return Sucuk_price;
    }

    public void setSucuk_price(double sucuk_price) {
        Sucuk_price = sucuk_price;
    }
}