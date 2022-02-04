package pro.gsilva.exemplo1.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import pro.gsilva.exemplo1.model.Pessoa;

@Repository
public class PessoaRepository {
    private final EntityManager entityManager;

    public PessoaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public int create(Pessoa pessoa) {
        this.entityManager.persist(pessoa);
        return pessoa.getId();
    }

    public List<Pessoa> findAll() {
        return entityManager.createQuery("select p from Pessoa p", Pessoa.class)
            .getResultList();
    }

}