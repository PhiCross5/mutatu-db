package com.mutatu.gameDB.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mutatu.gameDB.entity.Game;

@RepositoryRestResource(collectionResourceRel="games", path="games")
public interface GameTable extends PagingAndSortingRepository<Game,Long>{

	public Optional<Game> findById(@Param("id")Long id);
	public List<Game> findByTitle(@Param("title") String title);
	
}
