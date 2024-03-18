package com.ravib.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity // definindo como entidade cria tb
@Table(name = "tb_postagens") // nome da tabela

public class Postagem { // criaçao de atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O Atributo Titulo é obrigatorio")
	@Size(min = 5, max = 100, message = "O Atributo titulo deve conter no minimo 05 e no máximo 100 caractteres")
	private String titulo;

	@NotBlank(message = "O Atributo texto é obrigatorio")
	@Size(min = 5, max = 100, message = "O Atributo texto deve conter no minimo 10 e no máximo 1000 caractteres")
	private String texto;

	@UpdateTimestamp
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	

}
