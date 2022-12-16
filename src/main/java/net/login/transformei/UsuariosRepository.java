package net.login.transformei;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	
	@Query("SELECT u FROM Usuarios u WHERE u.email = ?1")
	Usuarios findByEmail(String emailUsuario);

}
