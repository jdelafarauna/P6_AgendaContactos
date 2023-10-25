import java.util.ArrayList;
import java.util.Collection;

public class Agenda {

    ArrayList<Contacto> agenda;

    public void Agenda(){
        agenda = new ArrayList<Contacto>();
    }

    public void AnadirContacto(String nombre, int numero){
        Contacto contacto = new Contacto(nombre,numero);
        if (!(agenda.contains(contacto))) {
            agenda.add(new Contacto(contacto));
        }
    }
    public void anadirContacto(Contacto contacto){
        if (!(agenda.contains(contacto))) {
            agenda.add(new Contacto(contacto));
        }
    }
    public int anadirAgenda(ArrayList<Contacto> agenda2){
        int numero = 0;
        for (int i = 1; i< agenda2.size();i++){
            if (!(agenda.contains(agenda2.get(i)))){
               agenda.add(agenda2.get(i));
               numero += 1;
            }
        }
        return numero;

    }

    public void borrarAagenda(){
        agenda.clear();
    }

    public void borrarContacto(Contacto contacto){
        if (agenda.contains(contacto)){
            agenda.remove(contacto);
        }
    }

    public void borrarContacto(String nombre){
        Contacto aux = new Contacto(nombre,0);
        this.borrarContacto(aux);
    }
    public void mostrarAgenda(){
        agenda.trimToSize();
        System.out.println("Hay " + agenda.size() + " contactos");
        for(Contacto aux : agenda){
           aux.mostrarContacto();
        }
    }

}
