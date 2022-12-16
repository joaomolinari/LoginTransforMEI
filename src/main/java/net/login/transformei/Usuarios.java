package net.login.transformei;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="usuarios")

public class Usuarios {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Column(nullable = false, unique = true, length = 45)
	private String emailUsuario;
	
	@Column(nullable = false, length = 64)
	private String passwordUsuario;
	
	@Column(nullable = false, length = 20)
	private String nomeUsuario;
	
	@Column(nullable = false, length = 20)
	private String sobrenomeUsuario;
	
	
	public Long getId() {
		return idUsuario;
	}
	public void setId(Long id) {
		this.idUsuario = id;
	}
	public String getEmail() {
		return emailUsuario;
	}
	public void setEmail(String email) {
		this.emailUsuario = email;
	}
	public String getNome() {
		return nomeUsuario;
	}
	public void setNome(String nome) {
		this.nomeUsuario = nome;
	}
	public String getSobrenome() {
		return sobrenomeUsuario;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenomeUsuario = sobrenome;
	}
	public String getPassword() {
		return passwordUsuario;
	}
	public void setPassword(String password) {
		this.passwordUsuario = password;
	}
	
}
