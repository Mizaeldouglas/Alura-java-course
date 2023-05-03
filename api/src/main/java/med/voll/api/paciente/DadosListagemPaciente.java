package med.voll.api.paciente;

public record DadosListagemPaciente(
        Long id,
        String nome,
        String email,
        String cpf
) {
    public  DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}

//    public DadosListagemMedico(Medico medico) {
//        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
//    }