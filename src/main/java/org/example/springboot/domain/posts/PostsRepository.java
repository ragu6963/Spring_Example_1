package org.example.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;

// Posts,Long : Entity 클래스, PK 타입
public interface PostsRepository extends JpaRepository<Posts,Long> {
}
