import java.util.Arrays;
import java.util.Comparator;

public class EmployeeInformation {



    private static int employeeCountService(Employee[] arr){     //Считаем сотрудников в книге, служебный метод

        int employeeCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getName() != ("0"))

                employeeCount++;
        }

        return(employeeCount);
    }


    public static void printEmployees(Employee[] arr) {

        if (employeeCountService(arr) != 0) {

            System.out.println("Список всех сотрудников: ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].getName() != ("0")) {

                    System.out.println((arr[i].toString() + " " + arr[i].getId()));
                }
            }

        } else {

            System.out.println("В книге не указан ни один сотрудник");

        }

        System.out.println();
    }



    public static void calculateSalaryExpenses(Employee[] arr) {

        if (employeeCountService(arr) != 0) {

            int totalSalary = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].getName() != ("0")) {

                    totalSalary = totalSalary + arr[i].getSalary();
                }
            }

            System.out.println("Общие расходы на зарплату составляют: " + totalSalary);
            System.out.println();

        } else {

            System.out.println("В книге не указан ни один сотрудник");

        }

    }

    public static void findMinSalary(Employee[] arr) {

        if (employeeCountService(arr) != 0) {

            int employeesInBook = 0;


            for (int i = 0; i < arr.length; i++) {          //выясняем, сколько сотрудников в книге не указано

                if (arr[i].getName() == ("0")) {

                    employeesInBook++;

                }
            }



            Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

            Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));

            System.out.println("Сотрудник с минимальной зарплатой: " + arrSorted[employeesInBook].toString());

            System.out.println();

        } else {

            System.out.println("В книге не указан ни один сотрудник");

        }
    }

    public static void findMaxSalary(Employee[] arr) {

        if (employeeCountService(arr) != 0) {

            Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

            Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));

            System.out.println("Сотрудник с максимальной зарплатой: " + arrSorted[(arrSorted.length - 1)].toString());

            System.out.println();

        } else {

            System.out.println("В книге не указан ни один сотрудник");

        }
    }


    public static void calculateAverageSalary(Employee[] arr) {

        if (employeeCountService(arr) != 0) {

            int totalSalary = 0;
            int employeesInBook = 0;

            for (int i = 0; i < arr.length; i++) {          //выясняем количество сотрудников

                if (arr[i].getName() != ("0")) {

                    employeesInBook++;

                }
            }

            for (int i = 0; i < arr.length; i++) {

                totalSalary = totalSalary + arr[i].getSalary();
            }

            System.out.println("Средняя зарплата составляет: " + (totalSalary / employeesInBook));
            System.out.println();

        } else {

            System.out.println("В книге не указан ни один сотрудник");

        }
    }


    public static void printEmployeeNames(Employee[] arr) {

        if (employeeCountService(arr) != 0) {

            System.out.println("Список имён всех сотрудников: ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].getName() != ("0")) {

                    System.out.println(arr[i].getName());
                }
            }

            System.out.println();

        } else {

            System.out.println("В книге не указан ни один сотрудник");

        }

    }

}
