package com.learnProgramming.HashTable;

import com.learnProgramming.lists.Employee;

public class HashTableHandleCollision {


        private StoredEmployee[] hashTable;

        public HashTableHandleCollision(){
            hashTable = new StoredEmployee[10];
        }

        private int hashKey(String key){
            return key.length()% hashTable.length;
        }

        public void put(String key, Employee value){
            int hashedKey = hashKey(key);
            if(occupied(hashedKey)){
                int stopIndex=hashedKey;
                if(hashedKey==hashTable.length-1){
                    hashedKey=0;
                }else{
                    hashedKey++;
                }

                while (occupied(hashedKey) && hashedKey!=stopIndex){
                    hashedKey = (hashedKey+1) % hashTable.length;
                }
            }
            if(occupied(hashedKey)){
                System.out.println("Sorry, There is already an employee at position "+hashedKey);
            }else{
                hashTable[hashedKey] = new StoredEmployee(key, value);
            }
        }

        public Employee get(String key){
            int hashedKey = findKey(key);
            if(hashedKey == -1){
                return null;
            }
            return hashTable[hashedKey].employee;
        }

        public void printHashTable(){
            for(int i=0;i<hashTable.length;i++){
                if(hashTable[i]==null){
                    System.out.println("empty");
                }else{
                    System.out.println("Position "+ i +": "+hashTable[i].employee);
                }

            }
        }

        private boolean occupied(int index){
            return hashTable[index]!=null;
        }

        private int findKey(String key){
            int hashedKey = hashKey(key);
            if(hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)){
                return hashedKey;
            }

            int stopIndex=hashedKey;
            if(hashedKey==hashTable.length-1){
                hashedKey=0;
            }else{
                hashedKey++;
            }

            while (hashedKey!=stopIndex && hashTable[hashedKey] != null
                    && !hashTable[hashedKey].key.equals(key)){
                hashedKey = (hashedKey+1) % hashTable.length;
            }

            if(hashTable[hashedKey] != null
                    && hashTable[hashedKey].key.equals(key)){
                return hashedKey;
            }else{
                return -1;
            }
        }

        public Employee remove(String key){
            int hashkey = findKey(key);
            if(hashkey==-1){
                return null;
            }
            Employee employee = hashTable[hashkey].employee;
            hashTable[hashkey]=null;
            //Rehashing
            StoredEmployee[] oldHashTable = hashTable;
            hashTable = new StoredEmployee[oldHashTable.length];
            for(int i=0; i<oldHashTable.length;i++){
                if(oldHashTable[i]!=null) {
                    put(oldHashTable[i].key, oldHashTable[i].employee);
                }
            }
            return employee;
        }

}
