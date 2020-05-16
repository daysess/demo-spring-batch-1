package br.com.daysesoares.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import br.com.daysesoares.domain.Pessoa;

public class PessoaItemProcessor implements ItemProcessor<Pessoa, Pessoa> {
	
	private static final Logger log = LoggerFactory.getLogger(PessoaItemProcessor.class);
	
	@Override
	public Pessoa process(final Pessoa pessoa) throws Exception{
		final String nome = pessoa.getNome().toUpperCase();
		final String sobrenome = pessoa.getSobrenome().toUpperCase();
		
		final Pessoa transformaDadosPessoa = new Pessoa(pessoa.getId(), nome, sobrenome, pessoa.getTelefone());
		log.info("Dados convertido com sucesso!");
		
		return transformaDadosPessoa;
	}

}
