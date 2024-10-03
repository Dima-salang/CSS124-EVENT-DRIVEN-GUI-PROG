/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructs;
import java.util.ArrayList;
/**
 *
 * @author Luis
 */
public class Queue<T> {
    private ArrayList<T> queueList;

    public Queue()
    {
        queueList = new ArrayList<>();
    }

    public void enqueue(T value)
    {
        queueList.add(value);
    }

    public T dequeue()
    {
        return queueList.remove(0);
    }

    public T peak()
    {
        return queueList.get(0);
    }

    public boolean isEmpty()
    {
        return queueList.isEmpty();
    }

    public int queueSize()
    {
        return queueList.size();
    }

    public void printQueueList()
    {
        System.out.println(queueList);
    }


}
