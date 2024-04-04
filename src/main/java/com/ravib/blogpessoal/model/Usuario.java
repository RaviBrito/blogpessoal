package com.ravib.blogpessoal.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	
	public Usuario(long id, String nome,String usuario, String senha, String foto, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.foto = foto;
		
		
	}
	public Usuario() {		
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "Identificador único para cada Usuário. ", example = "1", required = true)
	private long id;
	
	@NotNull(message = "O atributo nome é Obrigatório!")
	@Schema(description = "Armazena o nome do usuário.", example = "Caio Dias", required = true)
	private String nome;

	@Schema(description = "Armazena o e-mail de acesso do usuário.", example = "dias.caio@example.com", required = true)
	@NotNull(message = "O atributo usuario é Obrigatório!")
	@Email(message = "O atributo usuario deve ser um e-mail valido!")
	private String usuario;
	
	@NotBlank (message = "O atributo sneha é obrigatório!")
	@Size (min= 8, message = "A senha deve ter no minimo 8 caracteres")
	@Schema(description = "Armazena a senha do usuário.", example = "senhasecreta", required = true)
	private String senha;
	
	@Size(max=5000, message= "O atributo não pode ser maior que 5000 caracteres")
	@Schema(description = "Armazena a foto do usuario a partir da URL. ", example = "http://example.com/photo.jpg")
	private String foto;
	
	@OneToMany (mappedBy="usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	

}
