
    import java.util.ArrayList;

    public class biblioteca {

        private ArrayList<livro> livros;
        private ArrayList<usuario> usuarios;

        // Construtor
        public biblioteca() {
            this.livros = new ArrayList<>();
            this.usuarios = new ArrayList<>();
        }

        // Métodos de Livro
        public void adicionarLivro(livro livro) {
            livros.add(livro);
            System.out.println("Livro \"" + livro.getNome() + "\" adicionado à biblioteca.");
        }

        public void listarLivros() {
            if (livros.isEmpty()) {
                System.out.println("Nenhum livro cadastrado.");
                return;
            }

            for (livro livro : livros) {
                livro.mostrarInfo();
            }

        }

        public livro buscarLivro(String nome) {
            for (livro livro : livros) {
                if (livro.getNome().equalsIgnoreCase(nome)) {
                    return livro;
                }
            }
            System.out.println("Livro \"" + nome + "\" não encontrado.");
            return null;
        }

        // Métodos de Usuário
        public void adicionarUsuario(usuario usuario) {
            usuarios.add(usuario);
            System.out.println("Usuário \"" + usuario.getNome() + "\" cadastrado.");
        }

        public void listarUsuarios() {
            if (usuarios.isEmpty()) {
                System.out.println("Nenhum usuário cadastrado.");
                return;
            }

            for (usuario usuario : usuarios) {
                usuario.mostrarNome();
            }
        }
    }

