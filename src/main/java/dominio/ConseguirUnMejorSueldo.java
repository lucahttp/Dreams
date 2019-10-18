package dominio;

public class ConseguirUnMejorSueldo extends Dream{
    ConseguirUnMejorSueldo(Persona personaQueVaAAumentarSuSueldo, double sueldoQueQuiero){
        personaQueVaAAumentarSuSueldo.MejorarMiSueldo(sueldoQueQuiero);
    }
}
