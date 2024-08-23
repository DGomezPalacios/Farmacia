package Farmacia;

import java.util.Date;

public class Medicamento {
    private String codigo;
    private String nombre;
    private String tipo;
    private int stock;
    private Date vencimiento;

    // Constructor

    public Medicamento(String codigo, String nombre, String tipo, int stock, Date vencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.vencimiento = vencimiento;
    }


    //Getters and setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }


    //Methods

    public void vender(Cliente cliente) {
        if (stock > 0) {
            stock--;
            cliente.realizarCompra(this);
            System.out.println("Venta realizada: " + nombre + " a " + cliente.getNombre());
        } else {
            System.out.println("Stock insuficiente para " + nombre);
        }
    }

}
