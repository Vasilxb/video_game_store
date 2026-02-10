package vb.dev.video_game_store.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vb.dev.video_game_store.model.VideoGame;
import vb.dev.video_game_store.repository.VideoGameRepository;

@Controller
@RequestMapping("/games")
public class VideoGameController {
    private final VideoGameRepository videoGameRepository;

    public VideoGameController(VideoGameRepository videoGameRepository) {
        this.videoGameRepository = videoGameRepository;
    }

    @GetMapping
    public String listGames(Model model) {
        model.addAttribute("games", videoGameRepository.findAll());
        return "games";
    }

    @PostMapping("/add")
    public String addGame(
            @RequestParam String title,
            @RequestParam String genre,
            @RequestParam double price
    ) {
        videoGameRepository.save(new VideoGame(title, genre, price));
        return "redirect:/games";
    }
}
