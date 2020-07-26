package com.learnProgramming.HashTable;

import com.learnProgramming.lists.Employee;

public class SimpleHashTable {

    private Employee[] hashTable;

    public SimpleHashTable(){
        hashTable = new Employee[10];
    }

    private int hashKey(String key){
        return key.length()% hashTable.length;
    }

    public void put(String key, Employee value){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)){
            System.out.println("Sorry, There is already an employee at position "+hashedKey);
        }else{
            hashTable[hashedKey] = value;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printHashTable(){
        for(int i=0;i<hashTable.length;i++){
            System.out.println(hashTable[i]);
        }
    }

    private boolean occupied(int index){
        return hashTable[index]!=null;
    }
}
