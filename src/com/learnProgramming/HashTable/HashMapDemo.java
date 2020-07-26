package com.learnProgramming.HashTable;

import com.learnProgramming.lists.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John","Adams");
        Employee employee2 = new Employee(2, "Jane","Austin");
        Employee employee3 = new Employee(3, "Harry","Doe");
        Employee employee4 = new Employee(4, "Bill","Smith");

        Map<String, Employee> map = new HashMap<>();
        map.put("Adams", employee1);
        map.put("Austin", employee2);
        map.put("Doe", employee3);
        //Employee emp = map.put("Doe",employee4);
        //System.out.println(emp);
        Employee employee = map.putIfAbsent("Doe", employee4);
        System.out.println(employee);

        /*Iterator<Employee> itr = map.values().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

        map.forEach((k,v) -> System.out.println("Key: "+k+", Value: "+v));

        System.out.println(map.containsKey("Doe"));
        System.out.println(map.containsValue(employee1));

        System.out.println(map.get("Adams"));
        System.out.println(map.get("someone"));
        System.out.println(map.getOrDefault("someone",employee4));

        map.remove("Austin");
        map.forEach((k,v) -> System.out.println("Key: "+k+", Value: "+v));
    }
}
