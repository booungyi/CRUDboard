package booung.CRUDboard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Board {
    //글안에 포함되어야할 것들
//    작성자 제목 내용 날짜 조회수
    void context() {
        Post post = new Post();
        post.getBoard().context();

    }




}
