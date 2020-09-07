package ru.innopolis.university.mingaleev.homework_23;

public class Main {
    public static void main(String[] args) {

        BasketImpl basketImpl = new BasketImpl();

        basketImpl.addProduct("Telephone", 3);
        basketImpl.addProduct("TV", 2);
        basketImpl.addProduct("Microwave oven", 1);
        basketImpl.addProduct("Gas oven", 3);

        basketImpl.printProducts();
        basketImpl.removeProduct("Telephone");
        basketImpl.printProducts();

        basketImpl.updateProductQuantity("TV", 3);
        basketImpl.clear();


    }
}
