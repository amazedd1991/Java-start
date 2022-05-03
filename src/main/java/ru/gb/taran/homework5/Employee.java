package ru.gb.taran.homework5;

public class Employee {
    private String name;
    private String surName;
    private String secondName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public static void employeeInfo() {

        Employee emp1 = new Employee("Ivan", "Ivanov", "Ivanovich", "engineer", "i@i.com", 89767854, 50000, 50);
        Employee emp2 = new Employee("Anna", "Ivanova", "Sergeevna", "laboratory assistant", "a@a.com", 898345263, 30000, 45);
        Employee emp3 = new Employee("Oleg", "Petrov", "Igorevich", "director", "o@o.com", 897562334, 100000, 40);
        Employee emp4 = new Employee("Igor", "Sidorov", "Ivanovich", "engineer assistant", "i@i.com", 898432455, 40000, 30);
        Employee emp5 = new Employee("Olga", "Sidorova", "Andreevna", "accountant", "ol@o.com", 895435235, 35000, 40);

        System.out.println("Employee 1 = " + emp1);
        System.out.println("Employee 2 = " + emp2);
        System.out.println("Employee 3 = " + emp3);
        System.out.println("Employee 4 = " + emp4);
        System.out.println("Employee 5 = " + emp5);
    }

    public Employee(String name, String sureName, String secondName, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.surName = sureName;
        this.secondName = secondName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name +
                " " + this.surName +
                " " + this.secondName +
                ", " + this.position +
                ", " + this.email +
                ", " + this.phoneNumber +
                ", " + this.salary +
                ", " + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

