package cadastrobd.model;

/**
 *
 * @author Cleyton
 */
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica() {
        
    }

    public PessoaJuridica(Integer id, String nome, String endereco, String cidade,
        String estado, String telefone, String email, String cnpj) {
        super(id, nome, endereco, cidade, estado, telefone, email);
        this.cnpj = cnpj;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("CNPJ: ".concat(cnpj));
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
