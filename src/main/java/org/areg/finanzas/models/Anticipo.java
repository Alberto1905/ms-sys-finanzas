package org.areg.finanzas.models;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public class Anticipo {
	
    private Integer control;
    private String nomempresa;
    private String banco;
    private BigDecimal importe;
	private Date fechaTransaccion;
	public Integer getControl() {
		return control;
	}
	public void setControl(Integer control) {
		this.control = control;
	}
	public String getNomempresa() {
		return nomempresa;
	}
	public void setNomempresa(String nomempresa) {
		this.nomempresa = nomempresa;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}
	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}
	
	
	
}
