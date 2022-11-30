public class Main {
    public static void main(String[] args) {


        Employee[] notes = new Employee[3];

        notes[0] = new Employee("Иван", 400, 2);
        notes[1] = new Employee("Дима", 700, 2);
        notes[2] = new Employee("Толя", 100, 1);

        EmployeeInformation.printBySalaryLower(notes, 300);

    }
}