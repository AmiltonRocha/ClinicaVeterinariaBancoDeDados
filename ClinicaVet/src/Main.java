public class Main {
    public static void main(String[] args) {
        // Criando um médico veterinário
        MedicoVeterinario medico = new MedicoVeterinario(
            "Dr. Silva", "123.456.789-00", "11999999999", "dr.silva@email.com",
            "Rua A", "Centro", "São Paulo", "SP", "Sala 1",
            "CRV12345", "300", "Banco do Brasil"
        );

        // Criando um tutor
        Tutor tutor = new Tutor(
            "Amilton", "987.654.321-00", "11988888888", "joao@email.com",
            "Rua B", "Jardim", "São Paulo", "SP", "Apto 101"
        );

        // Criando um pet
        Pet pet = new Pet("Pingu", "Cachorro", "Cavalier", 3, 25.5f);
        tutor.adicionarPet(pet);

        // Criando uma receita
        Receita receita = new Receita("2024-03-20");
        MedricamentoReceita medicamento = new MedricamentoReceita("Antipulgas", "50.00", "1", "2025-12-31", "100mg");
        receita.adicionarMedicamento(medicamento);

        // Criando uma consulta
        Consulta consulta = new Consulta(
            150.0f, "2024-03-20", "14:30",
            medico, pet, tutor, receita
        );

        // Testando os getters
        System.out.println("=== Dados da Consulta ===");
        System.out.println("Valor: R$ " + consulta.getValor());
        System.out.println("Data: " + consulta.getDataConsulta());
        System.out.println("Hora: " + consulta.getHoraConsulta());
        System.out.println("\n=== Dados do Médico ===");
        System.out.println("Nome: " + consulta.getMedico().getNome());
        System.out.println("CRV: " + consulta.getMedico().getCrv());
        System.out.println("\n=== Dados do Pet ===");
        System.out.println("Nome: " + consulta.getPet().getNome());
        System.out.println("Espécie: " + consulta.getPet().getEspecie());
        System.out.println("Raça: " + consulta.getPet().getRaca());
        System.out.println("\n=== Dados do Tutor ===");
        System.out.println("Nome: " + consulta.getTutor().getNome());
        System.out.println("CPF: " + consulta.getTutor().getCpf());
        System.out.println("\n=== Dados da Receita ===");
        System.out.println("Data: " + consulta.getReceita().getData());
        System.out.println("Medicamentos:");
        for (Medicamento med : consulta.getReceita().getMedicamentos()) {
            System.out.println("- " + med.getNomeDoRemedio() + " (" + med.getQuantidade() + " unidade)");
        }

        /* Testando Vendedor
        Vendedor vendedor = new Vendedor(
            "João", "987.654.321-00", "11988888888", "joao@email.com",
            "Rua B", "Jardins", "São Paulo", "SP", "Apto 2",
            "3000", "Itaú"
        );

        System.out.println("=== Testando Vendedor ===");
        System.out.println("Dados Pessoais:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("CPF: " + vendedor.getCpf());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Email: " + vendedor.getEmail());
        System.out.println("\nEndereço:");
        System.out.println("Rua: " + vendedor.getEndereco());
        System.out.println("Bairro: " + vendedor.getBairro());
        System.out.println("Cidade: " + vendedor.getCidade());
        System.out.println("Estado: " + vendedor.getEstado());
        System.out.println("Complemento: " + vendedor.getComplemento());
        System.out.println("\nDados Profissionais:");
        System.out.println("Salário: R$ " + vendedor.getSalario());
        System.out.println("Banco: " + vendedor.getBanco());
        System.out.println();

        // Testando Tutor
        Tutor tutor = new Tutor(
            "Maria", "111.222.333-44", "11977777777", "maria@email.com",
            "Rua C", "Vila Nova", "São Paulo", "SP", "Apto 3"
        );

        // Adicionando pets ao tutor
        Pet pet1 = new Pet("Rex", "Cachorro", "Labrador", 3, 25.5);
        Pet pet2 = new Pet("Mimi", "Gato", "Siamês", 2, 4.5);

        tutor.adicionarPet(pet1);
        tutor.adicionarPet(pet2);

        System.out.println("=== Testando Tutor ===");
        System.out.println("Dados Pessoais:");
        System.out.println("Nome: " + tutor.getNome());
        System.out.println("CPF: " + tutor.getCpf());
        System.out.println("Telefone: " + tutor.getTelefone());
        System.out.println("Email: " + tutor.getEmail());
        System.out.println("\nEndereço:");
        System.out.println("Rua: " + tutor.getEndereco());
        System.out.println("Bairro: " + tutor.getBairro());
        System.out.println("Cidade: " + tutor.getCidade());
        System.out.println("Estado: " + tutor.getEstado());
        System.out.println("Complemento: " + tutor.getComplemento());
        System.out.println("\nPets do tutor:");
        for (Pet pet : tutor.getPets()) {
            System.out.println("\nPet: " + pet.getNome());
            System.out.println("Espécie: " + pet.getEspecie());
            System.out.println("Raça: " + pet.getRaca());
            System.out.println("Idade: " + pet.getIdade() + " anos");
            System.out.println("Peso: " + pet.getPeso() + " kg");
        }
         */
    }
} 