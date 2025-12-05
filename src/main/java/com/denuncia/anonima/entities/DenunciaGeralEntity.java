package com.denuncia.anonima.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "denuncia_geral")
public class DenunciaGeralEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "denuncia_geral")
	private String denunciaGeral;
	@Column(name = "ip_usuario")
	private String ipUsuario;

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenunciaGeral() {
		return denunciaGeral;
	}

	public void setDenunciaGeral(String denunciaGeral) {
		this.denunciaGeral = denunciaGeral;
	}

	public String getIpUsuario() {
		return ipUsuario;
	}

	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}

	public DenunciaGeralEntity(String denunciaGeral, String ipUsuario) {
		super();
		this.denunciaGeral = denunciaGeral;
		this.ipUsuario = ipUsuario;
	}

	public DenunciaGeralEntity() {
		super();
	}

}
