/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Productos {
    //Atributos
    private int cantidadProducto = 0;
    //Metodos getter y setter

    //Metodos
    public int darCantidadDeProductos()
    {
        cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Introducir cantidad de productos por registrar: "));
        return cantidadProducto;
    }
    
    public String[] listaProductos()
    {
        String[] listaProductosArray = new String[cantidadProducto];
        for(int i = 0; i < cantidadProducto; i++)
        {
            listaProductosArray[i] = JOptionPane.showInputDialog("Introduce el nombre del producto: "); //Se asigna el nombre a cada producto, esto se repite la cantidad de veces que se haya especificado en el metodo anterior
        }
        return listaProductosArray;
    }
}
