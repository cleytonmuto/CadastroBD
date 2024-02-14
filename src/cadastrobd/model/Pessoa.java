package cadastrobd.model;

/**
 *
 * @author Cleyton
 */
public class Pessoa {
    
    private Integer id;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;

    public Pessoa() {
        
    }

    public Pessoa(Integer id, String nome, String endereco, String cidade, String estado, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibir() {
        System.out.println("id: ".concat(id.toString()));
        System.out.println("nome: ".concat(nome));
        System.out.println("endereco: ".concat(endereco));
        System.out.println("cidade: ".concat(cidade));
        System.out.println("estado: ".concat(estado));
        System.out.println("telefone: ".concat(telefone));
        System.out.println("email: ".concat(email));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
