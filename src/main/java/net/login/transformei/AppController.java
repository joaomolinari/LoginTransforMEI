package net.login.transformei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
	
	@Autowired
	private UsuariosRepository repo;
	
	@GetMapping
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String ShowSignUpForm(Model model) {
		model.addAttribute("usuarios", new Usuarios());
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(Usuarios usuarios) {
		repo.save(usuarios);
		
		return"Registrado_com_sucesso";
	}

}
