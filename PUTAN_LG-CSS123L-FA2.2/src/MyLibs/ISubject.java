/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author Luis
 */
public interface ISubject {
    void subscribe(IObserver observer);
    void unSubscribe(IObserver observer);
    void notifySubscribers();
}
