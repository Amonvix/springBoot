package med.amon.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.amon.api.medico.DadosCadastroMedicos;
import med.amon.api.medico.DadosListagemMedico;
import med.amon.api.medico.Medico;
import med.amon.api.medico.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicosController {
	@Autowired
	private MedicoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroMedicos dados) {
		repository.save(new Medico(dados));
	}

	@GetMapping
	public List<DadosListagemMedico> listar(){
		return repository.findAll().stream().map(DadosListagemMedico::new).toList();
		
	}

}
