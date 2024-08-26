package Farmacia;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

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

    // Metodo para capturar un medicamento por pantalla
    public Medicamento registrarMedicamento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del medicamento:");
        String codigo = scanner.nextLine();

        System.out.println("Ingrese el nombre del medicamento:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el tipo de medicamento:");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese la cantidad en stock:");
        int stock = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la fecha de caducidad (en formato YYYY-MM-DD):");
        String fechaCaducidadStr = scanner.nextLine();
        Date caducidad = java.sql.Date.valueOf(fechaCaducidadStr);

        Medicamento medicamento = new Medicamento(codigo, nombre, tipo, stock, caducidad);
        this.medicamentoActual = medicamento.getNombre();
        System.out.println("Medicamento registrado: " + medicamentoActual);

        return medicamento;
    }

    // Metodo para registrar un cliente solicitando los datos por pantalla
    public Cliente registrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cliente:");
        String numeroCliente = scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        Cliente cliente = new Cliente(numeroCliente, nombre);
        this.clienteActual = cliente.getNombre();
        System.out.println("Cliente registrado: " + clienteActual);

        return cliente;
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

