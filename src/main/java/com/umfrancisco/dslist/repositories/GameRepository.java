package com.umfrancisco.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umfrancisco.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
