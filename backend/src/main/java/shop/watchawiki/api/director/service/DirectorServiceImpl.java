package shop.watchawiki.api.director.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.watchawiki.api.director.domain.Director;
import shop.watchawiki.api.director.repository.DirectorRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DirectorServiceImpl implements DirectorService {

    private final DirectorRepository directorRepository;

    @Override
    public Long save(Director director) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Director findOne(Long id) {
        return null;
    }

    @Override
    public List<Director> findAll(String userid) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}