/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework1;

/**
 *
 * @author HP
 */
public class LinkedList {
    
    // -------- Node Class --------------
    private static class Node {
        int data ;
        Node next ;
        
        Node(int num ) {
            this.data = num ;
            next = null ;
        }
    }
    // ----- ----- ----------------------
    private Node head = null ;
    private Node tail = null ;
    
    // -------- add number to LinkedList -------
    public void add(int num){
        
        Node newNode = new Node(num) ;
        
        if(head == null ) {
            head = newNode ;
            tail = newNode ;
        }
        
        tail.next = newNode ;
        tail = newNode ;
    }
    // ----------- Insert a item into head -----
    public void insertHead(int num) {
        Node newNode = new Node(num) ;
        
        if(head == null) {
            head = newNode ;
            tail = newNode ;
        }
        newNode.next = head ;
        head = newNode;
    }
    // ------- insert a number at the index 900 000
    public void insertAtIndex(int index,int num) {
        Node newNode = new Node(num) ;
        Node current = head;
        int count = 0 ;
        
        while(count < index-1 ) {
           count++;
           current = current.next ;
        }
        
        newNode.next = current.next ;
        current.next = newNode;
    }
    // ------- Read the number at the given index ------
    public int readNumber(int index) {
        
        Node current = head;
        int count = 0 ;
        while(count < index) {
            count++;
            current = current.next;
        }
        return current.data ;
    }
   
}
