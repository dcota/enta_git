public class GesAlunos {
    public static void main(String[] args) {
        // instanciar aluno com construtor vazio
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Martins");
        aluno1.setIdade(16);
        aluno1.setMorada("Rua do Java, 23");
        aluno1.setCC(123456789);
        aluno1.setEmail("jmartins@java.com");
        aluno1.setMediaNotas(16.8f);

        // instanciar aluno com construtor que incializa atributos/campos
        Aluno aluno2 = new Aluno("Maria Matos", 15, "Rua do C++, 54", 987654321, "mariamatos@cpp.com", 18.7f);

        // mostrar um atibuto do objeto aluno1
        String nome = aluno1.getNome();
        int idade = aluno1.getIdade();
        System.out.println("O nome é " + nome + " e a idade é " + idade + " anos.");

        // mostrar um atibuto do objeto aluno2
        nome = aluno2.getNome();
        idade = aluno2.getIdade();
        System.out.println("O nome é " + nome + " e a idade é " + idade + " anos.");

    }
}
