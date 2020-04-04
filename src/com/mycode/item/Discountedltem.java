package com.mycode.item;

import java.util.Objects;

public class Discountedltem  extends Item{
    private double newPrice;

    public Discountedltem(double price, String description,double newPrice) {
        super(price, description);
        this.newPrice = newPrice;;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discountedltem)) return false;
        if (!super.equals(o)) return false;
        Discountedltem that = (Discountedltem) o;
        return Double.compare(that.newPrice, newPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), newPrice);
    }

}
