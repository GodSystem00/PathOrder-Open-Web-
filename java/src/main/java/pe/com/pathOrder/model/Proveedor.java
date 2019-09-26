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
@Table(name ="proveedor")
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	@Column(name = "ruc",length =  20,nullable = false)
	private String Ruc;
	@OneToMany(mappedBy = "proveedor")
	private List<OrdenDespacho> ordenesDespacho;
	
	public Proveedor() {
		this.ordenesDespacho = new ArrayList<>();
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

	public String getRuc() {
		return Ruc;
	}

	public void setRuc(String ruc) {
		Ruc = ruc;
	}

	public List<OrdenDespacho> getOrdenesDespacho() {
		return ordenesDespacho;
	}

	public void setOrdenesDespacho(List<OrdenDespacho> ordenesDespacho) {
		this.ordenesDespacho = ordenesDespacho;
	}
	
	
}
