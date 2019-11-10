package br.com.tokiomarine.acsel.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author jessikafernandess 
 */

//A classe Apolice representa uma entidade e seus objetos devem ser persistidos no banco de dados.
@Entity
@Table(name = "APOLICE")
public class Apolice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idApolice;
	
	@ManyToOne
    @JoinColumn(name="cliente_idCliente", nullable=false)
	private Cliente cliente;
	
	@Column (name = "COD_PRODUTO", length = 24, nullable = false)
	private String codProduto;

	/* Getters and Setters */

	public Long getIdApolice() {
		return idApolice;
	}

	public void setIdApolice(Long idApolice) {
		this.idApolice = idApolice;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

}
