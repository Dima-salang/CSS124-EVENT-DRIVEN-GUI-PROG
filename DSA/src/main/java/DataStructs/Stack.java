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
public class Stack<T> {
    private ArrayList<T> stackList;

    public Stack()
    {
        stackList = new ArrayList<>();
    }


    public void push(T value)
    {
        stackList.add(value);
    }

    public T pop()
    {
        return stackList.remove(stackList.size() - 1);

    }

    public T peak()
    {
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty()
    {
        return stackList.isEmpty();
    }


    public void printStackList()
    {
        for (T value : stackList)
        {
            System.out.print(value + "| ");
            
        }
        System.out.println();
    }
}
