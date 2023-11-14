package training.webblog.rating;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RateArticleRequestBody {

    private Long articleId;
    private byte stars;
    private String username;

}
