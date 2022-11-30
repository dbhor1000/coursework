public class Employee {

    int salary;
    String name;
    int department;

    static int id = 0;




    public Employee(String name, int salary, int department){       //Конструктор для сотрудника с основными характеристиками
        this.name = name;
        this.salary = salary;
        this.department = department;
        id++;

    }

    public static int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " " + salary + " " + department;
    }
}
