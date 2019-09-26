package pe.com.pathOrder.demoxd.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import pe.com.pathOrder.demoxd.model.OrdenDespacho;
import pe.com.pathOrder.demoxd.service.OrdenDespachoService;

@Controller
@RequestMapping("/OrdenDespacho")
@SessionAttributes("OrdenDespacho")
public class OrdenDespachoController {
	@Autowired
	private OrdenDespachoService ordenDespachoService;
	
	@GetMapping("inicio")
	public String inicio(Model model) {
		return "OrdenDespacho/inicio";
	}
	@GetMapping("Listado")
	public String listar(Model model) {
		try {
			List<OrdenDespacho> orden = ordenDespachoService.findAll();
			model.addAttribute("OrdenDespachos",orden);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "OrdenDespacho/Listado";
	}
	@GetMapping("Informacion")
	public String Información(Model model) {
		try {
			List<OrdenDespacho> orden = ordenDespachoService.findAll();
			model.addAttribute("OrdenDespachos",orden);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "OrdenDespacho/informacion";
	}
	@GetMapping("Fundadores")
	public String Fundadores(Model model) {
		return "OrdenDespacho/Fundadores";
	}
	@GetMapping("edit/{id}")
	public String edicion( @PathVariable("id") Integer id, Model model  ) {
		try {
			Optional<OrdenDespacho> orden = ordenDespachoService.findById(id);
			// Se verifica que el Optional contiene el objeto
			if( orden.isPresent() ) {
				model.addAttribute("carrera", orden.get());
			} else {
				model.addAttribute("error", "No existe el Id");
				return "redirect:/carrera/listado";
			}
			
		} catch (Exception e) {
			model.addAttribute("error", "Error 500");
			return "redirect:/OrdenDespacho/listado";
		}		
		return "OrdenDespacho/editar";	// Archivo html
	}
	@PostMapping("grabar")
	public String grabar(@ModelAttribute("OrdenDespacho") OrdenDespacho ordenDespacho, Model model, 
			SessionStatus status) {
		try {
			ordenDespachoService.save(ordenDespacho);
			status.setComplete();
		} catch (Exception e) {
			model.addAttribute("error", "No se guardo la carrera");
		}		
		
		return "redirect:/OrdenDespacho/listado";
	}
	@GetMapping("nuevo")
	public String nuevo(Model model) {
		OrdenDespacho orden = new OrdenDespacho();
		model.addAttribute("carrera", orden);
		return "/OrdenDespacho/nuevo";
	}
	@GetMapping("delete/{id}")
	public String remover( @PathVariable("id") Integer id, Model model  ) {
		try {
			Optional<OrdenDespacho> orden = ordenDespachoService.findById(id);
			// Se verifica que el Optional contiene el objeto
			if( orden.isPresent() ) {
				ordenDespachoService.deleteById(id);
			} else {
				model.addAttribute("error", "No existe el Id");				
			}
			
		} catch (Exception e) {
			model.addAttribute("error", "Error 500");
		}		
		return "redirect:/OrdenDespacho/listado";
	}
	
	
}
