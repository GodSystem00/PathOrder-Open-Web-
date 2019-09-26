package pe.com.pathOrder.demoxd.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name ="canal")
public class Canal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	@Column(name = "descripcion",length = 200,nullable = true)
	private String descripcion;
	@OneToMany(mappedBy = "canal")
	private List<OrdenDespacho> ordenesDespachos;
	
	public Canal() {
		this.ordenesDespachos = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<OrdenDespacho> getOrdenesDespachos() {
		return ordenesDespachos;
	}

	public void setOrdenesDespachos(List<OrdenDespacho> ordenesDespachos) {
		this.ordenesDespachos = ordenesDespachos;
	}
	
	
}
