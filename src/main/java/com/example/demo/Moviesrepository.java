package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  Moviesrepository extends JpaRepository<movies,Long> {
    
}
