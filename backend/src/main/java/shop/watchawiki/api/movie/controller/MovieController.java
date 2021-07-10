package shop.watchawiki.api.movie.controller;

import org.springframework.web.bind.annotation.*;
import shop.watchawiki.api.movie.domain.Movie;
import shop.watchawiki.api.movie.service.MovieService;
import shop.watchawiki.api.movie.service.MovieServiceImpl;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies") // 테이블이랑 이름 맞춤 (어떤 테이블을 crud해달라고 요청)
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MovieController {
    private final MovieService movieService; // 서비스와 연결

    @PostMapping("")
    public void save(@RequestBody Movie movie) {
        movieService.save(movie);
    }
    @GetMapping("")
    public List<Movie> findAll() {
        return movieService.findAll();
    }
    @GetMapping("/exists/{movieId}")
    public void existsById(@RequestParam long movieId) {
        movieService.existsById(movieId);
    }
    @GetMapping("/count")
    public int count() {
        return movieService.count();
    }
    @GetMapping("/find/{seatId}")
    public Optional<Movie> findById(@RequestParam long movieId) {
        return movieService.findById(movieId);
    }
    @GetMapping("/{seatId}")
    public Movie getById(@RequestParam long movieId) {
        return movieService.getById(movieId);
    }
    @DeleteMapping("/{seatId}")
    public void deleteById(@RequestParam long movieId) {
        movieService.deleteById(movieId);
    }
}
