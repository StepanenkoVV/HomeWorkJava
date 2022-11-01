package ru.skillbox;

import java.util.concurrent.Callable;

public class Cpu {  //процессор


    Enum<manufacturer> manufacturer; //производитель

    private final double weight = 0.300; // грамм

    private final int numberOfCores = 6;

    public String frequency = "4.1 ГГц, в режиме Turbo";


    public double getWeight() {
        return weight;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }


    public Cpu(Enum<manufacturer> manufacturer) {
        this.manufacturer = manufacturer;

    }

    public Cpu() {

    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "\n  Характеристика процессора:  " +
                "\n  Частота процессора - " + frequency +
                "\n  Количество ядер - " + numberOfCores +
                "\n  Производитель  - " + manufacturer +
                "\n  Вес - " + weight + " кг";
    }


}
