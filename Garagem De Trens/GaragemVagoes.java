import java.util.ArrayList;

public class GaragemVagoes {
private ArrayList<Vagoes>vagoes;
private int proxLivre;
private ArrayList<GaragemTrem>garagemtrem;
private ArrayList<GaragemLocomotiva>garagemlocomotiva;

public GaragemVagoes(ArrayList<Vagoes> vagoes, int proxLivre) {
    this.vagoes = vagoes;
    this.proxLivre = proxLivre;
}


public void estacionaVagoes(Vagoes v){
for(GaragemLocomotiva gl:garagemlocomotiva){
if(gl.estacionaLocomotiva(null)){
    System.out.println("O Vagão não pode ser inserido,pois não há uma locomotiva");
    }else{
vagoes.add(v);
proxLivre++; 
}
}
}

public void setProxLivre(int proxLivre) {
    this.proxLivre = proxLivre;
}


public Vagoes setIdVagoes(int id){
for(Vagoes v:vagoes){
if(v.getIdvagao()==id){
return v; 
}    
}    
return (null);
}

public ArrayList<Vagoes>gettoVagoes(){
return vagoes;    
}

public Vagoes getIdvagao(){
    for(Vagoes v:vagoes){
     v.getIdvagao();   
        }
    return null;
    
}


public Vagoes RetiraVagoes(int id){
for(int i=0;i<vagoes.size();i++){
if(vagoes.get(i).getIdvagao()==id){;
return vagoes.remove(i);
}    
}

return null;
}


public void listarVagoesLivres() {
    System.out.println("Vagões não utilizados na composição de nenhum trem:");
    for (Vagoes vagoes : vagoes) {
        
        if (!foiUtilizado(vagoes)) {
            System.out.println(vagoes.toString());
        }
    }
}


private boolean foiUtilizado(Vagoes vagoes) {
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
    return "GaragemVagoes [vagoes=" + vagoes + ", proxLivre=" + proxLivre + "]";
}


}




