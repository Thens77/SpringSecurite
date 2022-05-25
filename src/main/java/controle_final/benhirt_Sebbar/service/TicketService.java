package controle_final.benhirt_Sebbar.service;

import java.util.List;

import controle_final.benhirt_Sebbar.model.Ticket;

public interface TicketService {
	List<Ticket> liste();
	
	

	void supprimer(Long id);

	void ajouter(Ticket user);

	void modifier(Ticket user);
	
	void setEncours(Long id);
	
	void setTermine(Long id);

	Ticket getTicket(Long id);

	List<Ticket> listeByClient();
	
	List<Ticket> listeByDev();
	
	List<Ticket> getTicketNA();
	
}
