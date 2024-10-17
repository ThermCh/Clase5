package clase5practica;

public class Chofer {

    public String route;
    public String id;
    public String name;

    //Metodo
    public void asignarRuta(String ruta) {
        this.route = ruta;

    }

    public void mostrarCarro(String make, String model) {
        System.out.println("El chofer: " + this.name + " Tiene el carro " + make + " " + model);

    }

}
