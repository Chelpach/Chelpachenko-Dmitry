package Homework3;

import java.lang.reflect.Array;
import java.util.*;

/**Определить структуру объекта Employee (сотрудник), хранящий информацию: фамилия, имя, должность, зарплата.
 * Разработать программу, которая хранит информацию обо всех сотрудниках фирмы/ Реализовать:
 •  заполнение контейнера данными с клавиатуры;
 •  вывод информации о сотрудниках на экран;
 •  поиск сотрудников, состоящих на заданной должности;
 •  сортировку списка сотрудников по полю фамилия и по полю зарплата.﻿
 Разработать программу, демонстрирующую работу с созданным классом и проверяющую корректность работы класса Employee
 * Created by chelp on 22.03.2017.
 */

public class Homework3Task5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нужную команду:");
        System.out.println("добавить, показать, поиск, сортировка, выход");


        while (scanner.hasNext()) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Добавить")) {
                Employee employee = addData(scanner);
                System.out.println("дальнейшее действие: добавить, показать, поиск, сортировка, выход");
            }else
            if (choice.equalsIgnoreCase("Показать")) {
                showEmployees(Employees.getEmpls());
                System.out.println("дальнейшее действие: добавить, показать, поиск, сортировка, выход");
            }else
            if (choice.equalsIgnoreCase("Поиск")){
                System.out.println("Введите должность искомого сотрудника");
                String search=scanner.nextLine();
                ArrayList<Employee> employees=Employees.searchPosition(search);
                showEmployees(employees);
                System.out.println("дальнейшее действие: добавить, показать, поиск, сортировка, выход");
            }else
            if(choice.equalsIgnoreCase("Сортировка")){
                System.out.println("Сортировка по фамилии или зарплате?");
                String serchChoice=scanner.nextLine();
                if (serchChoice.equalsIgnoreCase("фамилия")){
                    ArrayList<Employee> employees2=Employees.getSortByLastName();
                    showEmployees(employees2);
                    System.out.println("дальнейшее действие: добавить, показать, поиск, сортировка, выход");
                }else if(serchChoice.equalsIgnoreCase("зарплата")){
                    ArrayList<Employee> employees3=Employees.getSortEmplsBySalary();
                    showEmployees(employees3);
                    System.out.println("дальнейшее действие: добавить, показать, поиск, сортировка, выход");
                }
            }else
                if(choice.equalsIgnoreCase("выход")){
                break;
                }else System.out.println("Команда введена не верно");


        }
    }

    private static Employee addData(Scanner scanner) {
        System.out.println("Введите Имя");
        String firstName = scanner.nextLine();
        System.out.println("Введите Фамилия");
        String lastName = scanner.nextLine();
        System.out.println("Введите Должность");
        String position = scanner.nextLine();
        System.out.println("Введите Зарплату");
        int salary = scanner.nextInt();
        Employee employee = new Employee(firstName, lastName, position, salary);
        Employees.setEmpl(employee);
        return new Employee(firstName, lastName, position, salary);
    }

    private static void showEmployees(ArrayList<Employee> employees) {
        if (employees.size() == 0) {
            System.out.println("Список сотрудников пуст");
        } else {
            for (Employee x : employees) {
                System.out.println(x.toString());
            }
        }
    }

}

 class Employee {
     private String firstName;
     private String lastName;
     private String position;
     private int salary;

     public Employee(String firstName, String lastName, String position, int salary) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.position = position;
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", position='" + position + '\'' +
                 ", salary=" + salary +
                 '}';
     }

     public String getFirstName() {
         return firstName;
     }

     public String getLastName() {
         return lastName;
     }

     public String getPosition() {
         return position;
     }

     public int getSalary() {
         return salary;
     }
 }

class Employees {
    private static ArrayList<Employee> empls = new ArrayList<>();


    public static void setEmpl(Employee empl) {
        empls.add(empl);
    }

    public static ArrayList<Employee> getEmpls() {
        return empls;
    }

    public static ArrayList<Employee> searchPosition(String position) {
        ArrayList<Employee> searchPosEmpls = new ArrayList<>();
        for (Employee x : empls) {
            if (x.getPosition().equalsIgnoreCase(position)) {
                searchPosEmpls.add(x);
            }
        }
        return searchPosEmpls;
    }


    public static ArrayList<Employee> getSortByLastName() {
        Collections.sort(empls, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return empls;
    }

    public static ArrayList<Employee> getSortEmplsBySalary() {
        Collections.sort(empls, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getSalary(), o2.getSalary());
            }
        });

        return empls;
    }
}

