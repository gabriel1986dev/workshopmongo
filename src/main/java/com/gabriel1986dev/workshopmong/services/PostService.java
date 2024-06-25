package com.gabriel1986dev.workshopmong.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel1986dev.workshopmong.domain.Post;
import com.gabriel1986dev.workshopmong.domain.User;
import com.gabriel1986dev.workshopmong.repository.PostRepository;
import com.gabriel1986dev.workshopmong.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
}	
	