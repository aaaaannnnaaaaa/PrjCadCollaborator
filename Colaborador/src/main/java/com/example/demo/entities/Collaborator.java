package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Collaborator {

	@Entity
	@Table (name = "colaborador")
	public class Collaborador {
		
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long id;
	private String ctps;
	private String pis;
	private String tituloEleitor;
	private String reservista;
	private String estadoCivil;
	private int numDependentes;
	private String ativo;
	private String setor;
	private String cargo;
	private float salario;
	private String telefone1;
	private String telefone2;
	private String emailPessoal;
	private String emailCorporativo;
	
	// idcColaborador
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	// Ctps
	public String getidcCtps() {
		return ctps;
	}

	public void setidcCtps(String ctps) {
		this.ctps = ctps;
	}
	
	// pis
	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}
	
	// tituloEleitor
	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
	// reservista
	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}
	
	// EstadoCivil
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	// numDependentes
	public int getNumDependentes() {
		return numDependentes;
	}

	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}
		
	// ativo
	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	// setor
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	// cargo
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// salario
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}	
	
	// telefone1
	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}		
	
	// telefone2
	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}		
	
	// emailpessoal
	public String getemailPessoal() {
		return emailPessoal;
	}

	public void setemailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}		
		
	// emailcorporativo
	public String getemailCorporativo() {
		return emailCorporativo;
	}

	public void setemailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}		
		
	
	}
}
