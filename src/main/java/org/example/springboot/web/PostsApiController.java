package org.example.springboot.web;

import lombok.RequiredArgsConstructor;

import org.example.springboot.service.posts.PostsService;
import org.example.springboot.web.dto.PostsDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsDto.Save requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsDto.Update requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsDto.Response findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @GetMapping("/api/v1/posts")
    public List<PostsDto.Response> findAll(){
        return postsService.findAll();
    }

//    private final PostsService postsService;
//
//    @PostMapping("/api/v1/posts")
//    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
//        return postsService.save(requestDto);
//    }
//
//    @PutMapping("/api/v1/posts/{id}")
//    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
//        return postsService.update(id, requestDto);
//    }
//
//    @GetMapping("/api/v1/posts/{id}")
//    public PostsResponseDto findById(@PathVariable Long id) {
//        return postsService.findById(id);
//    }
}