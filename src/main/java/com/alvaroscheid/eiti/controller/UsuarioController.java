package com.alvaroscheid.eiti.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alvaroscheid.eiti.model.Usuario;
import com.alvaroscheid.eiti.service.UsuarioService;

/**
 * 
 *
 * @author Alvaro Scheid | ascheid@gmail.com - 7 de jul de 2018
 */

@Controller
public class UsuarioController {

	@Autowired
	public UsuarioService service;

	@GetMapping("")
	public ModelAndView findAll() {
		ModelAndView mv = new ModelAndView("/usuario");
		mv.addObject("usuarios", service.findAll());
		return mv;
	}

	@GetMapping("add")
	public ModelAndView add(Usuario usuario) {
		ModelAndView mv = new ModelAndView("/usuarioAdd");
		mv.addObject("usuario", usuario);
		return mv;
	}

	@GetMapping("edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return add(service.findOne(id));
	}

	@GetMapping("delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		service.delete(id);
		return findAll();
	}

	@PostMapping("save")
	public ModelAndView save(@Valid Usuario usuario, BindingResult result) {
		if (result.hasErrors()) {
			return add(usuario);
		}
		service.save(usuario);
		return findAll();
	}
}
