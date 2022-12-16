package net.login.transformei;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UsuariosRepositoryTests {
	
	@Autowired
	private UsuariosRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUsuarios() {
		Usuarios usuarios = new Usuarios ();
		usuarios.setEmail("jvmolinari@gmail.com");
		usuarios.setPassword("jv@2022");
		usuarios.setNome("JV");
		usuarios.setSobrenome("Molinari");
		
		Usuarios savedUsuarios = repo.save(usuarios);
		
		Usuarios existUsuarios = entityManager.find(Usuarios.class, savedUsuarios.getId());
		
		assertThat(existUsuarios.getEmail()).isEqualTo(usuarios.getEmail());
	}
	
	@Test
	public void testFindByEmail() {
		String email = "nam@codejava.net";
		Usuarios usuarios = repo.findByEmail(email);
		
		assertThat(usuarios.getEmail()).isEqualTo(email);
	}

}
