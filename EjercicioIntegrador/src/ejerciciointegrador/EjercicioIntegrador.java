/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointegrador;

/**
 *
 * @author Aulas Heredia
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Productos lista = new Productos();
        matrizControlador controlador = new matrizControlador(lista.darCantidadDeProductos(), lista.listaProductos());
        
        
    }
    
}
