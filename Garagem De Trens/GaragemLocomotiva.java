import java.util.ArrayList;

public class GaragemLocomotiva {
private ArrayList<Locomotiva>locomotivas;
private int proxLivre;
private ArrayList<GaragemTrem>garagemtrem;


public GaragemLocomotiva(ArrayList<Locomotiva> locomotivas, int proxLivre) {
    this.locomotivas = locomotivas;
    this.proxLivre = proxLivre;
}



public boolean estacionaLocomotiva(Locomotiva l){
locomotivas.add(l);
proxLivre++; 
return true;
}




public void setProxLivre(int proxLivre) {
    this.proxLivre = proxLivre;
}


public Locomotiva setIdLocomotiva(int id){
for(Locomotiva l:locomotivas){
if(l.getIdlocomotiva()==id){
return l;   
}    
}    
return (null);
}

public ArrayList<Locomotiva>gettoLocomotiva(){
return locomotivas;    
}

public Locomotiva getIdlocomotiva(){
    for(Locomotiva l:locomotivas){
     l.getIdlocomotiva();
        }
    return null;
    
}

public Locomotiva RetiraLocomotiva(int id){
for(int i=0;i<locomotivas.size();i++){
if(locomotivas.get(i).getIdlocomotiva()==id){;
return locomotivas.remove(i);
}    
}

return null;
}


public void listarLocomotivasLivres() {
    System.out.println("Locomotivas não utilizados na composição de nenhum trem:");
    for (Locomotiva locomotivas: locomotivas) {
        if (!foiUtilizado(locomotivas)) {
            System.out.println(locomotivas.toString());
        }
    }
}

private boolean foiUtilizado(Locomotiva locomotivas) {
    for (GaragemTrem gt : garagemtrem) {
        gt.listarTrens();

        if (gt.listarTrens()==gt.getIdTrem()) {
            return true; 
        }
    }
    return false; 
}

@Override
public String toString() {
    return "GaragemLocomotiva [locomotivas=" + locomotivas + ", proxLivre=" + proxLivre + "]";
}

}



