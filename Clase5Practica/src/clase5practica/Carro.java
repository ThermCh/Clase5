package clase5practica;

public class Carro {

    public String make;
    public String model;
    public String year;

    public void crearCarro(String marca, String modelo, String anio) {
        this.make = marca;
        this.model = modelo;
        this.year = anio;
    }

    public String vehiculoNuevo() {
        String mensaje = "";
        int anio = Integer.parseInt(this.year);
        if (anio > 2023) {
            mensaje = "El carro es del año";

        } else {
            mensaje = "El carro no es del año";
        }
        return mensaje;
    }
}
