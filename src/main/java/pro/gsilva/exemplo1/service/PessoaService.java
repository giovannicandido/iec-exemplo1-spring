package pro.gsilva.exemplo1.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import pro.gsilva.exemplo1.model.Pessoa;
import pro.gsilva.exemplo1.repository.PessoaRepository;

@Service
public class PessoaService {
    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void create(Pessoa pessoa) {
        this.repository.create(pessoa);
    }
}
