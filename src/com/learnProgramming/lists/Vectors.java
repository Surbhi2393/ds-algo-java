package com.learnProgramming.lists;

import java.util.List;
import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee(123,"John","Adams"));
        employeeList.add(new Employee(456,"Emily","White"));
        employeeList.add(new Employee(789,"Jane","Doe"));
        employeeList.add(new Employee(135,"Harry","Styles"));
    }
}
