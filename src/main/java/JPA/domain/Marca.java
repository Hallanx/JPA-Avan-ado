package JPA.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MARCA")
public class Marca {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
	@SequenceGenerator(name="marca_seq", sequenceName = "sq_marca", initialValue = 1, allocationSize = 10)
	private Long id;
	
	@Column(name="CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name="NOME", length = 50, nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "marca")
	private List<Carro> carros;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}



}
