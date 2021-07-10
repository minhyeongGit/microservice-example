package shop.watchawiki.api.movie.service;

import lombok.RequiredArgsConstructor;
import shop.watchawiki.api.movie.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public interface MovieService {
    void save(Movie movie);
    List<Movie> findAll();
    void existsById(long movieId);
    int count();
    Optional<Movie> findById(long movieId);
    Movie getById(long movieId);
    void deleteById(long movieId);
}