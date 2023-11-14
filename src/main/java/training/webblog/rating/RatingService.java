package training.webblog.rating;

import org.springframework.stereotype.Service;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public void rateArticle(Long articleId, Byte stars, String username) {

        RatingEntity ratingEntity = new RatingEntity();
        ratingEntity.setArticleId(articleId);
        ratingEntity.setStars(stars);
        ratingEntity.setUsername(username);
        ratingRepository.save(ratingEntity);
    }

}
