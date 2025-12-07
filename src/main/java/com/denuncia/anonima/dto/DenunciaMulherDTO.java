package com.denuncia.anonima.dto;

import jakarta.validation.constraints.NotBlank;

public class DenunciaMulherDTO {
	
	@NotBlank(message = "Denuncia não pode estar vazia")
	private String denunciaMulher;
	private String ipUsuario;
	
	public String getDenunciaMulher() {
		return denunciaMulher;
	}
	public void setDenunciaMulher(String denunciaMulher) {
		this.denunciaMulher = denunciaMulher;
	}
	public String getIpUsuario() {
		return ipUsuario;
	}
	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}
	
	public DenunciaMulherDTO(@NotBlank String denunciaMulher, String ipUsuario) {
		this.denunciaMulher = denunciaMulher;
		this.ipUsuario = ipUsuario;
	}

}
