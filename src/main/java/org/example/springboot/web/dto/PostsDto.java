package org.example.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import org.example.springboot.domain.posts.Posts;

public class PostsDto {

    @Getter
    public static class Response{
        private Long id;
        private String title;
        private String content;
        private String author;

        public Response(Posts entity){
            this.id = entity.getId();
            this.title = entity.getTitle();
            this.content = entity.getContent();
            this.author = entity.getAuthor();
        }
    }

    @Getter
    @NoArgsConstructor
    public static class Save{
        private String title;
        private String content;
        private String author;

        @Builder
        public Save(String title,String content, String author){
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public Posts toEntity(){
            return Posts.builder()
                    .title(title)
                    .content(content)
                    .author(author)
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    public static class Update{
        private String title;
        private String content;

        @Builder
        public Update(String title, String content, String author){
            this.title = title;
            this.content = content;
        }
    }
}
