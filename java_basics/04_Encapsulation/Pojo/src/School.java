public class School {
    private String name;  //название школы
    private int schoolOffice; // количество кабинетов в школе
    private int students; // количество учащихся
    private String color; // цвет школы

    public School(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setSchoolOffice(int schoolOffice) {
        this.schoolOffice = schoolOffice;
    }

    public int getSchoolOffice() {
        return schoolOffice;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getStudents() {
        return students;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
