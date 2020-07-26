package com.learnProgramming.HashTable;

import com.learnProgramming.lists.Employee;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John","Adams");
        Employee employee2 = new Employee(2, "Jane","Austin");
        Employee employee3 = new Employee(3, "Harry","Doe");
        Employee employee4 = new Employee(4, "Mary","Andrew");
        Employee employee5 = new Employee(5, "Bill","Smith");

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Adams",employee1);
        hashTable.put("Austin",employee2);
        hashTable.put("Doe",employee3);
        hashTable.put("Andrew",employee4);

        System.out.println("Printing hashtable");
        hashTable.printHashTable();

        System.out.println("Get from hashtable");
        System.out.println(hashTable.get("Doe"));
        System.out.println(hashTable.get("Andrew"));

        HashTableHandleCollision ht = new HashTableHandleCollision();
        ht.put("Adams",employee1);
        ht.put("Austin",employee2);
        ht.put("Doe",employee3);
        ht.put("Smith",employee5);

        System.out.println("Printing hashtable");
        ht.printHashTable();

        System.out.println("Get from hashtable");
        System.out.println(ht.get("Doe"));
        System.out.println(ht.get("Andrew"));

        System.out.println("Removing elements from hash table:");
        ht.remove("Adams");
        ht.remove("Austin");
        ht.printHashTable();

        System.out.println(ht.get("Smith"));

        ChainedHashTable chainedHashTable = new ChainedHashTable();
        chainedHashTable.put("Adams", employee1);
        chainedHashTable.put("Austin",employee2);
        chainedHashTable.put("Doe", employee3);
        chainedHashTable.put("Smith",employee5);

        System.out.println("Printing chained HashTable");
        chainedHashTable.printHahTable();

        System.out.println("Retrieving from chained hash table:");
        System.out.println(chainedHashTable.get("Smith"));

        System.out.println("Removing from hash table:");
        chainedHashTable.remove("Doe");
        chainedHashTable.remove("Adams");
        chainedHashTable.printHahTable();

        System.out.println(chainedHashTable.get("Smith"));

    }
}
