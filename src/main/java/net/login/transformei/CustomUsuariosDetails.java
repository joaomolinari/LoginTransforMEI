package net.login.transformei;

import java.util.Collection;


public class CustomUsuariosDetails implements UserDetails {
	
private Usuarios usuarios;
	
	public CustomUsuariosDetails(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return usuarios.getPassword();
	}

	@Override
	public String getUsuario() {
		return usuarios.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public String getNomeCompleto() {
		return usuarios.getNome() + " " + usuarios.getSobrenome();
	

}
}
