package pro.gsilva.exemplo1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
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
    public int create(Pessoa pessoa) {
        return this.repository.create(pessoa);
    }

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    @Transactional
    public void update(Integer id, Pessoa pessoa) {
        Pessoa byId = repository.findById(id);
        byId.setNome(pessoa.getNome());
        repository.update(byId);

    }

    @Transactional
    public void deleteById(Integer id) {
        this.repository.delete(id);
    }
}
