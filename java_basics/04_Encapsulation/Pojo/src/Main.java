public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Россия");
        country1.setName("Россия");
        System.out.println("\n");
        System.out.println("<<<===========================================>>>");
        System.out.println("                 Задание 1");
        country1.setPopulation(144);
        country1.setArea(17098246);
        country1.setNameCapital("Moscow");
        country1.setAccessSea("да");
        System.out.println("Развивающаяся страна - " + country1.getName());
        System.out.println("Столица России  - " + country1.getNameCapital());
        System.out.println("Площадь страны " + country1.getArea() + " км2");
        System.out.println("В России живет более " + country1.getPopulation() + "  миллиона человек");
        System.out.println("У России есть выход к морю?  - " + country1.getAccessSea());

        System.out.println("\n");
        System.out.println("<<<===========================================>>>");
        System.out.println("                 Задание 2");

        School school = new School("СОШ № 25");
        school.setName("СОШ № 25");
        school.setColor("cинего");
        school.setStudents(800);
        school.setSchoolOffice(75);
        System.out.println("Школа номер - " + school.getName());
        System.out.println("В школе учится - " + school.getStudents() + " учеников");
        System.out.println("В школе - " + school.getSchoolOffice() + " кабинетов");
        System.out.println("Школа  - " + school.getColor() + " цвета");
    }
}
