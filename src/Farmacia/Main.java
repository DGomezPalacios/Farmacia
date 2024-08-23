package Farmacia;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.printf("¡Bienvenido/a a la Farmacia Comunitaria!\n");

        SistemaGestionInventarios sistema = new SistemaGestionInventarios();

        Medicamento paracetamol = new Medicamento("0001", "Paracetamol", "Analgesico", 500, new Date());
        Cliente cliente1 = new Cliente("0001", "Margarita Muñoz");

        sistema.registrarVenta(cliente1, paracetamol);

        sistema.generarInformeVentas();
    }
}
