package shop.watchawiki.api.director.service;

import org.springframework.stereotype.Service;
import shop.watchawiki.api.director.domain.Director;

import java.util.List;

@Service
public interface DirectorService {
    public Long save(Director director);
    public void remove(Long director_code);
    public Director findOne(Long director_code);
    public List<Director> findAll(String user_code);
    public void deleteAll();
}
