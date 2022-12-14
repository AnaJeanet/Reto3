package com.reto.reto3.repository;

import com.reto.reto3.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
    Usuario findByNombre(String nombre);
}
