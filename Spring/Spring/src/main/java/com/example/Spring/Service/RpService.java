package com.example.Spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;
import com.example.Spring.Entity.StuData;
import com.example.Spring.Repository.JpaRepos;

@Service
public class RpService {
	
	@Autowired
	JpaRepos repo;
	
	public StuData method1(StuData details) {
		return this.repo.save(details);
	}
	
	public List<StuData> method4(){
		return repo.findAll();
	}
	
	
	public Optional<StuData> method5(int ids) {
		return repo.findById(ids);
	}
	
	public StuData method6(StuData newData, int idd) {
		StuData oldData = repo.findById(idd).orElseThrow(()-> new NullPointerException("Id is not found"));
		oldData.setNames(newData.getNames());
		oldData.setDepartment(newData.getDepartment());
//		oldData.setS_no(newData.getS_no());
		oldData.setTravel(newData.getTravel());
		return repo.save(oldData);
	}
	
	public String method7(int id) {
		repo.deleteById(id);
//	 StuData oldss = repo.findById(id).orElseThrow(() -> new NullPointerException("NOt Found")); 
 List<StuData> oldData= repo.findAll(Sort.by("s_no"));
		
	 int index=1;
	 for(StuData datas :oldData) {
		datas.setS_no(index++);
	 }
//	 repo.saveAll(oldss);
//		return("Deleted successfully");
	 return "Deleted";
	}
}





