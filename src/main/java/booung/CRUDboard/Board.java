package booung.CRUDboard;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Board {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "board")
    private List<Post> posts;
}
