package com.samwei12.dp.creational.builder.burger;

/**
 * 文件描述
 *
 * @author samwei12
 * @date 2024/9/5
 */
public class Burger {
    private int size;
    private Boolean cheese;
    private Boolean lettuce;
    private Boolean tomato;
    private Boolean bacon;
    private Boolean onion;
    private Boolean pickles;
    private Boolean mayo;
    private Boolean ketchup;
    private Boolean mustard;
    private Boolean salad;
    private Boolean fries;
    private Boolean drink;
    private Boolean dessert;

    public Burger(int size, Boolean cheese, Boolean lettuce, Boolean tomato, Boolean bacon, Boolean onion,
        Boolean pickles,
        Boolean mayo, Boolean ketchup, Boolean mustard, Boolean salad, Boolean fries, Boolean drink, Boolean dessert) {
        this.size = size;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
        this.onion = onion;
        this.pickles = pickles;
        this.mayo = mayo;
        this.ketchup = ketchup;
        this.mustard = mustard;
        this.salad = salad;
        this.fries = fries;
        this.drink = drink;
        this.dessert = dessert;
    }

    static class BurgerBuilder {
        private final int size;
        private Boolean cheese;
        private Boolean lettuce;
        private Boolean tomato;
        private Boolean bacon;
        private Boolean onion;
        private Boolean pickles;
        private Boolean mayo;
        private Boolean ketchup;
        private Boolean mustard;
        private Boolean salad;
        private Boolean fries;
        private Boolean drink;
        private Boolean dessert;

        public BurgerBuilder(int size) {
            this.size = size;
        }

        public BurgerBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public BurgerBuilder addLettuce() {
            this.lettuce = true;
            return this;
        }

        public BurgerBuilder addTomato() {
            this.tomato = true;
            return this;
        }

        public BurgerBuilder addBacon() {
            this.bacon = true;
            return this;
        }

        public BurgerBuilder addOnion() {
            this.onion = true;
            return this;
        }

        public BurgerBuilder addPickles() {
            this.pickles = true;
            return this;
        }

        public BurgerBuilder addMayo() {
            this.mayo = true;
            return this;
        }

        public BurgerBuilder addKetchup() {
            this.ketchup = true;
            return this;
        }

        public BurgerBuilder addMustard() {
            this.mustard = true;
            return this;
        }

        public BurgerBuilder addSalad() {
            this.salad = true;
            return this;
        }

        public BurgerBuilder addFries() {
            this.fries = true;
            return this;
        }

        public BurgerBuilder addDrink() {
            this.drink = true;
            return this;
        }

        public BurgerBuilder addDessert() {
            this.dessert = true;
            return this;
        }

        public Burger build() {
            return new Burger(size, cheese, lettuce, tomato, bacon, onion, pickles, mayo, ketchup, mustard, salad,
                fries, drink, dessert);
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
            "size=" + size +
            ", cheese=" + cheese +
            ", lettuce=" + lettuce +
            ", tomato=" + tomato +
            ", bacon=" + bacon +
            ", onion=" + onion +
            ", pickles=" + pickles +
            ", mayo=" + mayo +
            ", ketchup=" + ketchup +
            ", mustard=" + mustard +
            ", salad=" + salad +
            ", fries=" + fries +
            ", drink=" + drink +
            ", dessert=" + dessert +
            '}';
    }
}
