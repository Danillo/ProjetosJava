package br.pucgoias.fichaverificacao.persistencia;

import java.io.Serializable;
import java.util.List;

import br.pucgoias.util.FichaVerificacaoException;

/**
 * Interface que define as operacoes da camada de persistencia generica
 * @author Danillo
 *
 */
public interface GenericoDAO<T, ID extends Serializable> {
	
	/**
	 * Retorna a classe a ser persistida
	 * @return
	 */
	public Class<T> getObjectClass();
	
	/**
	 * Inclui um objeto T na base de dados
	 * @param object
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public T incluir(T object) throws FichaVerificacaoException;
	
	/**
	 * Altera um objeto T na base de dados
	 * @param object
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public T alterar(T object) throws FichaVerificacaoException;
	
	/**
	 * Consulta um objeto T da base de dados
	 * @param id
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public T consultar(Integer id) throws FichaVerificacaoException;
	
	/**
	 * Exclui um objeto T  da base de dados
	 * @param id
	 * @throws FichaVerificacaoException
	 */
	public void excluir(Integer id) throws FichaVerificacaoException;
	
	/**
	 * Lista os objetos T da base de dados
	 * @return
	 * @throws FichaVerificacaoException
	 */
	public List<T> listar() throws FichaVerificacaoException;
}
