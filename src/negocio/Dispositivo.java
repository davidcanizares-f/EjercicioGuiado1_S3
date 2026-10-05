package negocio;
public class Dispositivo {


    private String nombre;
    private String tipo;
    private boolean activo;

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            nombre=" ";
        }
        this.nombre = nombre;
    }

    public void setTipo(String tipo){

        this.tipo = tipo;
    }

    public void setActivo(boolean activo){

        this.activo = activo;
    }

    public String getNombre(){

        return nombre;
    }

    public String getTipo(){

        return tipo;
    }

    public boolean isActivo(){

        return activo;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
    void mostrarEstado() {
        System.out.println(activo ? "Estado: Encendido" : "Estado: Apagado");
    }

    void activar(){
        System.out.println("> Activando " + nombre + "...");
        if(activo == false){
            activo=true;
            System.out.println("El/la " + nombre + " se ha activado");
        } else{
            System.out.println("El/la " + nombre + " ya estaba activo");
        }

    }


}