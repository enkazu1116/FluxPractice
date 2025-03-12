package com.springPractice.springFlux.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springPractice.springFlux.entity.PostEntity;
import com.springPractice.springFlux.service.PostService;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class SampleRestContrller {

    @Autowired
    private PostService postService;

    @RequestMapping("/") 
        public String hello(){
            return "Hello Flux!";
    }

    // Monoは1つのデータを返すことができる
    @RequestMapping("/mono")
    public Mono<String> mono(){
        return Mono.just("Hello Flux (Mono)!");
    }
    
    // Fluxは複数のデータを返すことができる
    @RequestMapping("/flux")
    public Flux<String> flux (){
        return Flux.just("Hello Flux!", "これはFluxのサンプルです。");
    }
    
    /* POSTを利用するリクエストハンドラを作成 */
    @GetMapping("/post/{id}")
    public Mono<String> post(@PathVariable("id") long id){
        PostEntity post = postService.getPostById(id);
        return Mono.just(post.toString());
    }
}
