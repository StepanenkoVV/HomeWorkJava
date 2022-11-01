package ru.skillbox;

public class Dimensions {

  private final int width;
  private final int height;
  private final int lenght;

  public Dimensions() {
    width = 1;
    height = 1;
    lenght = 1;

  }

  public Dimensions(int width, int height, int lenght) {
    this.width = width;
    this.lenght = lenght;
    this.height = height;
  }


  public Dimensions setWidth(int width) {
    return new Dimensions(width, height, lenght);
  }

  public int getWidth() {
    return width;
  }

  public Dimensions setHeight(int height) {
    return new Dimensions(width, height, lenght);
  }

  public int getHeight() {
    return height;
  }

  public int getLenght() {
    return lenght;
  }

  public Dimensions setLenght(int lenght) {
    return new Dimensions(width, height, lenght);
  }

  public final int getValueOfDimensions() {
    return +width * height * lenght;
  }

  public String toString() {
    return "ширина товара " + getWidth() + "\n" +
        "высота товара " + getHeight() + "\n" +
        "длинна товара " + getLenght() + "\n" +
        "объем груза " + getValueOfDimensions();

  }
}
