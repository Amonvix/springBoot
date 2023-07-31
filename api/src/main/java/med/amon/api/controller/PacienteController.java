package med.amon.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.amon.api.medico.DadosListagemMedico;
import med.amon.api.paciente.DadosCadastroPaciente;
import med.amon.api.paciente.DadosListagemPaciente;
import med.amon.api.paciente.Paciente;
import med.amon.api.paciente.PacienteRepository;

@RestController
@RequestMapping("paciente")
public class PacienteController {

	@Autowired
	private PacienteRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
		repository.save(new Paciente(dados));
    }

	@GetMapping
	public Page<DadosListagemPaciente> listar(Pageable paginacao) {
		return repository.findAll(paginacao).map( DadosListagemPaciente::new);
}
}