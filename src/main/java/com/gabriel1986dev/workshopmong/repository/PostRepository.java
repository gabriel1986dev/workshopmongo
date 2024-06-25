package com.gabriel1986dev.workshopmong.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabriel1986dev.workshopmong.domain.Post;

@Repository
public interface PostRepository extends MongoRepository <Post, String> {

}
