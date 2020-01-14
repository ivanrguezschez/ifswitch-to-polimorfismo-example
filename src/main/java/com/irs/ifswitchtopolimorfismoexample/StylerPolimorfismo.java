package com.irs.ifswitchtopolimorfismoexample;

/**
 * Clase de ejemplo con polimorfismo.
 * 
 * @author irs
 * @version 1.0.0
 */
public class StylerPolimorfismo {

    public String setStyle(String input, IStyler styler) {
        return styler.setStyle(input);
    }
}
