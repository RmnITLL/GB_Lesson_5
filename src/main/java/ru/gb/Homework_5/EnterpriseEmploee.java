package ru.gb.Homework_5;


public class EnterpriseEmploee {

    public static void main(String[] args) {

        Employee[] Empls = new Employee[5];


        Empls[0] = new Employee("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com",
                           "892312312", 30000, 30);

        Empls[1] = new Employee("Petrov Petr Petrovich ", "Employee", "petrov41@mailbox.com",
                "892412314", 31000, 41);

        Empls[2] = new Employee("Sidorov Vasia Valerevich ", "Electric", "vsidorov@mailbox.com",
                "892012315", 30500, 45);

        Empls[3] = new Employee("Vasechkin Anton Pavlovich ", "Santehnik", "avasechkin@mailbox.com",
                "892612311", 32000, 27);

        Empls[4] = new Employee("Fedorov Dmitrii Aleksandrovich ", "Doctor", "ivivan@mailbox.com",
                "892812310", 33000, 40);



    for (Employee emplOverFourty : Empls)
        if (emplOverFourty.getAge() > 40) {
            System.out.println(emplOverFourty.toString());
        }


    }
}
