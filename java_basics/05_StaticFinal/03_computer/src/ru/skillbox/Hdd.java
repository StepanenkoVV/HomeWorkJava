package ru.skillbox;

public class Hdd {

    private final double weight = 0.90; // вес жесткого диска


    private final int mameryZise = 4000;
    Enum<HddType> hddTypeEnum;

    public Hdd(Enum<HddType> hddTypeEnum) {
        this.hddTypeEnum = hddTypeEnum;

    }

    public Hdd() {
    }

    public double getWeight() {
        return weight;
    }

    public double getMameryZise() {
        return mameryZise;
    }

    @Override
    public String toString() {
        return "\n  Характеристика жесткого диска:  " +
                "\n  Тип жесткого диска " + hddTypeEnum +
                "\n  Объем жесткого диска :  " + mameryZise +
                "\n  Вес :  " + weight;
    }


}
