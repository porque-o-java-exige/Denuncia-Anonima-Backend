package com.denuncia.anonima.dto;

import jakarta.validation.constraints.NotBlank;

public class DenunciaGeralDTO {
	
	@NotBlank(message = "Denuncia não pode estar vazia")
	private String denunciaGeral;
	private String ipUsuario;
	
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

	public DenunciaGeralDTO(@NotBlank String denunciaGeral, @NotBlank String ipUsuario) {
		this.denunciaGeral = denunciaGeral;
		this.ipUsuario = ipUsuario;
	}
	
}
