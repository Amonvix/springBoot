package med.amon.api.medico;

import med.amon.api.endereco.DadosEndereco;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidades especialidade,
        DadosEndereco endereco) {

}
