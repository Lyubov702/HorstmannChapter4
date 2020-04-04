package com.mycode.item;

public class ItemTest {
    public static void main(String[] args) {
        Item item = new Item(444,"Name");

        Item discountedItem = new Discountedltem(444,"Name",777);
        Item discountedItem2 = new Discountedltem(444,"Name",888);

        System.out.println(item.equals(discountedItem));
        System.out.println(item.equals(discountedItem2));
        System.out.println(discountedItem.equals(discountedItem2));

    }
}
