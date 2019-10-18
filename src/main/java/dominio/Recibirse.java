package dominio;

public class Recibirse extends Dream{
    Recibirse(Persona personaQueVaARecibirse,Carrera unaCarrera){
        System.out.println("Me Recibi de "+ unaCarrera.getNombre());
        personaQueVaARecibirse.carrerasDeLasQueMeRecibi.add(unaCarrera);
    }
}
