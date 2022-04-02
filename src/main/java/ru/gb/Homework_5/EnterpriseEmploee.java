package ru.gb.Homework_5;

import java.util.ArrayList;

public class EnterpriseEmploee {

    public static void main(String[] args) {

        Employee[] Empls = new Employee[5];


        Empls[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com",
                           "892312312", 30000, 30);

        Empls[1] = new Employee("Petrov Petr Petrovich ", "Employee", "ivivan@mailbox.com",
                "892312312", 30000, 41);

        Empls[2] = new Employee("Petrov Petr Petrovich ", "Employee", "ivivan@mailbox.com",
                "892312312", 30000, 45);

        Empls[3] = new Employee("Petrov Petr Petrovich ", "Employee", "ivivan@mailbox.com",
                "892312312", 30000, 27);

        Empls[4] = new Employee("Petrov Petr Petrovich ", "Design", "ivivan@mailbox.com",
                "892312312", 30000, 40);



    for (Employee emplOverFourty : Empls)
        if (emplOverFourty.getAge() > 40) {
            System.out.println(emplOverFourty.toString());
        }


    }
}
