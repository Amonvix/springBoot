package med.amon.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.amon.api.endereco.DadosEndereco;

public record DadosAtualizarPaciente(

@NotNull
Long id,
String nome,
String telefone,
DadosEndereco endereco
) {
    
}
