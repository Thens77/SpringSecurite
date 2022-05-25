package controle_final.benhirt_Sebbar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import controle_final.benhirt_Sebbar.model.Role;



@Repository
public interface  RoleRepository  extends JpaRepository<Role,Integer>{
	public Role findByNom(String nom);

}

