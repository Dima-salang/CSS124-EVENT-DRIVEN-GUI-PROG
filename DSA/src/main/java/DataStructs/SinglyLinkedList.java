/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructs;

import java.util.NoSuchElementException;

/**
 *
 * @author Luis
 * @param <T>
 */

 // maybe we can just inherit from the singlyLinkedList
public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    public SinglyLinkedList()
    {
        this.head = null;
    }

    // inserts a node at the beginning of the list - O(1)
    public void insertNode(T value)
    {
        // we create a new node
        Node<T> newNode = new Node<T>(value);

        // if the list is empty, we assign newNode as the head of the list 
        if (head == null)
        {
            head = newNode;
        } else
        {
            /* we set the next of the newNode to the head to preserve its values
             * we then update the head to copy the contents of newNode to the variable
             * this works because the next is Node type itself meaning that it will store 
             * the object head itself which will preserve its contents.
             */
            newNode.setNext(head);
            head = newNode;
        }

        size++;
    }

    // insert a node at the tail of the list - O(n)
    public void insertNodeBack(T value)
    {
        // we create a new node
        Node<T> newNode = new Node<>(value);

        // if the list is empty, we just assign the newNode as the head
        if (head == null)
        {
            head = newNode;
        } else
        {
            // we create a tempNode because we don't want to update head which is an instance variable
            Node<T> tempNode = head;

            /* we just get the next of the head until we reach the last node which has its next as null
             * this works because we are creating an tempNode instance and copying the contents of head
             * but the next of the head is a real object in which we can get the next of until the last node
             */
            while (tempNode.getNext() != null)
            {   
                tempNode = tempNode.getNext();
            }

            // we just set the next of the last node to point to the newNode which has its next as null by default
            tempNode.setNext(newNode);
        }
        size++;
    }

    public T popHead()
    {
        if (head == null)
        {
            throw new NoSuchElementException("List is empty...");
        }
        
        // presever the head value
        T headValue = head.getValue();

        // update the head to be the next of the previous head
        head = head.getNext();

        return headValue;
    }

    public T popTail()
    {
        if (head == null)
        {
            throw new NoSuchElementException("List is empty...");
        }

        Node<T> tempNode = head;
        
        // we want to stop at the 2nd to the last node
        while(tempNode.getNext().getNext() != null)
        {
            tempNode = tempNode.getNext();
        }
        
        // we set the 2nd to the last node's next to point to null
        // effectively, the last node does not have reference to it anymore, it will be garbage collected
        tempNode.setNext(null);
        return tempNode.getValue();
    }

    // returns the head - O(1)
    public T peak()
    {
        if (head==null)
        {
            throw new NoSuchElementException("List is empty...");
        }
        return head.getValue();
    }

    public T peakTail()
    {
        if (head==null)
        {
            throw new NoSuchElementException("List is empty...");
        }

        Node<T> tempNode = head;
        while (tempNode.getNext() != null)
        {
            tempNode = tempNode.getNext();
        }

        return tempNode.getValue();

    }

    // checks whether the list is empty - O(1)
    public boolean isEmpty()
    {
        return head == null;
    }

    public int size()
    {
        return size;
    }

    // traverses the list and prints out the nodes - O(n)
    public void printList()
    {
        if (head == null)
        {
            throw new NoSuchElementException("List is empty...");
        } else
        {
            Node<T> tempNode = head;
            while (tempNode.getNext() != null)
            {
                System.out.print(tempNode.getValue() + "-> ");
                tempNode = tempNode.getNext();
            }
            System.out.print(tempNode.getValue());
            System.out.println();
        }
    }

}
