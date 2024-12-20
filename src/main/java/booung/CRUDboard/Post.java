package booung.CRUDboard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String Post;
    private List<Comment> comments;


    private LocalDate Date;
    private Integer views;
    private Board board;
    private String author;

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

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getDate() {
        return Date;
    }

    public Integer getViews() {
        return views;
    }
}
