package com.wassabi.model;
// Generated 18 de nov. de 2022 00:13:14 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Venda generated by hbm2java
 */
@Entity
@Table(name = "Venda")
public class Venda implements java.io.Serializable {

	private Integer vendaId;
	private Cliente cliente;
	private float vendaTotal;
	private Date vendaData;
	private Set<VendaHasProduto> vendaHasProdutos = new HashSet<VendaHasProduto>(0);

	public Venda() {
	}

	public Venda(Cliente cliente, float vendaTotal, Date vendaData) {
		this.cliente = cliente;
		this.vendaTotal = vendaTotal;
		this.vendaData = vendaData;
	}

	public Venda(Cliente cliente, float vendaTotal, Date vendaData, Set<VendaHasProduto> vendaHasProdutos) {
		this.cliente = cliente;
		this.vendaTotal = vendaTotal;
		this.vendaData = vendaData;
		this.vendaHasProdutos = vendaHasProdutos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Venda_id", unique = true, nullable = false)
	public Integer getVendaId() {
		return this.vendaId;
	}

	public void setVendaId(Integer vendaId) {
		this.vendaId = vendaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Venda_cliente", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "Venda_total", nullable = false, precision = 30)
	public float getVendaTotal() {
		return this.vendaTotal;
	}

	public void setVendaTotal(float vendaTotal) {
		this.vendaTotal = vendaTotal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Venda_data", nullable = false, length = 19)
	public Date getVendaData() {
		return this.vendaData;
	}

	public void setVendaData(Date vendaData) {
		this.vendaData = vendaData;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "venda")
	public Set<VendaHasProduto> getVendaHasProdutos() {
		return this.vendaHasProdutos;
	}

	public void setVendaHasProdutos(Set<VendaHasProduto> vendaHasProdutos) {
		this.vendaHasProdutos = vendaHasProdutos;
	}

}
