public class Main {
    public static void main(String[] args) {


        Employee[] notes = new Employee[10];

        notes[0] = new Employee("Иван Сергеевич", 210, 3);
        notes[1] = new Employee("Антон Петрович", 500, 4);
        notes[2] = new Employee("0",0, 0);
        notes[3] = new Employee("Петр Антонович", 370, 5);
        notes[4] = new Employee("Алексей Дмитриевич", 380, 2);
        notes[5] = new Employee("Евгений Евгеньевич", 420, 4);
        notes[6] = new Employee("Валерий Олегович", 550, 2);
        notes[7] = new Employee("0", 0, 0);
        notes[8] = new Employee("0", 0, 0);
        notes[9] = new Employee("Семён Анатольевич", 700, 3);

        //Difficulty 1

        EmployeeInformation.printEmployees(notes);

        EmployeeInformation.calculateSalaryExpenses(notes);
        EmployeeInformation.findMinSalary(notes);
        EmployeeInformation.findMaxSalary(notes);
        EmployeeInformation.calculateAverageSalary(notes);
        EmployeeInformation.printEmployeeNames(notes);

    }
}