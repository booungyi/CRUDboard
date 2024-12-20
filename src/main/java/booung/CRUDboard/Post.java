package booung.CRUDboard;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Post {
    @Id
    private Long id;

    private String title;
    private String content;
    private String Post;

    @ManyToOne
    private Board board;

    @OneToMany(mappedBy = "comment")
    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public Board getBoard() {
        return board;
    }

    public Long getId() {
        return id;
    }

    public String getPost() {
        return Post;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}
