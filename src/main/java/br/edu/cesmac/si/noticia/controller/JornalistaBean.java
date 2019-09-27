package br.edu.cesmac.si.noticia.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.edu.cesmac.si.noticia.domain.Jornalista;
import br.edu.cesmac.si.noticia.repository.JornalistaJpa;


@ManagedBean
public class JornalistaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private Jornalista jornalista = new Jornalista();
	private List<Jornalista> jornalistas;

	public void salvar() {
		new JornalistaJpa().cadastrar(jornalista);
	}
	
	public void remover(Jornalista jornalistaDeletar) {
		new JornalistaJpa().remover(jornalistaDeletar);
	}

	public void alterar() {
		new JornalistaJpa().alterar(jornalista);
	}
	
	public List<Jornalista> getListar() {
		jornalistas = new JornalistaJpa().listar();
		return jornalistas;
	}

	public Jornalista getJornalista() {
		return jornalista;
	}

	public void setJornalista(Jornalista jornalista) {
		this.jornalista = jornalista;
	}

}