/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

/**
 *
 * @author alvarados
 */
/**
 * informacion de facturacion
 *
 * @author alvarados
 */
public class Factura {

    private String NombreCliente;
    private int codigoFactura;
    private int monto;
    private int numeroMes;
    private boolean automotriz;
    private boolean electrico;
    private boolean contruccion;

    public Factura(String NombreCliente, int codigoFactura, int monto, int numeroMes, boolean automotriz, boolean electrico, boolean contruccion) {
        this.NombreCliente = NombreCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.numeroMes = numeroMes;
        this.automotriz = automotriz;
        this.electrico = electrico;
        this.contruccion = contruccion;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setNumeroMes(int numeroMes) {
        if (numeroMes <= 12) {
            this.numeroMes = numeroMes;
        } else {
            System.out.println("Fecha invalida");

        }
        this.numeroMes = numeroMes;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public int getMonto() {
        return monto;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public boolean isAutomotriz() {
        return automotriz;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public boolean isContruccion() {
        return contruccion;
    }

    public void setAutomotriz(boolean automotriz) {
        this.automotriz = automotriz;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public void setContruccion(boolean contruccion) {
        this.contruccion = contruccion;
    }

}
