package org.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// Posts 클래스로 Database를 접근하게 해줄 JpaRepository
// DB Layer 접근자
// <Entity 클래스, pk타입> 을 상속하면 기본적은 CRUD 메서드가 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}
