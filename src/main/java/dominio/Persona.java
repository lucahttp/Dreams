package dominio;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    protected String nombre;
    protected int edad;
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
    protected List<Lugar> lugaresVisitados;
    protected List<Carrera> carrerasDeLasQueMeQuieroRecibir;
    protected List<Carrera> carrerasDeLasQueMeRecibi;
    protected double sueldo;
    protected int cantidadHijos;

    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadHijos = 0;
        this.lugaresQueQuieroVisitar = new ArrayList<>();
        this.lugaresVisitados = new ArrayList<>();
        this.carrerasDeLasQueMeQuieroRecibir = new ArrayList<>();
        this.carrerasDeLasQueMeRecibi = new ArrayList<>();
    }

    public void agregarLugarAVisitar(Lugar unLugar){
        this.lugaresQueQuieroVisitar.add(unLugar);
    }
    public void agregarLugarVisitado(Lugar unLugar){
        this.lugaresVisitados.add(unLugar);
    }


    public void agregarCarrera(Carrera unaCarrera){
        this.carrerasDeLasQueMeQuieroRecibir.add(unaCarrera);
    }
    public void agregarCarreraTerminada(Carrera unaCarrera){
        this.carrerasDeLasQueMeRecibi.add(unaCarrera);
    }
    public void TenerUnHijo(){
        this.cantidadHijos++;
        System.out.println(this.nombre + "ha tenido un nuevo hijo");
    }
    public void AdoptarUnHijo(){
        this.cantidadHijos++;
        System.out.println(this.nombre + "ha tenido un nuevo hijo");
    }
    public void MejorarMiSueldo(double sueldoQueQuiero){
        this.cantidadHijos++;
        System.out.println("A " + this.nombre + "le han aumentado su sueldo");
        this.sueldo = sueldoQueQuiero;
    }

}
