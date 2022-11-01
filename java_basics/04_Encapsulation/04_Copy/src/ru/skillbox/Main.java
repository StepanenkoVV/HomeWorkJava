package ru.skillbox;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(); //создаем габариты, изначальное их значение равно 1.1.1
        System.out.println("После создания габаритов, распеччатаем их");
        System.out.println(dimensions);
        Dimensions dimensions1 = dimensions.setWidth(2).setHeight(2).setLenght(2); // путем создания копии объекта через set добавляем новые значения
        System.out.println("Выводим на экран копию наших габаритов");
        System.out.println(dimensions1);
        Delivery delivery = new Delivery(dimensions,12,"Ангелов переулок","780ADA");
        System.out.println(delivery);  //Печатаем исходный товар
        Delivery delivery1 = delivery.setMass(20).setAddress("Митинская № 22").setDimensions(dimensions1);
        System.out.println(delivery1); //Печатаем копию товара

    }
}
