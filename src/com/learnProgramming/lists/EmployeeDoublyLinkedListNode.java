package com.learnProgramming.lists;

public class EmployeeDoublyLinkedListNode {

    private Employee employee;
    private EmployeeDoublyLinkedListNode next;
    private EmployeeDoublyLinkedListNode previous;

    public EmployeeDoublyLinkedListNode(Employee employee){
        this.employee=employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoublyLinkedListNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoublyLinkedListNode next) {
        this.next = next;
    }

    public EmployeeDoublyLinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoublyLinkedListNode previous) {
        this.previous = previous;
    }

    public String toString(){
        return employee.toString();
    }
}
