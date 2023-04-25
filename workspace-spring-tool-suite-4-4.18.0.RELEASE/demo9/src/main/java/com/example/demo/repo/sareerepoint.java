package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.sareedetail;
@Repository
public interface sareerepoint extends CrudRepository<sareedetail, Integer> {

}
