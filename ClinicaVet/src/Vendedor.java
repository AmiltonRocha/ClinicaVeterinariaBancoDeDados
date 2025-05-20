public class Vendedor extends Pessoa implements Funcionario {
    private String salario = "3000";
    private String banco;

    public Vendedor(String Nome, String Cpf, String Telefone, String Email, String Endereco, String Bairro, String Cidade, String Estado, String Complemento, String salario, String banco) {
        super(Nome, Cpf, Telefone, Email, Endereco, Bairro, Cidade, Estado, Complemento);
        this.salario = salario;
        this.banco = banco;
    }

    @Override
    public String getSalario() {
        return salario;
    }

    @Override
    public String getBanco() {
        return banco;
    }
}


