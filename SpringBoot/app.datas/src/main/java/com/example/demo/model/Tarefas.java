package com.example.demo.model;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity //Criação da Entidade
public class Tarefas {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String tarefa;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdAt;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;
	
	@Column
	private Date criadoEm;
	
	@PrePersist
	protected void onCreate() {
		criadoEm = new Date();
	}
	
	//getters e setters
	
	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
