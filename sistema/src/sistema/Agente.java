/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author alvarados
 */
public class Agente {

    /**
     * informacion agente
     */
    private String nombreA;
    private String codigoAgente;
    private String cedulaAgente;
    private String sucursal;
    private boolean tieneCarro;

    public Agente(String nombreA, String codigoAgente, String cedulaAgente, String sucursal, boolean tieneCarro) {
        this.nombreA = nombreA;
        this.codigoAgente = codigoAgente;
        this.cedulaAgente = cedulaAgente;
        this.sucursal = sucursal;
        this.tieneCarro = tieneCarro;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public void setCodigoAgente(String codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public void setCedulaAgente(String cedulaAgente) {
        this.cedulaAgente = cedulaAgente;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setTieneCarro(boolean tieneCarro) {
        this.tieneCarro = tieneCarro;
    }

    public String getNombreA() {
        return nombreA;
    }

    public String getCodigoAgente() {
        return codigoAgente;
    }

    public String getCedulaAgente() {
        return cedulaAgente;
    }

    public String getSucursal() {
        return sucursal;
    }

    public boolean isTieneCarro() {
        return tieneCarro;
    }

}
