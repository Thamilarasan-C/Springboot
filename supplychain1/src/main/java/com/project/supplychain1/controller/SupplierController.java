package com.project.supplychain1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.supplychain1.Service.SupplierService;
import com.project.supplychain1.model.Supplier;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@PostMapping("/insert")
	public String add(@RequestBody Supplier supplier) {
		return supplierService.add(supplier);
	}

	@GetMapping
    public List<Supplier> getAllUsers() {
        return supplierService.findAll();
    }

//	@GetMapping("/all/{name}")
//	public List<Supplier> getSuppliers(@PathVariable String name)
//	{
//		return supplierService.getSupplier(name);
//	}

}
