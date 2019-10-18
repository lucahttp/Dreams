package dominio;

public abstract class Dream {
    //private int fuerza;
    protected int ira;
    //private int fuerza;
    protected int cantidadVecesEnojado;
    protected int multiplicadorRandom;


    Dream(){
        this.ira = 1;
        this.multiplicadorRandom = 1;
        this.cantidadVecesEnojado = 0;
    }

    public void CEnoja(){
        this.cantidadVecesEnojado++;
        this.ira *=2;
    }

    public int cuantaFuerzaTiene(){
        return 0;
    }
}
