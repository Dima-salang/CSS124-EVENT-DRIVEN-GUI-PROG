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
public class Product {
    private String name;
    private String code;
    private Date manufacturingDate;

    public Product(String name, String code, Date manufacturingDate)
    {
        this.name = name;
        this.code = code;
        this.manufacturingDate = manufacturingDate;
    }

    /*
     * i used the current year (2024) as the reference point for the manufacturing date.
     * the function returns false if the manufacturingDate is older than 2 years, else returns true.
     */
    public boolean CheckDate()
    {
        return ((2024-manufacturingDate.getYear()) <= 2);
    }

    /*
     * name and code have getter and setter methods as a product can change its name and code 
     * however, the manufacturing date of a product cannot be altered after its creation.
     * So, I did not include any setter methods for the manufacturing date to protect tampering with the member.
     * This is also in accordance with the real world as you cannot change the manufacturing date of a product
     * as it is illegal to do so.
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }
}
