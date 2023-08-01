package med.amon.api.medico;

import jakarta.validation.constraints.NotNull;
import med.amon.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
    
    @NotNull
    Long id, 
    String nome,
    String telefone, 
    DadosEndereco endereco) {

    

}
