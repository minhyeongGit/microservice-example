package shop.watchawiki.api.director.domain;


import lombok.AllArgsConstructor;
        import lombok.Builder;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import org.springframework.data.annotation.Id;

        import javax.persistence.*;
        import java.time.LocalDate;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "directors")
public class DirectorDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private long director_code;             // 감독 코드

    @Column private String director_name;           // 감독 이름
    @Column private String made_movie;              // 제작한 영화
    @Column private String director_represent;      // 대표작
    @Column private String director_profile;        // 감독 대표 이미지
    @Column private int director_age;               // 감독의 나이
}