package javaes.dao;

import javaes.modelo.Pessoa;

public interface DAOPessoa extends DAOBase<Pessoa> 
{
	public Pessoa getPessoa(long id);
}
