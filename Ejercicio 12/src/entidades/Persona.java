/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author tomic
 */
public class Persona {

    private String name;
    private Date nacimiento;

    public Persona() {

    }
    

    ;
    
    public Persona(String name, Date nacimiento) {

        this.name = name;
        this.nacimiento = nacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return nacimiento;
    }

    public void setDate(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", nacimiento=" + nacimiento + '}';
    }
    
    

}
