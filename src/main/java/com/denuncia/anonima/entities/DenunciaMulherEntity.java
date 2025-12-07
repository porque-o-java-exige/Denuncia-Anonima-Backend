package com.denuncia.anonima.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "denuncia_mulher")
public class DenunciaMulherEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "denuncia_mulher")
	private String denuncia;
	@Column(name="ip_usuario")
	private String ipUsuario;

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
	}
	
	public String getIpUsuario() {
		return ipUsuario;
	}
	
	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}

	public DenunciaMulherEntity(String denuncia, String ipUsuario) {
		this.denuncia = denuncia;
		this.ipUsuario = ipUsuario;
	}

	public DenunciaMulherEntity() {

	}

}
