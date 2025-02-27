/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author alvarados
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void sistema(Strings[] args) {
        String nombreA = JOptionPane.showInputDialog("Nombre del agente: ");
        String codigoAgente = JOptionPane.showInputDialog("Codigo del agente: ");
        String cedulaAgente = JOptionPane.showInputDialog("Cedula del agente");
        String sucursal = JOptionPane.showInputDialog("Sucursal del agente: ");
        boolean tieneCarro = JOptionPane.showConfirmDialog("Tiene carro? ");

        Agente agente = new Agente(nombreA, codigoAgente, cedulaAgente, sucursal, tieneCarro);

        String nombreCliente = JOptionPane.showInputDialog("nombre del cliente: ");
        String cedulaCliente = JOptionPane.showInputDialog("Cédula del cliente: ");
        String codigoFactura = JOptionPane.showInputDialog("Código de la factura: ");
        double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Monto de la factura: "));
        int numeroMes = Integer.parseInt(JOptionPane.showInputDialog("Número del mes (1-12):"));
        boolean contieneElectricos = JOptionPane.showConfirmDialog("¿Contiene productos eléctricos? ") 
        boolean contieneAutomotriz = JOptionPane.showConfirmDialog("¿Contiene productos automotrices? ") 
        boolean contieneConstruccion = JOptionPane.showConfirmDialog("¿Contiene productos de construcción? ") 

        Cliente cliente = new Cliente(nombreCliente, cedulaCliente, codigoFactura, montoFactura, numeroMes);
        Factura factura = new Factura(nombreCliente, numeroMes, numeroMes, numeroMes, contieneAutomotriz, tieneCarro, contieneConstruccion)
        
        
        

    }

}
