package booung.CRUDboard;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
    //댓글 구현
    @Id
    private Long id;

    private String comment;

    private Integer likeCount;

    @ManyToOne
    private Post post;
}
