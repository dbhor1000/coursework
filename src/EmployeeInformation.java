import java.util.Arrays;
import java.util.Comparator;

public class EmployeeInformation {



    public void printEmployees(Employee[] arr) {

        for (int i = 0; i < Employee.id; i++) {
            System.out.println((arr[i].toString()));
        }
    }

    public static void calculateSalaryExpenses(Employee[] arr) {

        int totalSalary = 0;

        for (int i = 0; i < Employee.id; i++) {

            totalSalary = totalSalary + arr[i].getSalary();
        }

        System.out.println("Общие расходы на зарплату составляют: " + totalSalary);

    }

    public static void findMinSalary(Employee[] arr) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));

        System.out.println("Сотрудник с минимальной зарплатой: " + arrSorted[0].toString());


       }

    public static void findMaxSalary(Employee[] arr) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));

        System.out.println("Сотрудник с максимальной зарплатой: " + arrSorted[(arrSorted.length - 1)].toString());


    }

    public static void calculateAverageSalary(Employee[] arr) {

        int totalSalary = 0;

        for (int i = 0; i < Employee.id; i++) {

            totalSalary = totalSalary + arr[i].getSalary();
        }

        System.out.println("Средняя зарплата составляет: " + (totalSalary/Employee.id) );

    }

    public static void printEmployeeNames(Employee[] arr) {

        System.out.println("Список имён сотрудников: ");

        for (int i = 0; i < Employee.id; i++) {

            System.out.println(arr[i].getName());
        }

    }

    public static void indexSalary(Employee[] arr, int change) {

        System.out.println("Зарплата после индексации:");

        for (int i = 0; i < Employee.id; i++) {

            arr[i].setSalary( (arr[i].getSalary() * (100 + change)) / 100 );
            System.out.println(arr[i].toString());

        }

    }

    public static void findDepartmentMinSalary(Employee[] arr, int numberOfDepartment) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));
        int employeeFound = 0;


        for (int i = 0; i < Employee.id; i++) {

            if (arrSorted[i].getDepartment() == numberOfDepartment) {

                System.out.println("Сотрудник с минимальной зарплатой в отделе " + numberOfDepartment + " - " + arrSorted[i].toString());
                employeeFound = employeeFound + 1;
                break;
            }
        }

            if (employeeFound == 0) {

                System.out.println("В указанном департаменте нет сотрудников");
            }

    }

    public static void findDepartmentMaxSalary(Employee[] arr, int numberOfDepartment) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));
        int employeeFound = 0;


        for (int i = 0; i < Employee.id; i++) {

            if (arrSorted[i].getDepartment() == numberOfDepartment) {

                System.out.println("Сотрудник с максимальной зарплатой в отделе " + numberOfDepartment + " - " + arrSorted[arrSorted.length - 1].toString());
                employeeFound = employeeFound + 1;
                break;
            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");
        }

    }


    public static void calculateDepartmentSalary(Employee[] arr, int numberOfDepartment) {

        int employeeFound = 0;
        int totalSalary = 0;


        for (int i = 0; i < Employee.id; i++) {

            if (arr[i].getDepartment() == numberOfDepartment) {

                totalSalary = totalSalary + arr[i].getSalary();
                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");
        } else {

            System.out.println("Суммарная затрата для отдела " + numberOfDepartment + " равняется " + totalSalary);
        }


    }


    public static void calculateDepartmentAverageEmployeeSalary(Employee[] arr, int numberOfDepartment) {

        int employeeFound = 0;
        int totalSalary = 0;


        for (int i = 0; i < Employee.id; i++) {

            if (arr[i].getDepartment() == numberOfDepartment) {

                totalSalary = totalSalary + arr[i].getSalary();
                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");
        } else {

            System.out.println("Средняя зарплата для отдела " + numberOfDepartment + " равняется " + totalSalary/employeeFound);
        }


    }

    public static void indexDepartmentEmployeeSalary(Employee[] arr, int numberOfDepartment, int changeSalary) {

        int employeeFound = 0;


        for (int i = 0; i < Employee.id; i++) {

            if (arr[i].getDepartment() == numberOfDepartment) {

                arr[i].setSalary((arr[i].getSalary() * (100 + changeSalary))/100);
                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");
        } else {

            System.out.println("Теперь зарплаты в отделе " + numberOfDepartment + " составляют: ");

            for (int i = 0; i < Employee.id; i++) {

                if (arr[i].getDepartment() == numberOfDepartment) {

                    System.out.println(arr[i].toString());
                }
            }

        }


    }

    public static void printDepartmentEmployeeNameSalary(Employee[] arr, int numberOfDepartment) {

        int employeeFound = 0;

        for (int i = 0; i < Employee.id; i++) {

            if (arr[i].getDepartment() == numberOfDepartment) {

                employeeFound++;
            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");

        } else {

            System.out.println("В " + numberOfDepartment + " работают следующие сотрудники: ");

            for (int i = 0; i < Employee.id; i++) {

                if (arr[i].getDepartment() == numberOfDepartment) {

                    System.out.println(arr[i].getName() + " " + arr[i].getSalary());

                }
            }
        }
    }

    public static void printBySalaryHigher(Employee[] arr, int salary) {

        int employeeFound = 0;

        for (int i = 0; i < Employee.id; i++) {

            if (arr[i].getSalary() >= salary ) {

                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("Нет сотрудников с зарплатой, выше или равной указанной.");

        } else {

            System.out.println("Зарплату выше или равную " + salary + " имеют следующие сотрудники: ");

            for (int i = 0; i < Employee.id; i++) {

                if (arr[i].getSalary() >= salary ) {

                    System.out.println(arr[i].toString());

                }
            }

        }

    }


    public static void printBySalaryLower(Employee[] arr, int salary) {

        int employeeFound = 0;

        for (int i = 0; i < Employee.id; i++) {

            if (arr[i].getSalary() <= salary ) {

                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("Нет сотрудников с зарплатой, ниже или равной указанной.");

        } else {

            System.out.println("Зарплату ниже или равную " + salary + " имеют следующие сотрудники: ");

            for (int i = 0; i < Employee.id; i++) {

                if (arr[i].getSalary() <= salary ) {

                    System.out.println(arr[i].toString());

                }
            }

        }

    }



}

