package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Cpu cpu1 = new Cpu(manufacturer.ACER); // Создали процессор для нашего компьютера
        Ram ram1 = new Ram(RamType.DRAM); // Создали оперативную память
        Hdd hdd1 = new Hdd(HddType.HHD_TYPE); // Создали жесткий диск
        Screan screan1 = new Screan(ScreanType.IPS); // Создаем экран
        Keyboard keyboard1 = new Keyboard(KeyboardType.SENSOR);  // Создаем клавиатуру
        Computer1 computer1 = new Computer1(cpu1,ram1,hdd1,screan1,keyboard1); // Создаем компьютер
        computer1.getTotalMass(); // реализиуем метод расчета общей массы комптьютера
        System.out.println(computer1);


    }
}
