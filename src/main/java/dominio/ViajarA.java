package dominio;

public class ViajarA extends Dream{
    ViajarA(Persona personaQueVaAViajar,Lugar UnLugar){
        System.out.println("Viaje a "+ UnLugar.getNombre());
        personaQueVaAViajar.lugaresVisitados.add(UnLugar);
    }
}
