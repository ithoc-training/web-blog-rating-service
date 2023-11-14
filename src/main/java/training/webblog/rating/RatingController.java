package training.webblog.rating;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/rating")
    public ResponseEntity<Void> rateArticle(@RequestBody RateArticleRequestBody rateArticleRequestBody) {

        ratingService.rateArticle(rateArticleRequestBody.getArticleId(),
                rateArticleRequestBody.getStars(), rateArticleRequestBody.getUsername());

        return ResponseEntity.ok().build();
    }

}
