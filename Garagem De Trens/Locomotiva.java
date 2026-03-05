import java.util.ArrayList;

public class Locomotiva {
private int idlocomotiva;
private int peso=50;
private int nummaxdevagoes=50;
private int idtrem;


public Locomotiva(int idlocomotiva,int peso,int nummaxdevagoes,int idtrem){
this.idlocomotiva=idlocomotiva;
this.peso=peso;
this.nummaxdevagoes=nummaxdevagoes;
this.idtrem=idtrem;
}


public int getIdlocomotiva() {
    return idlocomotiva;
}


public void setIdlocomotiva(int idlocomotiva) {
    this.idlocomotiva = idlocomotiva;
}


public int getPeso() {
    return peso;
}


public void setPeso(int peso) {
    this.peso = peso;
}


public int getNummaxdevagoes() {
   
    if (nummaxdevagoes < 50) {
        return nummaxdevagoes;
    } else {
        if (nummaxdevagoes > 50) {
            return nummaxdevagoes - (10 * nummaxdevagoes / 100);  
        }
    }
    return nummaxdevagoes;
}


public void setNummaxdevagoes(int nummaxdevagoes) {
    this.nummaxdevagoes = nummaxdevagoes;
}


public int getIdtrem() {
    return idtrem;
}


public void setIdtrem(int idtrem) {
    this.idtrem = idtrem;
}


@Override
public String toString() {
    return "Locomotiva [idlocomotiva=" + idlocomotiva + ", peso=" + peso + ", nummaxdevagoes=" + nummaxdevagoes
            + ", idtrem=" + idtrem + "]";
}

}

