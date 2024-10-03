/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructs;

/**
 *
 * @author Luis
 */
public class SinglyStack<T> {
    private SinglyLinkedList<T> stackList;

    public SinglyStack()
    {
        stackList = new SinglyLinkedList<>();
    }

    public void push(T value)
    {
        stackList.insertNode(value);
    }

    public T pop()
    {
        return stackList.popHead();
    }

    public T peak()
    {
        return stackList.peak();
    }

    public int size()
    {
        return stackList.size();
    }
}
