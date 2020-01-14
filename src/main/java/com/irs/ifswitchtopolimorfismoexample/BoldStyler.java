package com.irs.ifswitchtopolimorfismoexample;

/**
 * Implementación del interface del estilo para negrita.
 * 
 * @author irs
 * @version 1.0.0
 */
public class BoldStyler implements IStyler {

    public BoldStyler() {
    }

    public String setStyle(String input) {
        return "<b>" + input + "</b>";
    }
}
