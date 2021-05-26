package org.example.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springboot.domain.posts.Posts;

// DTO는 Entity 클래스와 유사한 형태이지만 만들었다
// Entity 클래스는 데이터베이스와 맞닿는 핵심 클래스임
// Entity 클래스가 변경되면 다른 여러 클래스에 영향을 미치지만
// DTO는 view를 위한 클래스 정말 자주 변경이 발생한다. 따라서 역할을 분리하는게 좋다
@Getter
@NoArgsConstructor
public class PostsSaveRequestsDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestsDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
