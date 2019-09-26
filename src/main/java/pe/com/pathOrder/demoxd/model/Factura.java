package pe.com.pathOrder.demoxd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "factura")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "numero_de_factura",length = 30, nullable = false)
	private String numFactura;
	@Column(name = "descripcion",length = 200, nullable = false)
	private String descrpicion;
	@Column(name = "unidad",columnDefinition = "tinyint")
	private Integer unidad;
	@Temporal(TemporalType.DATE)
	@Column(name ="fecha", nullable = false)
	private Date fecha;
	@ManyToOne
	@JoinColumn(name = "ordenDespacho_id")
	private OrdenDespacho ordenDespacho;
	@ManyToMany
	@JoinTable(name = "factura_mercaderia", joinColumns = {@JoinColumn(name = "factura_id")}, inverseJoinColumns = {@JoinColumn(name = "mercaderia_id")})
	private List<Mercaderia> mercaderias;

	public Factura() {
		this.mercaderias = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getDescrpicion() {
		return descrpicion;
	}

	public void setDescrpicion(String descrpicion) {
		this.descrpicion = descrpicion;
	}

	public Integer getUnidad() {
		return unidad;
	}

	public void setUnidad(Integer unidad) {
		this.unidad = unidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public OrdenDespacho getOrdenDespacho() {
		return ordenDespacho;
	}

	public void setOrdenDespacho(OrdenDespacho ordenDespacho) {
		this.ordenDespacho = ordenDespacho;
	}

	public List<Mercaderia> getMercaderias() {
		return mercaderias;
	}

	public void setMercaderias(List<Mercaderia> mercaderias) {
		this.mercaderias = mercaderias;
	}
}
	