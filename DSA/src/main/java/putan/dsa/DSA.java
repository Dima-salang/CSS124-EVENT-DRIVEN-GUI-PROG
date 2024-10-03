/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package putan.dsa;
import DataStructs.*;
/**
 *
 * @author Luis
 */
public class DSA {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.insertNode(1);
        list1.insertNode(2);
        list1.insertNode(3);
        list1.insertNodeBack(5);
        list1.popHead();
        list1.popTail();
        System.out.println(list1.isEmpty());
        System.out.println("Top: " + list1.peak());


        list1.printList();

        // STACKS
        System.out.println("STACKS");

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        stack1.printStackList();

        stack1.pop();
        stack1.printStackList();


        // QUEUES
        System.out.println("QUEUES");
        Queue<Integer> queue1 = new Queue<>();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.dequeue();

        queue1.printQueueList();
    }
}
