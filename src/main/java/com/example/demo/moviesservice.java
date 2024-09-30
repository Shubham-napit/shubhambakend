package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class moviesservice {
    
     
    private  Moviesrepository m;
     public moviesservice(Moviesrepository m) {
        this.m = m;
    }

    public movies save(movies moviemovie){
        return m.save(moviemovie);
    }
}
