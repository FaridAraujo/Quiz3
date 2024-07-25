/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz3;

import javax.swing.JOptionPane;

/**
 *
 * @author Farid
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreCliente;
        String nombreTrabajador;
        String nombreSuper;

        int codSuper;

        int cedulaTrabajador;
        int cantidadProducto;

        double precioBase;
        int codeProduct;
        String tipoProducto;

        double precioFinal;
        double gananciaEsperada;

        // Print de bienvenida y solicitar datos del supermercado y del trabajador
        JOptionPane.showMessageDialog(null, "Bienvenido a Super Chino");
        nombreTrabajador = JOptionPane.showInputDialog("Favor ingrese su nombre: ");
        cedulaTrabajador = Integer.parseInt(JOptionPane.showInputDialog(nombreTrabajador + ", Ingrese su numero de cedula: "));

        nombreSuper = JOptionPane.showInputDialog("Porfavor ingrese el nombre del supermercado: ");
        codSuper = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el nombre de la sucursal del " + nombreSuper + " en el que se encuentra"));
        cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de productos que desee añadir: "));
        for (int i = 0; i < cantidadProducto; i++) {

            tipoProducto = JOptionPane.showInputDialog("Ingrese el tipo de producto que desee añadir: ");
            codeProduct = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto que desee añadir: "));

        }
    
    }
}
