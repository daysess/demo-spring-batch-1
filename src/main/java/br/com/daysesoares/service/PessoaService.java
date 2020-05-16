package br.com.daysesoares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daysesoares.domain.Pessoa;
import br.com.daysesoares.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa insert(Pessoa obj) {
		obj.setId(null);
		return pessoaRepository.save(obj);
	}
	
	public List<Pessoa> findAll(){
		return pessoaRepository.findAll();
	}
	
}
