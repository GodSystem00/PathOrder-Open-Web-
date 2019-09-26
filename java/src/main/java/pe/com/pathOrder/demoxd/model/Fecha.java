package pe.com.pathOrder.demoxd.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fechas")
public class Fecha {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaNumeracion",nullable = false)
	private Date fechaNumeracion;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaRetiro",nullable = false)
	private Date fechaRetiro;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaCancelacion",nullable = false)
	private Date fechaCancelacion;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaLevante",nullable = false)
	private Date fechaLevante;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaPrecosteo",nullable = false)
	private Date fechaPrecosteo;
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaKMMP",nullable = false)
	private Date KMMP;
	
	@OneToOne(mappedBy = "fecha", cascade =  CascadeType.ALL)
	OrdenDespacho ordenDespacho;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaNumeracion() {
		return fechaNumeracion;
	}

	public void setFechaNumeracion(Date fechaNumeracion) {
		this.fechaNumeracion = fechaNumeracion;
	}

	public Date getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(Date fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

	public Date getFechaCancelacion() {
		return fechaCancelacion;
	}

	public void setFechaCancelacion(Date fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	public Date getFechaLevante() {
		return fechaLevante;
	}

	public void setFechaLevante(Date fechaLevante) {
		this.fechaLevante = fechaLevante;
	}

	public Date getFechaPrecosteo() {
		return fechaPrecosteo;
	}

	public void setFechaPrecosteo(Date fechaPrecosteo) {
		this.fechaPrecosteo = fechaPrecosteo;
	}

	public Date getKMMP() {
		return KMMP;
	}

	public void setKMMP(Date kMMP) {
		KMMP = kMMP;
	}

	public OrdenDespacho getOrdenDespacho() {
		return ordenDespacho;
	}

	public void setOrdenDespacho(OrdenDespacho ordenDespacho) {
		this.ordenDespacho = ordenDespacho;
	}
	
	
}
