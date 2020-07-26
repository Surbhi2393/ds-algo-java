package com.learnProgramming.HashTable;

import com.learnProgramming.lists.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    //array of linked lists
    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable(){
        hashTable = new LinkedList[10];
        for(int i=0;i<hashTable.length;i++){
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> itr = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while (itr.hasNext()){
            employee = itr.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }

        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> itr = hashTable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (itr.hasNext()){
            employee = itr.next();
            index++;
            if(employee.key.equals(key)){
                break;
            }
        }

        if(employee==null){
            return null;
        }else{
            hashTable[hashedKey].remove(index);
            return employee.employee;
        }

    }

    public void printHahTable(){
        for(int i=0;i<hashTable.length;i++){
            if(hashTable[i].isEmpty()){
                System.out.println("Position "+i+": empty");
            }else{
                System.out.print("Position "+i+": ");
                ListIterator<StoredEmployee> itr = hashTable[i].listIterator();
                while(itr.hasNext()){
                    System.out.print(itr.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }

    private int hashKey(String key){
        //return key.length()% hashTable.length;

        return Math.abs(key.hashCode() % hashTable.length);
    }
}
