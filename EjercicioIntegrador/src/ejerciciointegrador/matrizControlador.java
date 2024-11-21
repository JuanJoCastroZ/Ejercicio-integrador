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
public class matrizControlador {
    //Atributos
    private String[] diasSemana = new String[]{"Lunes" , "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}; //Filas
    private int numProductos = 0;
    private String[] listaDeProductos = new String[numProductos];//Columnas
    private int vendidoDia = 0;
    private int vendidoTotalP = 0; //Guarda el total vendido de X producto
    private String diaMasVentas = "";
    private String mayorVendido = "";
    private int totalVendidoSemana = 0;
    int[] totalGuardado = new int[listaDeProductos.length];
    //Metodo constructor

    public matrizControlador(int numProductos, String[] listaDeProductos) {
        this.numProductos = numProductos;
        this.listaDeProductos = listaDeProductos;
        //Empieza a llamar los metodos
        martizReporte(diasSemana.length, this.listaDeProductos.length);
    }
    
    //Metodos getter y setter

    public String[] getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(String[] diasSemana) {
        this.diasSemana = diasSemana;
    }

    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }

    public int getVendidoDia() {
        return vendidoDia;
    }

    public void setVendidoDia(int vendidoDia) {
        this.vendidoDia = vendidoDia;
    }

    public int getVendidoTotalP() {
        return vendidoTotalP;
    }

    public void setVendidoTotalP(int vendidoTotalP) {
        this.vendidoTotalP = vendidoTotalP;
    }

    public String getMayorVendido() {
        return mayorVendido;
    }

    public void setMayorVendido(String mayorVendido) {
        this.mayorVendido = mayorVendido;
    }
    //Metodos
    public String[][] martizReporte(int filas, int prods)
    {
        String[][] matrizReporteGeneral  = new String[filas][3];
        System.out.println("Dia\tProducto\tVendido");
        for(int i = 0; i < filas; i++)
        {
            matrizReporteGeneral[i][0] = diasSemana[i];
            System.out.print(matrizReporteGeneral[i][0] + "\t");
            int ventasMayor = 0;
            for(int j = 1; j <= prods; j++)
            {
                System.out.print(listaDeProductos[(j - 1)] + " \t");
                int vendidoHoy = Integer.parseInt(JOptionPane.showInputDialog("Introduzca lo vendido de este producto el dia" + i + ": "));
                int totalHoy = 0;
                //totalHoy = totalHoy + 
                int id = j;
                System.out.print(vendidoHoy + "\n \t");
                //if vendido
                
            }
            System.out.println("\n");
            
        }
        for(int i = 0; i < prods; i++)
        {
            System.out.println("El total vendido de " + listaDeProductos[i] + " es de: " + totalGuardado[i]);
        }
        System.out.println("ejerciciointegrador.matrizControlador.martizReporte()");
        return matrizReporteGeneral;
    }
    public void Sumar(int Vendido, int id)
    {
        
        for(int i = 0; i < listaDeProductos.length; i++)
        {
            totalGuardado[i] = totalGuardado[i] + Vendido;
        }
        
    }
    
}
