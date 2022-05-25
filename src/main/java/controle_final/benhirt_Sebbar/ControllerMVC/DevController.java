package controle_final.benhirt_Sebbar.ControllerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import antlr.collections.List;
import controle_final.benhirt_Sebbar.service.TicketService;
import controle_final.benhirt_Sebbar.service.UserService;
import controle_final.benhirt_Sebbar.model.Ticket;
import controle_final.benhirt_Sebbar.model.User;

@Controller
@RequestMapping("/dev")
public class DevController {

	
	@Autowired
	TicketService ticketservice ;
	
	@GetMapping("/tickets")
	public ModelAndView listeByDev() {
		ModelAndView m = new ModelAndView("tickets/tickets");
		m.addObject("tickets", ticketservice.listeByDev());
		return m;
	}
	
	@GetMapping("tickets/setEncours/{id}")
	public String setE(@PathVariable Long id) {
		ticketservice.setEncours(id);
		return "redirect:/dev/tickets";
	}
	@GetMapping("tickets/setTermine/{id}")
	public String setT(@PathVariable Long id) {
		ticketservice.setTermine(id);
		return "redirect:/dev/tickets";
	}
}
