public class controlador {

    public static void main(String[] args) {

        AdminSistemas admin = new AdminSistemas(
                "ADM-01",
                "admin@universidad.edu",
                "admin123"
        );

        Persona usuario = new Persona(
                "Juan Pérez",
                "juan@gmail.com",
                "12345",
                "ESTUDIANTE"
        );

        System.out.println(admin);

        admin.iniciarSesion();
        admin.registrarNuevo(usuario);
        admin.asignarRol(usuario, "ESTUDIANTE");
        admin.modificarUsuario(usuario);
        admin.activarUsuario(usuario);
        admin.desactivarUsuario(usuario);
        admin.administrarCredenciales(usuario);

    }
}