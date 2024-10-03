/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

import MyLibs.*;

/**
 *
 * @author Luis
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        IObserver o1 = new ConcreteObserver(subject, "John");
        IObserver o2 = new ConcreteObserver(subject, "Paul");
        IObserver o3 = new ConcreteObserver(subject, "Luis");
        IObserver o4 = new ConcreteObserver(subject, "Ejay");


        System.out.println("Part 1\n");

        // send a message
        subject.newMessage = "Hello";
        subject.notifySubscribers();

        // No output because nobody has subscribed yet
        // John and Paul, Luis and Ejay will now subscribe
        System.out.println("Part 2\n");
        subject.subscribe(o1);
        subject.subscribe(o2);
        subject.subscribe(o3);
        subject.subscribe(o4);

        
        // send a message again
        subject.newMessage = "Hello guys";
        subject.notifySubscribers();


        // John and Ejay will unsubscribe
        subject.unSubscribe(o1);
        subject.unSubscribe(o4);

        System.out.println("Part 3\n");
        // send a message again
        subject.newMessage = "Good day";
        subject.notifySubscribers();

        // Only Paul and Luis should receive "Good day" 


    }
}
