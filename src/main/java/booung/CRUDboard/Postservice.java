package booung.CRUDboard;

import org.springframework.stereotype.Service;

@Service
public class Postservice {

    private PostRepository postRepository;

    public Postservice(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post create(Post post) {
        return postRepository.save(post);
    }

}
