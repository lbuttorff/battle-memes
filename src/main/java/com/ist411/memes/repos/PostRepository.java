package com.ist411.memes.repos;

import com.ist411.memes.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>{
}
