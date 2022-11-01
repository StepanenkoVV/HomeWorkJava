package ru.skillbox;

public class Computer1 {  // Основной класс комьютер

    private final String vendor = "Acer";
    private final String name = "Aspire 7 ";
    public double totalMass = 0;

    Ram ram;
    Cpu cpu;
    Hdd hdd;
    Screan screan;
    Keyboard keyboard;

    public Computer1(Cpu cpu, Ram ram, Hdd hdd, Screan screan, Keyboard keyboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.screan = screan;
        this.keyboard = keyboard;
        //totalMass = totalMass = ram.getWeight() + cpu.getWeight() + hdd.getWeight() + screan.getWeight() + keyboard.getWeight(); ( можно добавить расчет массы комптьютера сразу в конструткор без метода)

    }

    public Computer1(String vendor, String name, Cpu cpu) {
        //this.vendor = vendor;
        this.cpu = cpu;

    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }


    public void setTotalMass(double totalMass) {
        this.totalMass = totalMass;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Screan getScrean() {
        return screan;
    }

    public void setScrean(Screan screan) {
        this.screan = screan;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getTotalMass() {
        totalMass = ram.getWeight() + cpu.getWeight() + hdd.getWeight() + screan.getWeight() + keyboard.getWeight();
        return totalMass;
    }

    @Override
    public String toString() {
        return "\n  Комптютер  - " + vendor + " " + name +
                "\n" + cpu +
                "\n" + ram +
                "\n" + hdd +
                "\n" + screan +
                "\n" + keyboard +
                "\n Общий вес комьютера:  " + totalMass + " грамм";
    }

}

