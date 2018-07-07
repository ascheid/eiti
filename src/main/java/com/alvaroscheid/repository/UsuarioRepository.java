package com.alvaroscheid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvaroscheid.eiti.model.Usuario;

/**
 * 
 *
 * @author Alvaro Scheid @ ascheid@gmail.com - 7 de jul de 2018
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
