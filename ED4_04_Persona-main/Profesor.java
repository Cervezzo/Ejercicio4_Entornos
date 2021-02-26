import java.util.List;

public class Profesor extends Persona{
    String str;
    int edad;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {
        super(numeroDeTelefono);
    }

    public void printInformacionPersonal(){
        toStringPersonal();
    }

    public void printTodaLaInformacion(){
        toStringPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

    private void toStringPersonal() { //Creo un toString propio para que los metodos printX lo utilicen
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + numeroDeTelefono);
    }

}
