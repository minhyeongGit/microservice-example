package shop.watchawiki.api.movie.domain;

import javax.persistence.*;

@Entity
@Table(name = "movies")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private Long movie_code;   // 영화 코드

    @Column private String movie_name;   // 영화 이름
    @Column private String release_day; // 개봉일
    @Column private int total_rating; // 총 평점
    @Column private String runningTime; // 상영 시간
    @Column private int grade_code; // 등급 코드
    @Column private int nation_code; // 국가 코드
    @Column private String summary; // 줄거리
    @Column private String awards; // 수상 내역
    @Column private String movie_profile; // 영화 대표 이미지
}
