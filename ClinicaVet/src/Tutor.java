import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {
    private List<Pet> pets;

    public Tutor(String Nome, String Cpf, String Telefone, String Email, String Senha, String Endereco, String Cidade, String Estado, String Complemento) {
        super(Nome, Cpf, Telefone, Email, Senha, Endereco, Cidade, Estado, Complemento);
        this.pets = new ArrayList<>();
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public void removerPet(Pet pet) {
        pets.remove(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }
}
