package br.pucgoias.fichaverificacao.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Classe que representa os dados persistentes de Ficha
 * @author Danillo
 *
 */
@Entity
@Table(name="pessoa")
public class FichaVerificacao implements Serializable{

	private static final long serialVersionUID = 6487849002108370775L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idFichaVerificacao")
	private Integer idFichaVerificacao;
	
	@Column(name="local")
	private String local;

	@Column(name="tipolocal")
	private String tipolocal;
	
	@Column(name="servico")
	private String servico;
	
	@Column(name="valorservico")
	private String valorservico;

	@Column(name="data")
	private String data;
	
	@Column(name="conformidade")
	private String conformidade;
	
	public Integer getIdFichaVerificacao() {
		return idFichaVerificacao;
	}

	public void setIdFichaVerificacao(Integer idFichaVerificacao) {
		this.idFichaVerificacao = idFichaVerificacao;
	}
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipolocal() {
		return tipolocal;
	}

	public void setTipolocal(String tipolocal) {
		this.tipolocal = tipolocal;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getValorservico() {
		return valorservico;
	}

	public void setValorservico(String valorservico) {
		this.valorservico = valorservico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getConformidade() {
		return conformidade;
	}

	public void setConformidade(String conformidade) {
		this.conformidade = conformidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idFichaVerificacao == null) ? 0 : idFichaVerificacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FichaVerificacao other = (FichaVerificacao) obj;
		if (idFichaVerificacao == null) {
			if (other.idFichaVerificacao != null)
				return false;
		} else if (!idFichaVerificacao.equals(other.idFichaVerificacao))
			return false;
		return true;
	}

}
