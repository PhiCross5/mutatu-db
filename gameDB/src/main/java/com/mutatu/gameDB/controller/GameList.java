package com.mutatu.gameDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mutatu.gameDB.repository.GameTable;

@RestController
@RequestMapping("/fetch/")
public class GameList {

	@Autowired
	private GameTable gameTable;
	
	@GetMapping("/game/welcome")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity("welcome to mutatuDB, the mobile games database!",HttpStatus.OK);
	}
	
//	@GetMapping("/game/{id}")
//	public ResponseEntity<Game> getGameById(@PathVariable("id") Long id) {
//		Optional<Game> game;
//		game = gameTable.findById(id);
//		return null;
//	}
}
