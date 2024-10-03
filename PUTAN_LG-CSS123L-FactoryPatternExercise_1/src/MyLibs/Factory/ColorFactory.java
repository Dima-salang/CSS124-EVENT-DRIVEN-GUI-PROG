package MyLibs.Factory;


import MyLibs.Colors.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class ColorFactory {
    
    public IColoring createColor(int comboIndex)
    {
        switch (comboIndex)
        {
            case 0: return new RedColor(); 
            case 1: return new BlueColor();
            case 2: return new LightGrayColor();
            case 3: return new CyanColor();
            case 4: return new GrayColor();
            case 5: return new GreenColor();
            case 6: return new OrangeColor();
            case 7: return new MagentaColor();
            case 8: return new PinkColor();
            case 9: return new YellowColor();

        }
        throw new IllegalArgumentException("Invalid index...");
    }
}
