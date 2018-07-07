package com.alvaroscheid.eiti.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	@Getter
	@Setter
	private Long id;

	@Column
	@Getter
	@Setter
	private String username;

	@Column
	@Getter
	@Setter
	private String password;

	@Column
	@Getter
	@Setter
	private Boolean isEnable;

	@Column
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Getter
	@Setter
	private Date registerDate;

	@Column
	@Getter
	@Setter
	private String name;

	@Column
	@Getter
	@Setter
	private String surname;

	@Column
	@Getter
	@Setter
	private String email;

	@Column
	@Getter
	@Setter
	private String phone;

}
