package vb.dev.video_game_store.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vb.dev.video_game_store.model.VideoGame;

public interface VideoGameRepository  extends MongoRepository<VideoGame, String> {
}
