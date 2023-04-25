package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.sareedetail;
import com.example.demo.service.sareeService;

@RestController

public class sareecontroller {
	@Autowired sareeService obj;
	@PostMapping("/post")
	public sareedetail addDetail(@RequestBody sareedetail a)
	{
		return obj.save(a);
	}
	@GetMapping("/get")
	public List<sareedetail> getDtails()
	{
		return obj.findAllsaree();
		
	}
	@PutMapping("/put")
	public sareedetail updateDetails(@RequestBody sareedetail cid)
	
	{
		return obj.update(cid);
	}
@DeleteMapping("/dsaree/{sareeid}")
public String deleteDetails(@PathVariable("sareeid")int mid)
{
	obj.delete(mid);
	return "Deleted Sucessfully";
}
}

