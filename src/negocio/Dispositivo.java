package negocio;
public class Dispositivo {


    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            nombre = "[!] Nombre Vacío (llenar)";
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.isBlank()) {
            tipo = "[!] Tipo Vacío (llenar)";
        }
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setActivo(boolean activo) {

        this.activo = activo;
    }

    public boolean isActivo() {

        return activo;
    }

    void activar() {
        System.out.println("> Activando " + nombre + "...");
        if (activo == false) {
            activo = true;
            System.out.println("El/la " + nombre + " se ha activado");
        } else {
            System.out.println("El/la " + nombre + " ya estaba activo");
        }
    }

    void desactivar() {
        System.out.println("> Desactivando " + nombre + "...");
        if (activo == true) {
            activo = false;
            System.out.println("El/la " + nombre + " se ha desactivado");
        } else {
            System.out.println("El/la " + nombre + " ya estaba desactivado");
        }
    }
}


    /*public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
    void mostrarEstado() {
        System.out.println(activo ? "Estado: Encendido" : "Estado: Apagado");
    }*/


