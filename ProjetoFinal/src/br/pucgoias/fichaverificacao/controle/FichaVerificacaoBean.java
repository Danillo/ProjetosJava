package br.pucgoias.fichaverificacao.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

/**
 * Classe que representa o formulario web de Ficha de Verificação
 * 
 * @author Danillo
 * 
 */
@Component
@ManagedBean
@SessionScoped
public class FichaVerificacaoBean
{

	private Integer idFichaVerificacao; 

	private String local;

	private String tipolocal;

	private String servico;

	private String valorservico;

	private String data;

	private String conformidade;

	public String getLocal()
	{
		return local;
	}
	public Integer getIdFichaVerificacao()
	{
		return idFichaVerificacao;
	}

	public void setIdFichaVerificacao(Integer idFichaVerificacao)
	{
		this.idFichaVerificacao = idFichaVerificacao;
	}
	
	public void setLocal(String local)
	{
		this.local = local;
	}

	public String getTipolocal()
	{
		return tipolocal;
	}

	public void setTipolocal(String tipolocal)
	{
		this.tipolocal = tipolocal;
	}

	public String getServico()
	{
		return servico;
	}

	public void setServico(String servico)
	{
		this.servico = servico;
	}

	public String getValorservico()
	{
		return valorservico;
	}

	public void setValorservico(String valorservico)
	{
		this.valorservico = valorservico;
	}

	public String getData()
	{
		return data;
	}

	public void setData(String data)
	{
		this.data = data;
	}

	public String getConformidade()
	{
		return conformidade;
	}

	public void setConformidade(String conformidade)
	{
		this.conformidade = conformidade;
	}

}
