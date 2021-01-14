
public class GesAlunos {
    public static void main(String[] args) {

         Aluno aluno1 = new Aluno("João Manuel",17,"Rua do Java, 56",123456789,"joaomanuel@enta.pt",0.0);
         Aluno aluno2 = new Aluno("Maria José",19,"Rua do PHP, 76",111111111,"mariajose@enta.pt",0.0);
         Aluno aluno3 = new Aluno("Mário Santos",20,"Rua do C++, 87",222222222,"mariosantos@enta.pt",0.0);

         aluno1.setMedia(15.8);
         aluno2.setMedia(18.4);
         aluno3.setMedia(8.5);
         mediaAlunos(aluno1,aluno2,aluno3);
         alunosMenores(aluno1,aluno2,aluno3);
    }

    public static void mediaAlunos(Aluno aluno1, Aluno aluno2, Aluno aluno3){
        double media = (aluno1.getMedia() + aluno2.getMedia() + aluno3.getMedia())/3;
        System.out.println(media);
    }

    public static void alunosMenores(Aluno aluno1, Aluno aluno2, Aluno aluno3){
        if(aluno1.getIdade() <= 18){
            System.out.println(aluno1.getNome());
        }
        if(aluno2.getIdade() <= 18){
            System.out.println(aluno2.getNome());
        }
        if(aluno3.getIdade() <= 18){
            System.out.println(aluno3.getNome());
        }
    }


}