package com.alvaroscheid.eiti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvaroscheid.eiti.model.Usuario;
import com.alvaroscheid.eiti.repository.UsuarioRepository;

/**
 * 
 *
 * @author Alvaro Scheid | ascheid@gmail.com - 7 de jul de 2018
 */

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario findOne(Long id) {
		return repository.findOne(id);
	}

	public Usuario save(Usuario usuario) {
		return repository.saveAndFlush(usuario);
	}

	public void delete(Long id) {
		repository.delete(id);
	}

	public List<Usuario> searchByName(String string) {
		List<Usuario> usuarios = new ArrayList<>();
		repository.findAll().forEach(usuario -> {
			if (usuario.getName().contains(string))
				usuarios.add(usuario);
		});
		return usuarios;
	}

	public List<Usuario> searchByUsername(String string) {
		List<Usuario> usuarios = new ArrayList<>();
		repository.findAll().forEach(usuario -> {
			if (usuario.getUsername().contains(string))
				usuarios.add(usuario);
		});
		return usuarios;
	}

	public List<Usuario> searchByEmail(String string) {
		List<Usuario> usuarios = new ArrayList<>();
		repository.findAll().forEach(usuario -> {
			if (usuario.getEmail().contains(string))
				usuarios.add(usuario);
		});
		return usuarios;
	}
}
