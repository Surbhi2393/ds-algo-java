package com.learnProgramming.HashTable;

import com.learnProgramming.lists.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HashMapProblem {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(123,"Jane","Jones"));
        employees.add(new Employee(5678,"John","Doe"));
        employees.add(new Employee(45,"Mike","Wilson"));
        employees.add(new Employee(5555,"Mary","Smitth"));
        employees.add(new Employee(5678,"John","Doe"));
        employees.add(new Employee(3948,"Bill","End"));
        employees.add(new Employee(123,"Jane","Jones"));

        employees.forEach(e-> System.out.println(e));

        HashMap<Integer,Employee> map = new HashMap<>();
        List<Employee> remove = new ArrayList<>();

        for (Employee employee: employees) {
            if(map.containsKey(employee.getId())){
                //gives ConcurrentModificationException
                //employees.remove(employee);
                remove.add(employee);
            }else{
                map.put(employee.getId(),employee);
            }
        }

        for (Employee e: remove) {
            employees.remove(e);
        }

        System.out.println("=====================================");
        employees.forEach(e-> System.out.println(e));
    }
}
