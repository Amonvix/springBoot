package med.amon.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.amon.api.endereco.Endereco;
import med.amon.api.medico.DadosCadastroMedicos;
import med.amon.api.medico.Medico;
import med.amon.api.medico.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicosController {
	@Autowired
	private MedicoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody DadosCadastroMedicos dados) {
		repository.save(new Medico(dados));
	}

}