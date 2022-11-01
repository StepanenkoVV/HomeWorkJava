package ru.skillbox;

public class Delivery {

  private final int mass; // масса
  private final Dimensions dimensions; //габариты
  private final String address; //адрес доставки
  private final String registrationNumber; //регистрационный номер
  private boolean property = true;    // можно переворачивать
  private boolean frigile = true;    //хрупкий

  public Delivery(Dimensions dimensions, int mass, String address,
      String registrationNumber) {
    //if (isFrigile()) {
    //   System.out.println("Товар хрупкий");
    // }
    this.mass = mass;
    this.dimensions = dimensions;
    this.address = address;
    this.registrationNumber = registrationNumber;
  }


  public Delivery setAddress(String address) {
    return new Delivery(dimensions, mass, address, registrationNumber);
  }

  public Delivery setDimensions(Dimensions dimensions) {
    return new Delivery(dimensions, mass, address, registrationNumber);
  }

  public Delivery setMass(int mass) {
    return new Delivery(dimensions, mass, address, registrationNumber);
  }

  public Delivery setRegistrationNumber(String registrationNumber) {
    return new Delivery(dimensions, mass, address, registrationNumber);
  }


  public int getMass() {
    return mass;
  }

  public String getAddress() {
    return address;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }

 public boolean isFrigile() {
    return frigile;
  }


  public boolean isProperty() {
    return property;
  }

  public String toString() {
    return
        "габариты товара: " + "\n" + dimensions + "\n" +
            "Товар хрупкий? " + isFrigile()  + "\n" +
            "Можно переворачивать товар?  - " + isProperty() + "\n" +
            "Адрес доставки -  " + getAddress() + "\n" +
            "Масса товара - " +   getMass() + "\n" +
            "Регистрационный номер - " + getRegistrationNumber();
  }
}
