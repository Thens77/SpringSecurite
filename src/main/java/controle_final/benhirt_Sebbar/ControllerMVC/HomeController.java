package controle_final.benhirt_Sebbar.ControllerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import controle_final.benhirt_Sebbar.model.Ticket;
import controle_final.benhirt_Sebbar.model.User;
import controle_final.benhirt_Sebbar.service.UserService;



@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	
	
	@GetMapping("login")
	public String login() {
		return "connexion";
	}
	
	
	@GetMapping("inscription")
	public String insc(Model m) {
		m.addAttribute("user",new User());
		return "inscription";
	}
	
	@PostMapping("inscription")
	public String insc(@ModelAttribute User user,BindingResult result) {
		if (result.hasErrors())
			return "inscription";
		userService.save(user);
		return "redirect:login";
	}
	
}
