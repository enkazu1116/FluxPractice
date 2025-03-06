package com.springPractice.springFlux.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.springPractice.springFlux.Entity.PostEntity;
import com.springPractice.springFlux.Service.PostService;

import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping("/post/{id}")
    public Mono<String> post(@PathVariable("id") long id){
        PostEntity post = postService.getPostById(id);
        return Mono.just(post.toString());
    }
}
