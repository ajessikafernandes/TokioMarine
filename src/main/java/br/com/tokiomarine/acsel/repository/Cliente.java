package br.com.tokiomarine.acsel.repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author jessikafernandess 
 */

//A classe Cliente representa uma entidade e seus objetos devem ser persistidos no banco de dados.
@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCliente;
	
	@Column (name = "NOME_CLIENTE", length = 100, nullable = false)
	private String nomeCliente;
	
	@Column (name = "CPF_CLIENTE", length = 11, nullable = false)
	private Long cpfCliente;
	
	@OneToMany(mappedBy="cliente")
	private List<Apolice> apolicesCliente;

	/* Getters and Setters */
	
	public Long getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Long idCliente) {
		IdCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Long getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(Long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public List<Apolice> getApolicesCliente() {
		return apolicesCliente;
	}

	public void setApolicesCliente(List<Apolice> apolicesCliente) {
		this.apolicesCliente = apolicesCliente;
	}
	
}
