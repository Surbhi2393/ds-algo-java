package com.learnProgramming.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(123,"John","Adams"));
        employeeList.add(new Employee(456,"Emily","White"));
        employeeList.add(new Employee(789,"Jane","Doe"));
        employeeList.add(new Employee(135,"Harry","Styles"));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee(790, "Surbhi", "Bhat"));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(3, new Employee(456, "Emily","White"));
        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray){
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee(789, "Jane","Doe")));

        System.out.println(employeeList.indexOf(new Employee(790, "Surbhi","Bhat")));

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
