package pro.gsilva.exemplo1.repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import pro.gsilva.exemplo1.model.Pessoa;

@Repository
public class PessoaRepository {
    private final EntityManager entityManager;

    public PessoaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(Pessoa pessoa) {
        this.entityManager.persist(pessoa);
    }

}