package br.pucgoias.fichaverificacao.negocio;

import java.util.List;

import br.pucgoias.fichaverificacao.entidade.FichaVerificacao;
import br.pucgoias.util.FichaVerificacaoException;

/**
 * Interface que define as operacoes da camada de negocio de FichaVerificacao
 * @author Danillo
 *
 */
public interface FichaVerificacaoService {
	
	/**
	 * Inclui uma Ficha de Verificação
	 * @param Fichaverificacao
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public FichaVerificacao incluir(FichaVerificacao FichaVerificacao) throws FichaVerificacaoException;
	
	/**
	 * Altera uma FichaVerificacao
	 * @param FichaVerificacao
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public FichaVerificacao alterar(FichaVerificacao FichaVerificacao) throws FichaVerificacaoException;
	
	/**
	 * Exclui uma FichaVerificacao
	 * @param id
	 * @throws FichaVerificacaoException
	 */
	public void excluir(Integer id) throws FichaVerificacaoException;
	
	/**
	 * Consulta uma FichaVerificacao pelo identificador
	 * @param id
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public FichaVerificacao consultar(Integer id) throws FichaVerificacaoException;
	
	/**
	 * Lista todas as FichaVerificacaos cadastradas
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public List<FichaVerificacao> listar() throws FichaVerificacaoException;

}
