/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JLabel;

public class Persona  implements Comparable<Persona>{
    private String cedula;
    private int edad;
    private String Estado;
   private JLabel Personass;
/**
 * Creacion de Construtores
 * @param cedula Cedula de la persona 
 * @param edad Edad de la Persona
 * @param Estado Estado en el que esta Reserva o Normal
 * @param Personass Es la imgagen que se le asigna 
 */
    public Persona(String cedula, int edad, String Estado,JLabel Personass) {
        super();
        this.cedula = cedula;
        this.edad = edad;
        this.Estado =Estado;
        this.Personass = Personass;
    }

    public JLabel getPersonass() {
        return Personass;
    }

    public void setPersonass(JLabel Personass) {
        this.Personass = Personass;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Nos permite que se muestre correctamente los parametros
     * @return cedula,edad,Estado y localizacion de la persona
     */
    @Override
	public String toString() {
		return  cedula + "-"+ edad +"-"+Estado +":"+ Personass.getLocation().x +":"+Personass.getLocation().y;
	}

    /**
     * Compara las personas por cedula 
     * @param p de la Persona 
     * @return cedula 
     */
    @Override
	public int compareTo(Persona p) {
		return this.cedula.compareTo(p.getCedula());
	
   
    }      
   }