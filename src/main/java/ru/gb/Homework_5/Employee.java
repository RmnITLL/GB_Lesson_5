package ru.gb.Homework_5;

public class Employee {
    /**
     * Did Homework 5
     * by Koloskov
     */

    private String fullName;
    private String positon;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Employee(String fullName, String positon, String email, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.positon = positon;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void informationEm() {
        System.out.println("ФИО сотрудника: " + fullName + ", должность: " + positon + ", email: " + email +
                ", телефон: " + telephone + ", зарплата: " + salary + ", возраст: " + age + ".");

    }
    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Имя сотрудника: " + fullName +
                ", должность: " + positon +
                ", email: " + email +
                ", телефон: " + telephone +
                ", зарплата: " + salary +
                ", возраст: " + age + ".";
    }
}


