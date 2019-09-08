package com.shopshopista.humanss.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopshopista.humanss.model.Vendedor;
import com.shopshopista.humanss.repository.IVendedorRepository;

@RestController
public class VendedorController {

	@Autowired
	private IVendedorRepository vendedorRepositorio;
	
	@PostMapping("/vendedores/insertar")
    public Vendedor insertar(@RequestBody Vendedor vendedor) {
        return this.vendedorRepositorio.save(vendedor);
    }
	
	 @GetMapping("/vendedores")
	 public List<Vendedor> seleccionar() {
	    return this.vendedorRepositorio.findAll();
	 }
}