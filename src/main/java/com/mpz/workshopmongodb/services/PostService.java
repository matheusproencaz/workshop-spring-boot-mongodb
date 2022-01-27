package com.mpz.workshopmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpz.workshopmongodb.domain.Post;
import com.mpz.workshopmongodb.repositories.PostRepository;
import com.mpz.workshopmongodb.services.exceptions.ObjectNotFoundException;

@Service
public class PostService{

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}	
}