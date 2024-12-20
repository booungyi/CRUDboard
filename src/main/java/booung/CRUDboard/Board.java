package booung.CRUDboard;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Board {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "board")
    private List<Post> posts;

    public Board(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

}
