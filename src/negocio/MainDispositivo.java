package negocio;

public class MainDispositivo {

    public static void main() {

        Dispositivo dispositivo1 = new Dispositivo();
        /*dispositivo1.nombre= "Laptop";
        dispositivo1.tipo = "Computadora";
        dispositivo1.activo= true;*/

        dispositivo1.setNombre("Laptop");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(true);
        System.out.println("Nombre: " + dispositivo1.getNombre());
        System.out.println("Tipo: " + dispositivo1.getTipo());
        System.out.println(dispositivo1.isActivo() ? "Estado: Activo" : "Estado: No Activo");
        System.out.println("----------------------------------");

        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo2.setNombre("Televisor");
        dispositivo2.setTipo("Dispositivo Multimedia");
        dispositivo2.setActivo(false);
        System.out.println("Nombre: " + dispositivo2.getNombre());
        System.out.println("Tipo: " + dispositivo2.getTipo());
        System.out.println(dispositivo2.isActivo() ? "Estado: Activo" : "Estado: No Activo");
        System.out.println("----------------------------------");





        /*System.out.println("=== DISPOSITIVO 1 ===");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println();


        System.out.println("=== DISPOSITIVO 2 ===");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        dispositivo1.activo = false;
        System.out.println("\n---------------------------");
        System.out.println(">>>>> CAMBIO DE ATRIBUTOS <<<<<");
        System.out.println("=== DISPOSITIVO 1 ===");
        dispositivo1.mostrarEstado();
        dispositivo1.activar();
        dispositivo1.activar();*/
    }
}