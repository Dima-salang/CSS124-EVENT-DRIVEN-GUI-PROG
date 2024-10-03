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


        // SETTING INPUTS
        
        // BOOK 1
        
        // create a new book instance
        Book book1 = new Book();
        book1.setAuthor("Nassim, Taleb");
        book1.setTitle("Antifragile");

        // create a new date instance
        book1.setPubDate(new Date());
        book1.getPubDate().setDay(27);
        book1.getPubDate().setMonth(11);
        book1.getPubDate().setYear(2012);
        
        // create a new publisher instance
        book1.setPublisher(new Publisher());
        book1.getPublisher().setName("Random House");
        
        // create a new address instance
        book1.getPublisher().setAddress(new Address());
        book1.getPublisher().getAddress().setCountry("United States of America");
        book1.getPublisher().getAddress().setCity("Manhattan");
        book1.getPublisher().getAddress().setNumber(9407868);
        // END OF BOOK 1
        
        // Everything with book1 is applied to book2 and book3


        // BOOK 2
        Book book2 = new Book();
        book2.setAuthor("Daniel, Kahneman");
        book2.setTitle("Thinking, Fast and Slow");

        
        book2.setPubDate(new Date());
        book2.getPubDate().setDay(25);
        book2.getPubDate().setMonth(10);
        book2.getPubDate().setYear(2011);
        
        book2.setPublisher(new Publisher());
        book2.getPublisher().setName("Farrar, Straus and Giroux");

        book2.getPublisher().setAddress(new Address());
        book2.getPublisher().getAddress().setCountry("United States of America");
        book2.getPublisher().getAddress().setCity("New York");
        book2.getPublisher().getAddress().setNumber(7416900);
        // END OF BOOK 2

        // BOOK 3
        Book book3 = new Book();
        book3.setAuthor("J.K. Rowling");
        book3.setTitle("Harry Potter and the Deathly Hallows");

        
        book3.setPubDate(new Date());
        book3.getPubDate().setDay(21);
        book3.getPubDate().setMonth(7);
        book3.getPubDate().setYear(2007);
        
        book3.setPublisher(new Publisher());
        book3.getPublisher().setName("Bloomsbury Publishing");

        book3.getPublisher().setAddress(new Address());
        book3.getPublisher().getAddress().setCountry("United Kingdom");
        book3.getPublisher().getAddress().setCity("London");
        book3.getPublisher().getAddress().setNumber(3308477);
        // END OF BOOK 3
        
        // OUTPUTTING
        System.out.println("\nBook Information Program");
        System.out.println("__________________________\n");

        // BOOK 1
        System.out.println(book1.getAuthor() + ". " + book1.getTitle() + ". " + book1.getPublisher().getName()
                            + ", " + book1.getPublisher().getAddress().getCity() + ", " +
                            book1.getPublisher().getAddress().getCountry() + ". " + book1.getPubDate().convertMonth() +
                            " " + book1.getPubDate().getYear());
        System.out.println("---------------------------------------------------------------------------------------------");


        // BOOK 2
        System.out.println(book2.getAuthor() + ". " + book2.getTitle() + ". " + book2.getPublisher().getName()
                    + ", " + book2.getPublisher().getAddress().getCity() + ", " +
                    book2.getPublisher().getAddress().getCountry() + ". " + book2.getPubDate().convertMonth() +
                    " " + book2.getPubDate().getYear());
        System.out.println("---------------------------------------------------------------------------------------------");

        // BOOK 3
        System.out.println(book3.getAuthor() + ". " + book3.getTitle() + ". " + book3.getPublisher().getName()
                    + ", " + book3.getPublisher().getAddress().getCity() + ", " +
                    book3.getPublisher().getAddress().getCountry() + ". " + book3.getPubDate().convertMonth() +
                    " " + book3.getPubDate().getYear());
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
