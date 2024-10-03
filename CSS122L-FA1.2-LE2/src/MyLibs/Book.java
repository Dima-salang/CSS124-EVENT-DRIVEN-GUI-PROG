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
public class Book {
    private String author;
    private String title;
    private Date pubDate;
    private Publisher publisher;
    
    // function to check the age of the book
    public int checkBookAge()
    {
        // we use the current year as the reference point to determine the age
        if ((2024 - pubDate.getYear()) >= 3)
        {
            return 0;
        } else 
        {
            return 1;
        }
    }
    
    // GETTER AND SETTER METHODS
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
    
}
