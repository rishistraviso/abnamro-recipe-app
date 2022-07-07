package com.abnamro.receipes.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "receipe")
public class Receipe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "noOfServers")
	private int noOfServers;

	@Column(name = "instructions")
	private String instructions;

	@Column(name = "receipeType")
	private int receipeType; 

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "receipe_ingredient",
			joinColumns = @JoinColumn(name = "receipe_id"),
			inverseJoinColumns = @JoinColumn(name = "ingredient_id")
			)
	private Set<Ingredients> ingredients;
	

}
