package com.amigoscode.springbootexample.jsonPlaceHolder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@FeignClient(name = "jsonPlaceholderClient", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceHolderClient {

    @GetMapping("/posts")
    List<Post> getPosts();

    @GetMapping("/posts/{id}")
    Post getPostById(@PathVariable("id") Long id);

    @GetMapping("/posts/{id}/comments")
    List<Comment> getCommentsByPostId(@PathVariable("id") Long postId);

    @GetMapping("/comments")
    List<Comment> getComments(@RequestParam("postId") Long postId);
}
