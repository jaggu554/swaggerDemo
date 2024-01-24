package com.example.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Contact",schema="BusinessEntities")
public class ContactEntity {
	@Id @GeneratedValue
	@Column(name="UUId")
	@JsonProperty("UUId")
	private UUID uUId;
	
	@Column(name="NmPrfx")
	@JsonProperty("NmPrfx")
	private String nmPrfx;
	
	@Column(name="Nm")
	@JsonProperty("Nm")
	private String nm;
	
	
}
