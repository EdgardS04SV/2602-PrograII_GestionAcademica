public class AdminSistemas extends Persona {

public AdminSistemas (String nombre, String email, String contra){
super(nombre, email, contra, "ADMINISTRADOR_SISTEMA");
}

public void registrarNuevo(Persona usuario){
    System.out.println("Administrador: Registrando usuario" + usuario.getNombre());
}













}
