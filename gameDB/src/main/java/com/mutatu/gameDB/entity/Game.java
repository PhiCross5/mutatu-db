package com.mutatu.gameDB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name="games")
public class Game {

	@Id
	private Long id;
	private String title;
	private String link;
	private String description;
	
}
