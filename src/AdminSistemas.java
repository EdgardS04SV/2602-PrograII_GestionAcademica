public class AdminSistemas extends Persona {

    public AdminSistemas(String nombre, String email, String contra) {
        super(nombre, email, contra, "ADMINISTRADOR_SISTEMA");
    }

    public void registrarNuevo(Persona usuario) {
        System.out.println("Administrador: Registrando usuario " + usuario.getNombre());
    }

    public void iniciarSesion() {
        System.out.println("Inicio de sesión exitoso.");
    }

    public void asignarRol(Persona usuario, String rol) {
        System.out.println("Rol " + rol + " asignado a " + usuario.getNombre());
    }

    public void modificarUsuario(Persona usuario) {
        System.out.println("Información del usuario " + usuario.getNombre() + " modificada.");
    }

    public void activarUsuario(Persona usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " activado.");
    }

    public void desactivarUsuario(Persona usuario) {
        System.out.println("Usuario " + usuario.getNombre() + " desactivado.");
    }

    public void administrarCredenciales(Persona usuario) {
        System.out.println("Credenciales actualizadas para " + usuario.getNombre());
    }
}

