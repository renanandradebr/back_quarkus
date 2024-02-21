package org.acme.example.resource;

import org.acme.example.resource.TbUsuario;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class LoginService {

    @Inject
    private EntityManager entityManager;

    @Transactional
    public boolean authenticate(String username, String password) {
        try {
            TypedQuery<TbUsuario> query = entityManager.createQuery("SELECT u FROM TbUsuario u WHERE u.usuario = :username", TbUsuario.class);
            query.setParameter("username", username);
            TbUsuario user = query.getSingleResult();

            // Verifica se o usuário foi encontrado e se a senha está correta
            return user != null && user.getSenha() != null && user.getSenha().equals(password);
        } catch (NoResultException e) {
            // Usuário não encontrado
            return false;
        }
    }
}
