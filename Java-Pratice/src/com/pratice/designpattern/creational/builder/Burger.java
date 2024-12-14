package com.pratice.designpattern.creational.builder;

public class Burger {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean onion;
    private boolean tomato;

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", egg=" + egg +
                ", extraCheese=" + extraCheese +
                ", onion=" + onion +
                ", tomato=" + tomato +
                '}';
    }

    private Burger(BurgerBuilder burgerBuilder){

        this.egg=burgerBuilder.egg;
        this.onion=burgerBuilder.onion;
        this.extraCheese=burgerBuilder.extraCheese;
        this.size=burgerBuilder.size;
        this.tomato= burgerBuilder.tomato;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public static class BurgerBuilder{
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean onion;
        private boolean tomato;


        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }

        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }

        public BurgerBuilder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }

}
