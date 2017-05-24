/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.mgamble.fs.xmlbindings;

import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author mgamble
 */
public class Param {
    private String name;
    private String value;

    
    public Param() {
        
    }
    public Param(String name) {
        this.name = name;
    }
    
    public Param(String name, String value) {
        this.name = name;
        this.value = value;
    }
    
    public Param(String name, int value) {
        this.name = name;
        this.value = Integer.toString(value);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    @XmlAttribute
    public void setValue(String value) {
        this.value = value;
    }
    
}
