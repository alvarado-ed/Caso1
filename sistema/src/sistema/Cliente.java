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
/**
 * informacion cliente
 *
 * @author alvarados
 */
public class Cliente {

    private String nombreCliente;
    private int cedulaCliente;
    public int codigoFactura;
    private double montoFactura;
    private int numeroMes;

    public Cliente(String nombreCliente, int cedulaCliente, int codigoFactura, double montoFactura, int numeroMes) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.numeroMes = numeroMes;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

}
