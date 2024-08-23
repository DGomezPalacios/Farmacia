package Farmacia;

public class ProveedorFarmaceutico {
    private String codigoProveedor;
    private String nombre;
    private String medicamentoSuministrado;

    //Constructor
    public ProveedorFarmaceutico(String codigoProveedor, String nombre, String medicamentoSuministrado) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    //Getters and Setters

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoSuministrado() {
        return medicamentoSuministrado;
    }

    public void setMedicamentoSuministrado(String medicamentoSuministrado) {
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    //Methods


}
