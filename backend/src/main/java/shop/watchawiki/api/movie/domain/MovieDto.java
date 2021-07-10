package shop.watchawiki.api.movie.domain;

import lombok.Data;

import javax.persistence.Column;

@Data
// Dto --> 데이터를 주고받을 포맷
public class MovieDto {
    private Long movieId;   // 영화 아이디
    private String movie_name;   // 영화 이름
    private String release_day; // 개봉일
    private int total_rating; // 총 평점
    private String runningTime; // 상영 시간
    private int grade_code; // 등급 코드
    private int nation_code; // 국가 코드
    private String summary; // 줄거리
    private String awards; // 수상 내역
    private String movie_profile; // 영화 대표 이미지
}
