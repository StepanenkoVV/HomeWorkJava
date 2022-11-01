package ru.skillbox;

public class Screan {

    private final double weight = 7;
    private final double diagonal = 31.5;
    Enum<ScreanType> screanTypeEnum;

    public Screan(Enum<ScreanType> screanTypeEnum) {
        this.screanTypeEnum = screanTypeEnum;

    }

    public double getDiagonal() {
        return diagonal;
    }


    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "\n Характеристика Экрана" +
                "\n Диагональ экрана  " + diagonal +
                "\n Тип Экрана  " + screanTypeEnum +
                "\n Вес - " + weight;
    }
}
