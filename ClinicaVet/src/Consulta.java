public class Consulta {
    private Float Valor;
    private String DataConsulta;
    private String HoraConsulta;
    private MedicoVeterinario medico;
    private Pet pet;
    private Tutor tutor;
    private Receita receita;

    public Consulta(Float valor, String dataConsulta, String horaConsulta, 
                   MedicoVeterinario medico, Pet pet, Tutor tutor, Receita receita) {
        this.Valor = valor;
        this.DataConsulta = dataConsulta;
        this.HoraConsulta = horaConsulta;
        this.medico = medico;
        this.pet = pet;
        this.tutor = tutor;
        this.receita = receita;
    }

    // Getters
    public Float getValor() {
        return Valor;
    }

    public String getDataConsulta() {
        return DataConsulta;
    }

    public String getHoraConsulta() {
        return HoraConsulta;
    }

    public MedicoVeterinario getMedico() {
        return medico;
    }

    public Pet getPet() {
        return pet;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public Receita getReceita() {
        return receita;
    }

    // Setters
    public void setValor(Float valor) {
        this.Valor = valor;
    }

    public void setDataConsulta(String dataConsulta) {
        this.DataConsulta = dataConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.HoraConsulta = horaConsulta;
    }

    public void setMedico(MedicoVeterinario medico) {
        this.medico = medico;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
}
