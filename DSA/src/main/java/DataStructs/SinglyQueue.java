/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructs;

/**
 *
 * @author Luis
 */
public class SinglyQueue<T> {
    private SinglyLinkedList<T> queueList;

    public SinglyQueue()
    {
        queueList = new SinglyLinkedList<>();
    }

    public void enqueue(T value)
    {
        queueList.insertNode(value);
    }

    public T dequeue()
    {
        return queueList.popTail();
    }

    public int size()
    {
        return queueList.size();
    }

    public T peakHead()
    {
        return queueList.peak();
    }

    public T peakTail()
    {
        return queueList.peakTail();
    }
}
