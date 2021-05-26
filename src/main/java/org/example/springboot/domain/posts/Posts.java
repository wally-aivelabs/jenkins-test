package org.example.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springboot.domain.BaseTimeEntity;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
    private Long id;

    @Column(length = 500, nullable = false)
    // 굳이 선언을 안해도 해당 클래스의 필드는 모두 칼럼이 됨
    // 추가로 변경이 필요한 옵션이 있을 시 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    // 해당 클래스의 빌더 패턴 클래스를 생성
    // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    // 생성자나 빌더나 생성 시점에 값을 채워주는 역할을 똑같음
    // 다만, 생성자의 경우 지금 채워야 할 필드가 무엇인지 명확히 지정할 수가 없습니다.
    // 빌더를 사용하면 어느 필드에 어떤 값을 채워야 하는지 명확하게 인지 가능 builder().a(a).b(b).build();
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
