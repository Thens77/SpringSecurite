package controle_final.benhirt_Sebbar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import controle_final.benhirt_Sebbar.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
	
	
	@Query("Select t from Ticket t where t.status=false")
	List<Ticket> getTicketNA();
	
	@Query("Select t from Ticket t where t.client.userName=?1")
	List<Ticket> getTicketByCLient(String username);
	
	@Query("Select t from Ticket t where t.dev.userName=?1")
	List<Ticket> getTicketByDev(String username);
	
	
}
