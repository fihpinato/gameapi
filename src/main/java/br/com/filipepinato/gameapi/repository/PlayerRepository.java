package br.com.filipepinato.gameapi.repository;

import br.com.filipepinato.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {

}
