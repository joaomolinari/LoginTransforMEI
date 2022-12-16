package net.login.transformei;

import java.util.Collection;

public interface UserDetails {

	Collection<? extends GrantedAuthority> getAuthorities();

	String getPassword();

	String getUsuario();

	boolean isAccountNonExpired();

	boolean isAccountNonLocked();

	boolean isCredentialsNonExpired();

	boolean isEnabled();
	
	

}
