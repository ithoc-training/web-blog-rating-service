package training.webblog.rating;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class WebBlogRatingServiceApplication {

    private final RatingRepository ratingRepository;

    public WebBlogRatingServiceApplication(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(WebBlogRatingServiceApplication.class, args);
    }

    @PostConstruct
    private void init() {

        String[] users = {"light.blogger", "heavy.blogger", "creative.blogger"};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                RatingEntity ratingEntity = new RatingEntity();
                ratingEntity.setArticleId(i + 1L);
                ratingEntity.setStars((byte) new Random().nextInt(1, 6));
                ratingEntity.setUsername(users[new Random().nextInt(users.length)]);
                ratingRepository.save(ratingEntity);
            }
        }
    }

}
