package com.example.Spring.RpController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.Spring.Entity.StuData;
import com.example.Spring.Service.RpService;

@RequestMapping("/Welcome")
@RestController("/rpcollege")

public class ControllerRp {
	
	@Autowired
	RpService rs;
	
	@GetMapping("/gets")
	public String method1() {
		return "Hi Welcome";
	}
	
	@GetMapping("/get1")
	public String method2() {
		return "Hi Welcome Sachin Lets Start Learning Springboot🧑‍💻";
	}
	
//	@GetMapping("/home/{data}")
//	public String method3(@PathVariable (value="data") String name) {
//		return "Hi " + name;
//	}
	
	@PostMapping("/postData")
	public StuData method3(@RequestBody StuData st) {
		return this.rs.method1(st);
	}
	
	@GetMapping("/getAll")
	public List<StuData> method4(){
		rs.method4();
		return rs.method4();
	}
	

	@GetMapping("/getById/{ids}")
	public Optional<StuData> method5(@PathVariable(value = "ids") int id) {
		return rs.method5(id);
	}
		
	
	@PutMapping("/update/{ids}")
	public StuData method6(@RequestBody StuData data ,@PathVariable(value = "ids") int id) {
		return rs.method6(data, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String method7(@PathVariable(value = "id") int id) {
		return rs.method7(id);
	}
}
