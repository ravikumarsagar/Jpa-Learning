package com.jpalearning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpalearning.entities.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {

}
