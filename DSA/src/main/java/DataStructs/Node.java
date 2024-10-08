/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructs;

/**
 *
 * @author Luis
 * @param <T>
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value)
    {
        this.value = value;
        this.next = null;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    public Node<T> getNext()
    {
        return next;
    }


    public void setNext(Node<T> next)
    {
        this.next = next;
    }




}
