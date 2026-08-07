public class Persona{
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;

public Persona (String nombre, String email, String contraseña, String rol) {

    this.nombre = nombre;
    this.email = email;
    this.contraseña = contraseña;
    this.rol = rol;

}

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }



    public String toString() {
        return "=== DATOS DEL USUARIO ===\n" +
                "ID/Nombre : " + nombre + "\n" +
                "Email     : " + email + "\n" +
                "Rol       : " + rol + "\n" +
                "=========================";
    }






}

