package br.pucgoias.fichaverificacao.negocio;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.pucgoias.fichaverificacao.entidade.FichaVerificacao;
import br.pucgoias.fichaverificacao.persistencia.FichaVerificacaoDAO;
import br.pucgoias.util.FichaVerificacaoException;

/**
 * Classe que define as operacoes da camada de negocio de Ficha de Verificação
 * 
 * @author Danillo
 * 
 */
@Service
@Transactional
public class FichaVerificacaoImpl implements FichaVerificacaoService
{
	// Interface da persistencia
	private FichaVerificacaoDAO fichaVerificacaoDAO;

	public FichaVerificacaoDAO getFichaVerificacaoDAO()
	{
		return fichaVerificacaoDAO;
	}

	@Autowired
	public void setFichaVerificacaoDAO(FichaVerificacaoDAO fichaVerificacaoDAO)
	{
		this.fichaVerificacaoDAO = fichaVerificacaoDAO;
	}

	/**
	 * Inclui uma Ficha
	 * 
	 * @param fichaVerificacao
	 * @return
	 * @throws FichaVerificacaoException
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public FichaVerificacao incluir(FichaVerificacao fichaVerificacao)
			throws FichaVerificacaoException
	{
		return getFichaVerificacaoDAO().incluir(fichaVerificacao);
	}

	/**
	 * Altera uma Ficha
	 * 
	 * @param fichaVerificacao
	 * @return
	 * @throws FichaVerificacaoException
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public FichaVerificacao alterar(FichaVerificacao fichaVerificacao)
			throws FichaVerificacaoException
	{

		// Exclui os itens da base que foram removidos da tela
		FichaVerificacao fichaVerificacaoExistente = this
				.consultar(fichaVerificacao.getIdFichaVerificacao());

		return getFichaVerificacaoDAO().alterar(fichaVerificacao);
	}

	/**
	 * Exclui uma Ficha 
	 * 
	 * @param fichaVerificacao
	 * @throws FichaVerificacaoException
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void excluir(Integer id) throws FichaVerificacaoException
	{

		// exclui todos os itens antes de excluir a pessoa
		FichaVerificacao fichaVerificacaoExistente = this.consultar(id);

		getFichaVerificacaoDAO().excluir(id);
	}

	/**
	 * Consulta uma Fichas pelo identificador
	 * 
	 * @param id
	 * @return
	 * @throws FichaVerificacaoException
	 */
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public FichaVerificacao consultar(Integer id)
			throws FichaVerificacaoException
	{
		FichaVerificacao pessoa = getFichaVerificacaoDAO().consultar(id);

		return pessoa;
	}

	/**
	 * Lista todas as Fichas cadastradas
	 * 
	 * @return
	 * @throws FichaVerificacaoException
	 */
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<FichaVerificacao> listar() throws FichaVerificacaoException
	{
		return getFichaVerificacaoDAO().listar();
	}
}
