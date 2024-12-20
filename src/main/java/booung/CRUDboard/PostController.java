package booung.CRUDboard;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    Postservice postservice;

    public PostController(Postservice postservice) {
        this.postservice = postservice;
    }

    @PostMapping("/board/post")
    public void post(@Valid @RequestBody Post post) {
        postservice.create(post);
    }
}
