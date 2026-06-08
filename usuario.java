public class usuario {


        private String nome;
        private String cpf;

        // Construtor
        public usuario(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        // Gets e Sets
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        // Método
        public void mostrarNome() {
            System.out.println("Usuário: " + nome + " | CPF: " + cpf);
        }
    }


