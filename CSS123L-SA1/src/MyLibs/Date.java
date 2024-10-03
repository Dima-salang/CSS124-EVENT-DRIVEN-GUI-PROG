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
public class Date {
    private String month;
    private int day;
    private int year;

    public Date(String month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /*
    I only used getter methods as changing the manufacturingDate should be impossible
    to prevent illegal accessing of the members. This is also in accordance with reality
    as we cannot change the manufacturing date of a product after its creation. We can only read it.
    */

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    
}
