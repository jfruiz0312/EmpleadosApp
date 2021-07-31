package net.itenajero.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("categorias") //@RequestMapping  a nivel de clase
public class CategoriasController {

	//@GetMapping("/index") -- Método corto
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String mostraIndex(Model model) {
		return"categorias/listaCategorias";
	}
	@GetMapping("/crear")
	@RequestMapping(value = "/crear", method = RequestMethod.GET)
	public String crear(Model model) {
		return "categorias/formCategoria";
		
	}
	//@GetMapping("/save")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String guardar(Model model) {
		return "categorias/listaCategorias";
	}
}
