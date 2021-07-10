package shop.watchawiki.api.movie.service;

import shop.watchawiki.api.movie.domain.Movie;
import shop.watchawiki.api.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor    // 생성자 만들기
public class MovieServiceImpl implements MovieService{

    MovieRepository movieRepository;

    @Override
    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public void existsById(long movieId) {
        movieRepository.existsById(movieId);
    }

    @Override
    public int count() {
        return (int)movieRepository.count();
    }

    @Override
    public Optional<Movie> findById(long movieId) {
        return movieRepository.findById(movieId);
    }

    @Override
    public Movie getById(long movieId) {
        return movieRepository.getById(movieId);
    }

    @Override
    public void deleteById(long movieId) {
        movieRepository.deleteById(movieId);
    }
}