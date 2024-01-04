package com.generation.farmacia.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O atributo título é Obrigatório!") 
	@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "O atributo texto é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	// Métodos CRUD

    // Método Create
    public Categoria criarCategoria(Categoria novaCategoria) {
        return null;
    }

    // Métodos Read
    public List<Categoria> listarCategorias() {    
        return null;
    }

    public Optional<Categoria> buscarCategoriaPorId(Long id) {
        return Optional.empty();
    }

    // Método Update
    public Categoria atualizarCategoria(Long id, Categoria novaCategoria) {   
        return null;
    }

    // Método Delete
    public void deletarCategoria(Long id) {
        
    }
}
