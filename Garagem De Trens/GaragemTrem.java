import java.util.ArrayList;

public class GaragemTrem {
private static ArrayList<Trem>trem;
private int proxLivre;




public GaragemTrem(ArrayList<Trem> trem, int proxLivre) {
    this.trem = trem;
    this.proxLivre = proxLivre;
}

public void estacionaTrem(Trem t){
    trem.add(t);
    proxLivre++; 
    }

public int getIdTrem(){
    return getIdTrem();
}

public static  void criaTrem(int getIdLocomotiva,int getIdvagao) {
for(Trem t:trem)
System.out.println(getIdLocomotiva+getIdvagao+t.getIdTrem());
}


public static Integer listarTrens() {
    System.out.println("Lista de IDs de todos os trens:");
    boolean tremEncontrado = false;
    for (Trem trem : trem) {
        if (trem.getIdTrem() > 0) {
            System.out.println("ID do Trem: " + trem.getIdTrem());
            tremEncontrado = true;
        }
    }
    if (tremEncontrado) {
        return 1; 
    } else {
        return null; 
    }
}

public Integer DesfazerTrens(int idvagao,int idlocomotiva,int idtrem){
return null;
}
}

