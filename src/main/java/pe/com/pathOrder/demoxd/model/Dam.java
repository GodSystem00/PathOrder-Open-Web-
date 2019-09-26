package pe.com.pathOrder.demoxd.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dam")
public class Dam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "descripcion", length = 100, nullable = false)
	private String descripcion;
	@Column(name ="CIF", precision = 2, nullable = false)
	private float Cif;
	
	@OneToOne(mappedBy = "dam", cascade =  CascadeType.ALL)
	OrdenDespacho ordenDespacho;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	

	public float getCif() {
		return Cif;
	}

	public void setCif(float cif) {
		Cif = cif;
	}

	public OrdenDespacho getOrdenDespacho() {
		return ordenDespacho;
	}

	public void setOrdenDespacho(OrdenDespacho ordenDespacho) {
		this.ordenDespacho = ordenDespacho;
	}
}
