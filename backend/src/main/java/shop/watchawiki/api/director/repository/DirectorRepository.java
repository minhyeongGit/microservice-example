package shop.watchawiki.api.director.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.watchawiki.api.director.domain.Director;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}
