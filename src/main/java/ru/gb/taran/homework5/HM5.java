package ru.gb.taran.homework5;


import static ru.gb.taran.homework5.Employee.employeeInfo;


public class HM5 {
    public static void main(String[] args) {
        employeeInfo();
        printMass();
    }

    public static void printMass() {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivan", "Ivanov", "Ivanovich", "engineer", "i@i.com", 89767854, 50000, 50);
        empArray[1] = new Employee("Anna", "Ivanova", "Sergeevna", "laboratory assistant", "a@a.com", 898345263, 30000, 45);
        empArray[2] = new Employee("Oleg", "Petrov", "Igorevich", "director", "o@o.com", 897562334, 100000, 40);
        empArray[3] = new Employee("Igor", "Sidorov", "Ivanovich", "engineer assistant", "i@i.com", 898432455, 40000, 30);
        empArray[4] = new Employee("Olga", "Sidorova", "Andreevna", "accountant", "ol@o.com", 895435235, 35000, 40);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() >= 40) {
                System.out.println("Сотрудники старше 40 лет: " + empArray[i]);
            }
        }

    }


}











