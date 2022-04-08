package com.example.demo.Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Admin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String login;

	private int active;

	@NotEmpty
	private String password;

	@Column(nullable = false)
	@NotBlank
	@Size(min = 5, max = 50, message = "la taille du nom est [5-50]")
	private String nomcomplet;;

	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles = new ArrayList<Role>();

//	@OneToOne(mappedBy = "admin")
//	private Sorties sorties;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNomcomplet() {
		return nomcomplet;
	}

	public void setNomcomplet(String nomcomplet) {
		this.nomcomplet = nomcomplet;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

//	public Sorties getSorties() {
//		return sorties;
//	}
//
//	public void setSorties(Sorties sorties) {
//		this.sorties = sorties;
//	}

	public Admin() {
		super();
	}

	public Admin(String login, int active, @NotEmpty String password,
			@NotBlank @Size(min = 5, max = 50, message = "la taille du nom est [5-50]") String nomcomplet,
			Collection<Role> roles) {
		super();
		this.login = login;
		this.active = active;
		this.password = password;
		this.nomcomplet = nomcomplet;
		this.roles = roles;
		//this.sorties = sorties;
	}

}
