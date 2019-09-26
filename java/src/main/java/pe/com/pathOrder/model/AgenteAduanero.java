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
@Table(name ="agentes_aduaneros")
public class AgenteAduanero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nombre", length = 50,nullable = false)
	private String nombre;
	@Column(name = "nickname", length = 50, nullable = true)
	private String nickname;
	@Column(name = "password",length = 50, nullable = false)
	private String password;
	@Column(name = "permiso")
	private boolean permisoAdmin;
	
	@OneToMany(mappedBy = "agenteAduanero")
	private List<OrdenDespacho> ordenesDespacho;
	
	public AgenteAduanero() {
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isPermisoAdmin() {
		return permisoAdmin;
	}

	public void setPermisoAdmin(boolean permisoAdmin) {
		this.permisoAdmin = permisoAdmin;
	}

	public List<OrdenDespacho> getOrdenesDespacho() {
		return ordenesDespacho;
	}

	public void setOrdenesDespacho(List<OrdenDespacho> ordenesDespacho) {
		this.ordenesDespacho = ordenesDespacho;
	}
}
