import br.com.queijo.challenge1.encapsulamento.*;

public class Main {
    public static void main(String[] args) {
        IdadePessoa novaPessoa1 = new IdadePessoa();
        novaPessoa1.setIdade(17);
        novaPessoa1.setNome("Roger");
        System.out.println("Olá " + novaPessoa1.getNome() + " você tem " + novaPessoa1.getIdade() + " anos, você é " + novaPessoa1.verificarIdade());

        IdadePessoa novaPessoa2 = new IdadePessoa();
        novaPessoa2.setIdade(20);
        novaPessoa2.setNome("nana");
        System.out.println("Olá " + novaPessoa2.getNome() + " você tem " + novaPessoa2.getIdade() + " anos, você é " + novaPessoa2.verificarIdade());


        ContaBancaria clienteBanco1 = new ContaBancaria();
        clienteBanco1.titular = " Verinilson";
        clienteBanco1.setNumeroConta(11223);
        clienteBanco1.setSaldo(100.00);
        System.out.println("Olá " + clienteBanco1.getNumeroConta() + clienteBanco1.titular + "! Seu saldo atual é de: " + clienteBanco1.getSaldo());

        Livro novoLivro1 = new Livro();
        novoLivro1.setAutor("Machado de Assis");
        novoLivro1.setTitulo("A viuvinha");
        System.out.println(novoLivro1.exibirDetalhes());

        Aluno novoAluno1 = new Aluno();
        novoAluno1.setNome("Damiao");
        novoAluno1.setNota(5);
        novoAluno1.setNota2(5);
        System.out.println(novoAluno1.getNota() + novoAluno1.getNota2() + " " + novoAluno1.calcularMedia());

        Produto produto = new Produto("Samsung S24", 4300.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}