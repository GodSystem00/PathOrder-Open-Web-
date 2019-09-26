package pe.com.pathOrder.demoxd.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "OrdenDespacho")
public class OrdenDespacho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "numeroOrden", length = 50, nullable = false)
	private String numeroOrden;
	@Column(name = "prioridad", length = 20, nullable = false)
	private String prioridad;
	@Column(name = "AWB_BL", length = 20, nullable = false)
	private String AWB_BL;
	@Column(name = "AWB_BL_Origen", length = 20, nullable = false)
	private String AWB_BL_Origen;
	@Column(name = "origen", length = 20, nullable = false)
	private String origen;
	@Column(name = "cantidad_de_series", nullable = false)
	private Integer cantidadSeries;
	@Column(name = "cantidad_de_bultos", nullable = false, columnDefinition = "tinyint")
	private Integer cantidadBultos;
	
	@ManyToOne
	@JoinColumn(name = "canal_id")
	private Canal canal;
	
	@ManyToOne
	@JoinColumn(name = "tipoDespacho_id")
	private TipoDespacho tipoDespacho;
	
	@ManyToOne
	@JoinColumn(name = "proveedor_id")
	private Proveedor proveedor;
	
	@ManyToOne
	@JoinColumn(name = "agenteAduanero_id")
	private AgenteAduanero agenteAduanero;
	
	@OneToMany(mappedBy = "ordenDespacho")
	private List<Bulto> bultos;
	
	@OneToMany(mappedBy = "ordenDespacho")
	private List<Factura> facturas;
	
	@Column(name = "observacion", length = 200, nullable = true)
	private String observacion;
	
	@OneToOne
	@JoinColumn(name ="FK_dam", updatable = false,nullable = false)
	private Dam dam;
	
	@OneToOne
	@JoinColumn(name ="FK_fecha", updatable = false,nullable = false)
	private Fecha fecha;
	
	public OrdenDespacho() {
		this.bultos = new ArrayList<>();
		this.facturas = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(String numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getAWB_BL() {
		return AWB_BL;
	}

	public void setAWB_BL(String aWB_BL) {
		AWB_BL = aWB_BL;
	}

	public String getAWB_BL_Origen() {
		return AWB_BL_Origen;
	}

	public void setAWB_BL_Origen(String aWB_BL_Origen) {
		AWB_BL_Origen = aWB_BL_Origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public Integer getCantidadSeries() {
		return cantidadSeries;
	}

	public void setCantidadSeries(Integer cantidadSeries) {
		this.cantidadSeries = cantidadSeries;
	}

	public Integer getCantidadBultos() {
		return cantidadBultos;
	}

	public void setCantidadBultos(Integer cantidadBultos) {
		this.cantidadBultos = cantidadBultos;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public TipoDespacho getTipoDespacho() {
		return tipoDespacho;
	}

	public void setTipoDespacho(TipoDespacho tipoDespacho) {
		this.tipoDespacho = tipoDespacho;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public AgenteAduanero getAgenteAduanero() {
		return agenteAduanero;
	}

	public void setAgenteAduanero(AgenteAduanero agenteAduanero) {
		this.agenteAduanero = agenteAduanero;
	}

	public List<Bulto> getBultos() {
		return bultos;
	}

	public void setBultos(List<Bulto> bultos) {
		this.bultos = bultos;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
}
