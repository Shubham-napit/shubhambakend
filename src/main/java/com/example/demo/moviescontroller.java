package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mov")
public class moviescontroller {
   
   private final moviesservice m;
   

   public moviescontroller(moviesservice m) {
    this.m = m;
}

@PostMapping("/movies")
public movies save(movies moviemovie){
    return m.save(moviemovie);
   }
}
