package Farmacia;

public class Cliente {
    private String numeroCliente;
    private String nombre;
    private String medicamentoAdquirido;

    //Constructor
    public Cliente(String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    //Getters and Setters

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    //Methods
    public void realizarCompra(Medicamento medicamento) {
        this.medicamentoAdquirido = medicamento.getNombre();
        System.out.println("Compra realizada: " + medicamento.getNombre() + " por " + nombre);
    }

    public void devolverMedicamento() {
        if (medicamentoAdquirido != null) {
            System.out.println("Devolución realizada: " + medicamentoAdquirido + " por " + nombre);
            medicamentoAdquirido = null;
        } else {
            System.out.println("No hay medicamento para devolver.");
        }
    }
}
