package com.alvaroscheid.eiti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
}
