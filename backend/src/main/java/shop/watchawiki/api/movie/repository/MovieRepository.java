package shop.watchawiki.api.movie.repository;

import shop.watchawiki.api.movie.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository     // 어노테이션 데이터베이스의 커리를 날릴 수 있는 설정을 한 것이다
// 상속을 받아 기능 여덟개를 가진다.
public interface MovieRepository extends JpaRepository<Movie, Long> {


}
