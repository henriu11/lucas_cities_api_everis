package com.github.henriu11.lucascitiesapi.states.repositories;


import com.github.henriu11.lucascitiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

