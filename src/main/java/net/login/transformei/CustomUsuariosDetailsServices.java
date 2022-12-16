package net.login.transformei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUsuariosDetailsServices implements UserDetailsService {

	@Autowired
	private UsuariosRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String emailUsuario) throws UsernameNotFoundException {
    Usuarios usuarios = repo.findByEmail(emailUsuario);
		if (usuarios == null) {
			throw new UsernameNotFoundException("User not found");
		
     return (UserDetails) new CustomUsuariosDetails (usuarios)
	}

}
}
