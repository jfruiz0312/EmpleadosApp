package net.itenajero.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	
	@GetMapping("/view/{id}")
	public String  verDetalle(@PathVariable ("id") int idvacante, Model model){
		System.out.println("idVacante" +idvacante);
		model.addAttribute("idVacante", idvacante);
		return "vacantes/detalle";
	}

}
