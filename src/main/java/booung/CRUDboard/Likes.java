package booung.CRUDboard;

import jakarta.persistence.Id;

public class Likes {
    //좋아요를 구현
    @Id
    private Long id;
    Integer likes;
}
