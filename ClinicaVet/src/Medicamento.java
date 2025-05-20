public abstract class Medicamento {
    private String nomeDoRemedio;
    private String preco;
    private String quantidade;
    private String validade;
    private String MiligramaDoRemedio;

    public Medicamento(String nomeDoRemedio, String preco, String quantidade, String validade, String MiligramaDoRemedio) {
        this.nomeDoRemedio = nomeDoRemedio;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
        this.MiligramaDoRemedio = MiligramaDoRemedio;
    }

    public String getNomeDoRemedio() {
        return nomeDoRemedio;
    }

    public String getPreco() {
        return preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public String getMiligramaDoRemedio() {
        return MiligramaDoRemedio;
    }
}
