package dominio;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    protected int Edad;
    /*
    1. Recibirse de una carrera: por ejemplo, de “Ingeniero en Sistemas de
    Información”, “Odontólogo” o “Licenciado en Psicología”.
    2. Tener un hijo.
    3. Adoptar una cantidad x de hijos.
    4. Viajar a un lugar, como “Chapadmalal” o “Tahití”.
    5. Conseguir un laburo donde se gane una cantidad x de plata
    */
    protected Carrera queQuieroEstudiar;
    protected int hijosQueQuieroTener;
    protected int hijosQueQuieroAdoptar;
    protected List<Lugar> lugaresQueQuieroVisitar;
    protected double sueldoQueQuieroTener;
    protected int cantidadHijos;

    Persona(int edad){
        this.Edad = edad;
        this.cantidadHijos = 0;
        this.lugaresQueQuieroVisitar = new ArrayList<>();
    }

    public void agregarLugarAVisitar(Lugar unLugar){
        this.lugaresQueQuieroVisitar.add(unLugar);
    }
}
