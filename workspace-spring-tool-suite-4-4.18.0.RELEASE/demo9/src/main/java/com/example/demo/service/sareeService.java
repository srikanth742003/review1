package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.sareedetail;
import com.example.demo.repo.sareerepoint;

@Service
public class sareeService {
@Autowired
private sareerepoint sri;

public sareedetail save(sareedetail a)
{
	return sri.save(a);
}
public sareedetail update(sareedetail u)
{
	return sri.save(u);
}
public List<sareedetail> findAllsaree()
{
	return (List<sareedetail>) sri.findAll();
}
public void delete(int id)
{
	sri.deleteById(id);
}
}