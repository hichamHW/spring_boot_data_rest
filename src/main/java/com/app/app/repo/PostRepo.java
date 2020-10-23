package com.app.app.repo;

import com.app.app.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PostRepo extends JpaRepository<Post,Integer> {
}
