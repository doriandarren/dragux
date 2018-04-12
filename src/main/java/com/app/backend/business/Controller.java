package com.app.backend.business;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="controlador")
@SessionScoped
public class Controller implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String saludo="";
	
	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
}
