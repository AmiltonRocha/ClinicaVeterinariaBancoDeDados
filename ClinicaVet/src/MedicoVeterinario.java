public class MedicoVeterinario extends Pessoa implements Funcionario {
    private String Crv;
    private String salario = "5000";
    private String banco;

    public MedicoVeterinario(String Nome, String Cpf, String Telefone, String Email, String Endereco, String Bairro, String Cidade, String Estado, String Complemento, String Crv, String salario, String banco) {
        super(Nome, Cpf, Telefone, Email, Endereco, Bairro, Cidade, Estado, Complemento);
        this.Crv = Crv;
        this.salario = salario;
        this.banco = banco;
    }

    public String getCrv() {
        return Crv;
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
