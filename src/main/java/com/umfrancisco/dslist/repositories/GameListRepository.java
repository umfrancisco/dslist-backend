package com.umfrancisco.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umfrancisco.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
