
package com.ravib.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravib.blogpessoal.model.Postagem;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem, Long>{
	List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

}
