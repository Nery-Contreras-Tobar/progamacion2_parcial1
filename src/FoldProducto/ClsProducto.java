/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoldProducto;
import java.util.Scanner;
/**
 *
 * @author anner
 */
public class ClsProducto {
    private Scanner teclado = new Scanner(System.in);
    private String descripcion;
    private int cantidad;
    private Double valor;
    private Double peso;
    
    public void recolectarInformacion(){
        System.out.println("Ingrese la descripcion del producto: ");
        setDescripcion(getT().nextLine());
        System.out.println("Ingrese la cantidad: ");
        setCantidad(getT().nextInt());
        getT().nextLine();
        System.out.println("Ingrese el valor en factura : ");
        setValor(Double.valueOf(getT().nextLine()));
        System.out.println("Ingrese el peso: ");
        setPeso(Double.valueOf(getT().nextLine()));
    }

    /**
     * @return the ten
     */
    public Scanner getT() {
        return teclado;
    }

    /**
     * @param t the t to set
     */
    public void setT(Scanner t) {
        this.teclado = teclado;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    
}

