package br.com.SAMIAVET.SAMIAVET_BACK.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="produtos")
public class Produtos {
	
	@Id
	private Integer codigoBarras;
	private String nome;
	private Double precoCompra;
	private Double precoVenda;
	private Double precoDescontoVenda;
	private String distribuidora;
	private String empresa;
	private String dataRegistro;
	private String dataValidade;
	private Integer quantidadeEstoque;
	
	public Produtos(Integer codigoBarras, String nome, Double precoCompra, Double precoVenda, Double precoDescontoVenda,
			String distribuidora, String empresa, String dataRegistro, String dataValidade, Integer quantidadeEstoque) {
		
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.precoDescontoVenda = precoDescontoVenda;
		this.distribuidora = distribuidora;
		this.empresa = empresa;
		this.dataRegistro = dataRegistro;
		this.dataValidade = dataValidade;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public Produtos(){
		
		
	}
	public Integer getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(Integer codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(Double precoCompra) {
		this.precoCompra = precoCompra;
	}
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public Double getPrecoDescontoVenda() {
		return precoDescontoVenda;
	}
	public void setPrecoDescontoVenda(Double precoDescontoVenda) {
		this.precoDescontoVenda = precoDescontoVenda;
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}
