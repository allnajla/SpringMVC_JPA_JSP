package com.example.web;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.ProduitRepository;
import com.example.entities.Produit;

@Controller
public class CatController {

	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping(value = "/Products", method = RequestMethod.GET )
	public String getproduct(Model model,@PathParam (value="motCle") Long motCle, @PathParam (value="action") String action){
	
	if(motCle!=null) {
		Optional<Produit> ocp = Optional.of(produitRepository.findById(motCle).orElseThrow(RuntimeException::new));
		Produit cp = ocp.get();
		model.addAttribute("produit", cp);
		}
	else {
		
		List<Produit> lp = produitRepository.findAll();
		model.addAttribute("produits", lp);
	}
	
	if(action.equals("save")) {
		
		
	}
				
	return "index";
	}
	
}
