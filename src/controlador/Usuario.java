package controlador;

public class Usuario {


    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    private int cedula;
    private String nombre =null;
    private int edad;
    private int telefono;
    private String direccion =null;
    private String correo =null;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getTelefono(){return telefono;}
    public String getDireccion(){
        return direccion;
    }
    public String getCorreo(){
        return correo;
    }

    public void setNombre(int cedula) {
        this.cedula = cedula;
    }
    public void setEdad(int cedula) {
        this.cedula = cedula;
    }
    public void setTelefono(int cedula) {this.cedula = cedula;}
    public void setDireccion(int cedula) {
        this.cedula = cedula;
    }
    public void setCorreo(int cedula) {
        this.cedula = cedula;
    }



}


