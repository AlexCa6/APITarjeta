package com.ibm.academia.tarjeta.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tarjetas", schema = "tarjeta")
public class Tarjeta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="preferencias", nullable = false, length = 100)
	private String preferencias;
	
	@Column(name = "salario", nullable = false)
	private BigDecimal salario;
	
	@Column(name = "edad", nullable = false)
	private Integer edad;
	
	private static final long serialVersionUID = 1L;

}
