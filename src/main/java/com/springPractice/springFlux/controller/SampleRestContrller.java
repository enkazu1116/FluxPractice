package com.springPractice.springFlux.controller;

import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class SampleRestContrller {
    
    @Autowired
    // private PostRepository postRepository;

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


    @RequestMapping("/post")
    public Mono<String> post(){
        // Post post = new Post(0,0, "post title", "post content");
        // return Mono.just(post.toString());
        return Mono.just("後日修正予定");
    }
}
