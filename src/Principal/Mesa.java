/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Mesa {
    private String Estado;
    private int numMesa;
    private JLabel Mesass;
    /**
     * Creacion de constructor de mesa
     * @param Estado El como se encuentra la mesa 
     * @param numMesa Cual es el numero de las mesas 
     * @param Mesass La imagen que se crea
     */
    public Mesa(String Estado, int numMesa,JLabel Mesass) {
        super();
		this.Estado = Estado;
		this.numMesa = numMesa;
                this.Mesass = Mesass;
    }

    public JLabel getMesass() {
        return Mesass;
    }

    public void setMesass(JLabel Mesass) {
        this.Mesass = Mesass;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
   

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }
    /**
     * Para observar de mejor manera los parametros 
     * @return  Estado,numMesa y localizacion de las mesas.
     */
    @Override
	public String toString() {
		return "Mesa [Estado=" + Estado + ", numMesa=" + numMesa + "]"+ Mesass.getLocation().x +":"+ Mesass.getLocation().y;
	}
    
    
}
