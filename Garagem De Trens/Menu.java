import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
     
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<GaragemLocomotiva>garagemlocomotiva= new ArrayList<>();
       ArrayList<GaragemVagoes>garagemvagoes = new ArrayList<>();
       ArrayList<Trem>trem= new ArrayList<>();
       ArrayList<Locomotiva>locomotivas= new ArrayList<>();
       ArrayList<Vagoes> vagoes= new ArrayList<>();
       int proxLivre;
       int opcao;
       int idvagao;
       int idlocomotiva;

       
       Trem t= new Trem(1,1,garagemlocomotiva,garagemvagoes);

       System.out.println("ID do Trem criado: " + t.getIdTrem());
       
       GaragemTrem garagemtrem = new GaragemTrem(trem, 1); 
       GaragemVagoes garagemvagao = new GaragemVagoes(vagoes, 1);
       GaragemLocomotiva gl=new GaragemLocomotiva(locomotivas, 1);


      do {
           System.out.println("Escolha uma opção:");
           System.out.println("Opção 1: Criar um trem");
           System.out.println("Opção 2: Editar um trem");
           System.out.println("Opção 3: Listar lsitas de trens");
           System.out.println("Opção 4: Desfazer um trem");
           System.out.println("Opção 5:Encerrar o programa");
           opcao = sc.nextInt();
           switch (opcao) {
                 case 1:
                 System.out.println("Você escolheu a opção 1");
                
                System.out.println("Digite o id para criação da locomotiva:");
                idlocomotiva= sc.nextInt();
                idvagao=0;
                if(idlocomotiva>1){
                idvagao=(idvagao+1);  
                garagemtrem.criaTrem(idlocomotiva,idvagao);
                System.out.println("O ID do trem criado foi: " +garagemtrem.getIdTrem());
               
                System.out.println("O ID da primeira locomotiva criado foi: " +gl.getIdlocomotiva());       
               }
              break;           
                case 2:
                int opcao1;
                System.out.println("Você escolheu a opção 2");
                System.out.println("O que você deseja:");
                System.out.println("Opção 1-Inserir uma locomotiva:");
                System.out.println("Opção 2-Inserir um vagão:");
                System.out.println("Opção 3-Remover último elemento do trem:");
                System.out.println("Opção 4-Listar locomotivas livres:");
                System.out.println("Opção 5-Listar vagõess livres:");
                System.out.println("Opção 6-Encerrar edição de trem:");
                opcao1 = sc.nextInt();
                switch (opcao1) {
                
                case 1:
                System.out.println("Locomotiva inserida com sucesso");
                gl.estacionaLocomotiva(null);
                break;
                case 2:
                System.out.println("Vagão inserido com sucesso");
                garagemvagao.estacionaVagoes(null);
                break;
                case 3:
                System.out.println("Último elemento do trem removido com sucesso");
                garagemvagao.RetiraVagoes(1);
                break;
                case 4:
                System.out.println("Listas delocomotivas livres:");
                gl.listarLocomotivasLivres();
                break;
                case 5:
                System.out.println("Listas de vagões livres:");
                garagemvagao.listarVagoesLivres();
                break;
                }
                case 3:
                System.out.println("Você escolheu a opção 3");
                System.out.println("A lista de trens criados: "+garagemtrem.listarTrens()); 
                break;
                case 4:
                System.out.println("Você escolheu a opção 4");
                int idtrem;
                System.out.println("Digite o id do trem que deseja desfazer:");
                idtrem= sc.nextInt();
                idvagao=idtrem;
                idlocomotiva=idtrem;
                garagemtrem.DesfazerTrens(idvagao, idlocomotiva, idtrem);
                break;
                case 5:
                System.out.println("Você escolheu a opção 5");    
                System.out.println("Encerrando o programa.........");  
                break;  
   } 
}while(opcao!=5);

}
}


