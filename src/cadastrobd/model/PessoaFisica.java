package cadastrobd.model;

/**
 *
 * @author Cleyton
 */
public class PessoaFisica extends Pessoa {
    
    private String cpf;

    public PessoaFisica() {
        
    }

    public PessoaFisica(Integer id, String nome, String endereco, String cidade,
        String estado, String telefone, String email, String cpf) {
        super(id, nome, endereco, cidade, estado, telefone, email);
        this.cpf = cpf;
    }
    
    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CPF: ".concat(cpf));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
