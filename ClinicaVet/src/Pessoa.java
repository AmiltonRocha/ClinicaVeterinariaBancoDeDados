public abstract class Pessoa {
    private String Nome;
    private String Cpf;
    private String Telefone; 
    private String Email;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Complemento;

    public Pessoa(String Nome, String Cpf, String Telefone, String Email, String Endereco, String Bairro, String Cidade, String Estado, String Complemento) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Endereco = Endereco;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Complemento = Complemento;
    }

    // Getters
    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getComplemento() {
        return Complemento;
    }

    // Setters
    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
}

