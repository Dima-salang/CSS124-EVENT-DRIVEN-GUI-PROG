package MyLibs.Colors;


import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonette
 */
public class RedColor implements IColoring{

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public String colorName() {
        return "RED";
    }
    
}
