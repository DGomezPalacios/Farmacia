package Farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class SistemaGestionInventarios {
    private String medicamentoActual;
    private String clienteActual;
    private String proveedorActual;
    private List<String> registroVentas;

    // Constructor sin parámetros
    public SistemaGestionInventarios() {
        this.medicamentoActual = "";
        this.clienteActual = "";
        this.proveedorActual = "";
        this.registroVentas = new ArrayList<>();
    }

    // Métodos de la clase
    public void registrarMedicamento(Medicamento medicamento) {
        this.medicamentoActual = medicamento.getNombre();
        System.out.println("Medicamento registrado: " + medicamentoActual);
    }

    public void registrarCliente(Cliente cliente) {
        this.clienteActual = cliente.getNombre();
        System.out.println("Cliente registrado: " + clienteActual);
    }

    public void registrarProveedor(ProveedorFarmaceutico proveedor) {
        this.proveedorActual = proveedor.getNombre();
        System.out.println("Proveedor registrado: " + proveedorActual);
    }

    public void registrarVenta(Cliente cliente, Medicamento medicamento) {
        String registro = "Cliente: " + cliente.getNombre() +
                ", Medicamento: " + medicamento.getNombre() +
                ", Fecha: " + new Date();
        registroVentas.add(registro);
        System.out.println("Venta registrada: " + registro);
    }

    public void generarInformeVentas() {
        System.out.println("Generando informe de ventas...");
        if (registroVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (String venta : registroVentas) {
                System.out.println(venta);
            }
        }
    }

    // Getters y Setters
    public String getMedicamentoActual() {
        return medicamentoActual;
    }

    public void setMedicamentoActual(String medicamentoActual) {
        this.medicamentoActual = medicamentoActual;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }
}

