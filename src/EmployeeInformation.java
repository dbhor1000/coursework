import java.util.Arrays;
import java.util.Comparator;

public class EmployeeInformation {



    public static void printEmployees(Employee[] arr) {

        System.out.println("Список всех сотрудников: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println((arr[i].toString()));
        }

        System.out.println();
    }


    public static void calculateSalaryExpenses(Employee[] arr) {

        int totalSalary = 0;

        for (int i = 0; i < arr.length; i++) {

            totalSalary = totalSalary + arr[i].getSalary();
        }

        System.out.println("Общие расходы на зарплату составляют: " + totalSalary);
        System.out.println();

    }

    public static void findMinSalary(Employee[] arr) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));

        System.out.println("Сотрудник с минимальной зарплатой: " + arrSorted[0].toString());

        System.out.println();
       }

    public static void findMaxSalary(Employee[] arr) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));

        System.out.println("Сотрудник с максимальной зарплатой: " + arrSorted[(arrSorted.length - 1)].toString());

        System.out.println();
    }

    public static void calculateAverageSalary(Employee[] arr) {

        int totalSalary = 0;

        for (int i = 0; i < arr.length; i++) {

            totalSalary = totalSalary + arr[i].getSalary();
        }

        System.out.println("Средняя зарплата составляет: " + (totalSalary/arr.length) );
        System.out.println();
    }

    public static void printEmployeeNames(Employee[] arr) {

        System.out.println("Список имён всех сотрудников: ");

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i].getName());
        }

        System.out.println();

    }

    public static void indexSalary(Employee[] arr, int change) {

        System.out.println("Зарплата всех сотрудников после индексации на " + change + " процентов :");

        for (int i = 0; i < arr.length; i++) {

            arr[i].setSalary( (arr[i].getSalary() * (100 + change)) / 100 );
            System.out.println(arr[i].toString());

        }
        System.out.println();
    }

    public static void findDepartmentMinSalary(Employee[] arr, int numberOfDepartment) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));
        int employeeFound = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arrSorted[i].getDepartment() == numberOfDepartment) {

                System.out.println("Сотрудник с минимальной зарплатой в отделе " + numberOfDepartment + " - " + arrSorted[i].toString());
                employeeFound = employeeFound + 1;
                break;
            }
        }

            if (employeeFound == 0) {

                System.out.println("В указанном департаменте нет сотрудников");
            }
        System.out.println();
    }

    public static void findDepartmentMaxSalary(Employee[] arr, int numberOfDepartment) {

        Employee[] arrSorted = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrSorted, Comparator.comparing(Employee::getSalary));
        int employeeFound = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arrSorted[i].getDepartment() == numberOfDepartment) {

                System.out.println("Сотрудник с максимальной зарплатой в отделе " + numberOfDepartment + " - " + arrSorted[arrSorted.length - 1].toString());
                employeeFound = employeeFound + 1;
                break;
            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");
        }
        System.out.println();
    }


    public static void calculateDepartmentSalary(Employee[] arr, int numberOfDepartment) {

        int employeeFound = 0;
        int totalSalary = 0;


        for (int i = 0; i < arr.length; i++) {

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

        System.out.println();
    }


    public static void calculateDepartmentAverageEmployeeSalary(Employee[] arr, int numberOfDepartment) {

        int employeeFound = 0;
        int totalSalary = 0;


        for (int i = 0; i < arr.length; i++) {

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

        System.out.println();
    }

    public static void indexDepartmentEmployeeSalary(Employee[] arr, int numberOfDepartment, int changeSalary) {

        int employeeFound = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getDepartment() == numberOfDepartment) {

                arr[i].setSalary((arr[i].getSalary() * (100 + changeSalary))/100);
                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");
        } else {

            System.out.println("После индексации на " + changeSalary + " процентов, зарплаты в отделе " + numberOfDepartment + " составляют: ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].getDepartment() == numberOfDepartment) {

                    System.out.println(arr[i].toString());
                }
            }

        }

        System.out.println();
    }


    public static void printDepartmentEmployeeNameSalary(Employee[] arr, int numberOfDepartment) {

        int employeeFound = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getDepartment() == numberOfDepartment) {

                employeeFound++;
            }
        }

        if (employeeFound == 0) {

            System.out.println("В указанном департаменте нет сотрудников");

        } else {

            System.out.println("В " + numberOfDepartment + " отделе работают следующие сотрудники: ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].getDepartment() == numberOfDepartment) {

                    System.out.println(arr[i].getName() + " " + arr[i].getSalary());

                }
            }
        }
        System.out.println();
    }

    public static void printBySalaryHigher(Employee[] arr, int salary) {

        int employeeFound = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getSalary() >= salary ) {

                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("Нет сотрудников с зарплатой, выше или равной указанной.");

        } else {

            System.out.println("Зарплату выше или равную " + salary + " имеют следующие сотрудники: ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].getSalary() >= salary ) {

                    System.out.println(arr[i].toString());

                }
            }

        }
        System.out.println();
    }


    public static void printBySalaryLower(Employee[] arr, int salary) {

        int employeeFound = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getSalary() <= salary ) {

                employeeFound++;

            }
        }

        if (employeeFound == 0) {

            System.out.println("Нет сотрудников с зарплатой, ниже или равной указанной.");

        } else {

            System.out.println("Зарплату ниже или равную " + salary + " имеют следующие сотрудники: ");

            for (int i = 0; i < arr.length; i++) {

                if (arr[i].getSalary() <= salary ) {

                    System.out.println(arr[i].toString());

                }
            }

        }

        System.out.println();
    }



}

