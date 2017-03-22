package Homework3;

import java.util.*;

import static Homework3.Employees.empls;

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
    public static void main(String args[]){
        String data;
                int sal;

        Scanner scanner = new Scanner(System.in);
        Employee empl=new Employee();

        System.out.println("Введите Фамилию");
        data = scanner.nextLine();
        empl.setFirstName(data);
        Employees.setEmpl(empl);

        System.out.println("Введите Имя");
        data = scanner.nextLine();
        empl.setlastName(data);
        Employees.setEmpl(empl);

        System.out.println("Введите Должность");
        data = scanner.nextLine();
        empl.setPosition(data);
        Employees.setEmpl(empl);

        System.out.println("Введите Зарплату");
        sal = scanner.nextInt();
        empl.setSalary(sal);
        Employees.setEmpl(empl);

        Employees.printEmpl(empls);
    }
}

 class Employee {
     String firstName;
     String lastName;
     String position;
     int salary;
     void setFirstName(String data){
         firstName=data;
     }
     void setlastName(String data){
         lastName=data;
     }
     void setPosition(String data){
         position=data;
     }
     void setSalary(int data){
         salary=data;
     }
 }

class Employees{
   static List<Employee> empls=new ArrayList<>();
    public static void setEmpl(Employee empl){
        empls.add(empl);
    }
    public static void printEmpl(List empls){
        System.out.println(empls.get(0));
    }
}