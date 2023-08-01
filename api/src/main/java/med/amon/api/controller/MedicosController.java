package med.amon.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.amon.api.medico.DadosAtualizacaoMedicos;
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
	public Page<DadosListagemMedico> listar(Pageable paginacao) {		
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);		
	}



	@PutMapping
	@Transactional
	public void atualizar (@RequestBody @Valid DadosAtualizacaoMedicos dados){
		var medico = repository.getReferenceById(dados.id());
		medico.atualizarinformacoes(dados);
	}




	@DeleteMapping("/{id}")
	@Transactional
	public void excluir (@PathVariable Long id){
		var medico = repository.getReferenceById(id);
		medico.excluir();		

	}

}
