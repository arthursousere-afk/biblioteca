import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);
    static biblioteca biblioteca = new biblioteca();

    public static void main(String[] args) {
        int opcao;

        do {

            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Usuario");
            System.out.println("3 - Listar Livros");
            System.out.println("4 - Listar Usuarios");
            System.out.println("5 - Emprestar Livro");
            System.out.println("6 - Devolver Livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1: cadastrarLivro(); break;
                case 2: cadastrarUsuario(); break;
                case 3: biblioteca.listarLivros(); break;
                case 4: biblioteca.listarUsuarios(); break;
                case 5: emprestarLivro(); break;
                case 6: devolverLivro(); break;
                case 0: System.out.println("Encerrando sistema..."); break;
                default: System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    static void cadastrarLivro() {
        System.out.print("Nome do livro: ");
        String nome = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        biblioteca.adicionarLivro(new livro(nome, autor));
    }

    static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        biblioteca.adicionarUsuario(new usuario(nome, cpf));
    }

    static void emprestarLivro() {
        System.out.print("Nome do livro para emprestar: ");
        String nome = scanner.nextLine();
        livro livro = biblioteca.buscarLivro(nome);
        if (livro != null) {
            livro.emprestarLivro();
        }
    }

    static void devolverLivro() {
        System.out.print("Nome do livro para devolver: ");
        String nome = scanner.nextLine();
        livro livro = biblioteca.buscarLivro(nome);
        if (livro != null) {
            livro.devolverLivro();
        }
    }
}
