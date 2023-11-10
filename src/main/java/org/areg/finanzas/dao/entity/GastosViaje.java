package org.areg.finanzas.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Ctl_Movimientosaut_gvconta")
public class GastosViaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer control;
	
	private Integer noviajero;
	
	private String nombre;
	
	@Column(name = "clave_banco")
	private Integer claveBanco;
	
	private String banco;
	
	@Column(name = "clv_empresa")
	private Integer clvEmpresa;
	
	
	@Column(name = "nomempresa")
	private String nomEmpresa;
	
	private BigDecimal importe;
	
	@Column(name = "tipomovimiento")
	private String tipoMovimento;
	
	@Column(name = "numerocomplemento")
	private Integer numeroComplemento;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_aplicacionpago")
	private Date fechaAplicacionPago;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_transaccion")
	private Date fechaTransaccion;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_generada")
	private Date fechaGenerada;
	
	@Column(name = "empleado_genero")
	private Integer empleadoGenero;
	
	private Integer celula;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_celula")
	private Date fechaCelula;

	public Integer getControl() {
		return control;
	}

	public void setControl(Integer control) {
		this.control = control;
	}

	public Integer getNoviajero() {
		return noviajero;
	}

	public void setNoviajero(Integer noviajero) {
		this.noviajero = noviajero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getClaveBanco() {
		return claveBanco;
	}

	public void setClaveBanco(Integer claveBanco) {
		this.claveBanco = claveBanco;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Integer getClvEmpresa() {
		return clvEmpresa;
	}

	public void setClvEmpresa(Integer clvEmpresa) {
		this.clvEmpresa = clvEmpresa;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Integer getNumeroComplemento() {
		return numeroComplemento;
	}

	public void setNumeroComplemento(Integer numeroComplemento) {
		this.numeroComplemento = numeroComplemento;
	}

	public Date getFechaAplicacionPago() {
		return fechaAplicacionPago;
	}

	public void setFechaAplicacionPago(Date fechaAplicacionPago) {
		this.fechaAplicacionPago = fechaAplicacionPago;
	}

	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public Date getFechaGenerada() {
		return fechaGenerada;
	}

	public void setFechaGenerada(Date fechaGenerada) {
		this.fechaGenerada = fechaGenerada;
	}

	public Integer getEmpleadoGenero() {
		return empleadoGenero;
	}

	public void setEmpleadoGenero(Integer empleadoGenero) {
		this.empleadoGenero = empleadoGenero;
	}

	public Integer getCelula() {
		return celula;
	}

	public void setCelula(Integer celula) {
		this.celula = celula;
	}

	public Date getFechaCelula() {
		return fechaCelula;
	}

	public void setFechaCelula(Date fechaCelula) {
		this.fechaCelula = fechaCelula;
	}
	
	

}
