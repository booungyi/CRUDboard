package booung.CRUDboard;

import org.springframework.stereotype.Service;

@Service
public class BoardService {

    BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board create (Board board) {
        return boardRepository.save(board);
    }

}
