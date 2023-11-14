package training.webblog.rating;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "rating")
@Getter
@Setter
public class RatingEntity {

    @SuppressWarnings("JpaDataSourceORMInspection")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long articleId;
    private Byte stars;
    private String username;

}
