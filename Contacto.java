import java.time.LocalDate;

public class Contacto {

    private String nombre;
    private int numero;
    private LocalDate fecha;


    public Contacto(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    public Contacto(Contacto contacto) {

        this.nombre = contacto.nombre;
        this.numero = contacto.numero;
        this.fecha  = contacto.fecha;

    }
    public void mostrarContacto(){
        System.out.println(this.nombre + this.numero + this.fecha);
    }



}
