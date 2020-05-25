package com.laptrinhjavaweb.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.service.iNewService;

@RestController(value = "newAPIOfAdmin" )
public class NewAPI {
	
	@Autowired
	private iNewService newService;
	
	@PostMapping("/api/new")
	public NewDTO createNew(@RequestBody NewDTO newDTO){		
		return newService.save(newDTO);	
	}
	
	@PutMapping("/api/new")
	public NewDTO updateNew(@RequestBody NewDTO updateNewDTO){		
		return newService.save(updateNewDTO);	
	}
	
	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids){
		newService.delete(ids);
	}
}
