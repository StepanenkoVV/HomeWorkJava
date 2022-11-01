package ru.skillbox;

public class Ram {
    Enum<RamType> ramType;

    private final double weight = 0.025;

    private final int size = 32;

    public Ram(Enum<RamType> ramType) {
        this.ramType = ramType;
    }

    public Ram() {

    }

    public double getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "\n  Характеристика оперативной памяти:  " +
                "\n  Тип оперативной памяти  - " + ramType +
                "\n  Объем оперативной памяти  - " + size +
                "\n  Вес оперативной памяти  - " + weight;
    }
}
