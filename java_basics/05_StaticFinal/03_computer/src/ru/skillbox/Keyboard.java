package ru.skillbox;

public class Keyboard {

    private final double weight = 0.600;
    public String backLight = "c подсветкой";

    Enum<KeyboardType> keyboardTypeEnum;

    public Keyboard(Enum<KeyboardType> keyboardTypeEnum) {

        this.keyboardTypeEnum = keyboardTypeEnum;

    }

    public Keyboard() {

    }

    public double getWeight() {
        return weight;
    }

    public String getBackLight() {
        return backLight;
    }


    @Override
    public String toString() {
        return  "\n  Характеристика клавиатуы: " +
                "\n Тип клавиатуры " + keyboardTypeEnum +
                "\n Наличие подсветки: " + backLight +
                "\n Вес - " + weight;
    }
}
