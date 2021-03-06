package com.cesario.estagio.ufersa.tocomfomeapi.domain.repository;

import com.cesario.estagio.ufersa.tocomfomeapi.domain.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
