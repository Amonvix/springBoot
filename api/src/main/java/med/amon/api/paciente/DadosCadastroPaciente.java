package med.amon.api.paciente;

import med.amon.api.endereco.DadosEndereco;
import med.amon.api.medico.Especialidades;

public record DadosCadastroPaciente(String nome, String email, String cpf, Especialidades especialidade,
        DadosEndereco endereco)  {
    
}
