package shop.watchawiki.api.movie.service;

import shop.watchawiki.api.movie.domain.MovieDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface MovieService {
    void addMovie(MovieDto movievo); //영화 등록

    MovieDto searchMovie(String movie_name) throws Exception; //영화 조회

    void delMovie(String movie_name) ; //영화 삭제

    ArrayList<MovieDto> listMovie() throws Exception; //영화 리스트 열람
}
