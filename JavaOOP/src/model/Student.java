package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String ID_No;


    public Student(String name, int age, String gender, String ID_No) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID_No = ID_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID_NO() {
        return ID_No;
    }

    public void setID_NO(String ID_No) {
        this.ID_No = ID_No;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



}
