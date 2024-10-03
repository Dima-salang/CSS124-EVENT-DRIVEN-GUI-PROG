/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;
import java.util.ArrayList;
/**
 *
 * @author Luis
 */
public class ConcreteSubject implements ISubject {
    ArrayList<IObserver> subscribers = new ArrayList<IObserver>();

    // message variable is used to compose the message
    public String newMessage;

    public void subscribe(IObserver observer){
        subscribers.add(observer);
    }

    public void unSubscribe(IObserver observer) {
        subscribers.remove(observer);
    }

    public void notifySubscribers() {
        for (IObserver observer : subscribers) {
            observer.update();
        }
    }
}
