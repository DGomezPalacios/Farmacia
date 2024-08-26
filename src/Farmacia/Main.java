package Farmacia;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenido/a a la Farmacia Comunitaria!");

        // Instanciar el sistema de gestión de inventarios
        SistemaGestionInventarios sistema = new SistemaGestionInventarios();

        // Registrar un nuevo medicamento a través de la consola
        Medicamento medicamento = sistema.registrarMedicamento();

        // Registrar un nuevo cliente a través de la consola
        Cliente cliente = sistema.registrarCliente();

        // Registrar la venta del medicamento
        sistema.registrarVenta(cliente, medicamento);

        // Generar el informe de ventas
        sistema.generarInformeVentas();
    }
}
