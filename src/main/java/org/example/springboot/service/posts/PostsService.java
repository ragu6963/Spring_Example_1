package org.example.springboot.service.posts;
import lombok.RequiredArgsConstructor;

import org.example.springboot.domain.posts.Posts;
import org.example.springboot.domain.posts.PostsRepository;
import org.example.springboot.web.dto.PostsDto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsDto.Save requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsDto.Update requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(()->
                new IllegalAccessError("해당 게시글이 없습니다. id = " +id));

        posts.update(requestDto.getTitle(),requestDto.getContent());

        return id;
    }

    public PostsDto.Response findById (Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() ->  new IllegalAccessError("해당 게시글이 없습니다. id = " +id));

        return new PostsDto.Response(entity);
    }

}

