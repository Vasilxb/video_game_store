package vb.dev.video_game_store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "video_games")
public class VideoGame {
    @Id
    private String id;

    private String title;
    private String genre;
    private double price;
    public VideoGame(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }
}
