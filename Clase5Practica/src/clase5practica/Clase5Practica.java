package clase5practica;

public class Clase5Practica {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Chofer chofer1 = new Chofer();
        Chofer chofer2 = new Chofer();

        chofer1.name = "Juan";
        chofer2.name = "Javier";

        //Carro 1 Chofer 1
        carro1.crearCarro("Toyota", "Spark", "2010");
        chofer1.asignarRuta("Heredia");
        chofer1.mostrarCarro(carro1.make, carro1.model);

        System.out.println(carro1.vehiculoNuevo());

        //Carro 2 Chofer 2
        carro2.crearCarro("Lexus", "Spa", "2024");
        chofer2.asignarRuta("San Jose");
        chofer2.mostrarCarro(carro2.make, carro2.model);
        
        System.out.println(carro2.vehiculoNuevo());
        
    }

}
