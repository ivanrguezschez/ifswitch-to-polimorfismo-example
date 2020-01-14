package com.irs.ifswitchtopolimorfismoexample;

/**
 * Implementación del interface del estilo para subrayado.
 * 
 * @author irs
 * @version 1.0.0
 */
public class UnderlineStyler implements IStyler {

    public UnderlineStyler() {
    }

    public String setStyle(String input) {
        return "<u>" + input + "</u>";
    }
}
