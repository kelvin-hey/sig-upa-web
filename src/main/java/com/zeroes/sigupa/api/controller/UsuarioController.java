package com.zeroes.sigupa.api.controller;

import java.util.List;

import com.zeroes.sigupa.domain.model.Usuario;
import com.zeroes.sigupa.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {   
    
	@Autowired
	private UsuarioService usuarioService;
	
    @GetMapping
    public String usuarios(Model model) {
       
    	List<Usuario> listaUsuarios = usuarioService.listar();
    	
    	model.addAttribute("titulo", "Controle de Usuários");
    	model.addAttribute("usuarios", listaUsuarios);
    	model.addAttribute("totalUsers", String.valueOf(listaUsuarios.size()));       
    	
    	model.addAttribute("usuario", new Usuario());
    	
    	return "usuarios";
    }
    
    @PostMapping
    public String cadastrarUsuario(@ModelAttribute Usuario usuario) {
    	usuarioService.salvar(usuario);
    	return "redirect:/usuarios";
    }
}