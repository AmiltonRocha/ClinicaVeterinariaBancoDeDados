import java.util.ArrayList;
import java.util.List;

public class Receita {
    private String data;
    private List<Medicamento> medicamentos;

    public Receita(String data) {
        this.data = data;
        this.medicamentos = new ArrayList<>();
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public String getData() {
        return data;
    }
}  
    

