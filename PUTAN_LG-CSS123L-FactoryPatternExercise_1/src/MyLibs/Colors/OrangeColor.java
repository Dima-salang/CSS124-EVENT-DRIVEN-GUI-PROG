package MyLibs.Colors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
/**
 *
 * @author Luis
 */
public class OrangeColor implements IColoring {
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    @Override
    public String colorName() {
        return "ORANGE";
    }
}
