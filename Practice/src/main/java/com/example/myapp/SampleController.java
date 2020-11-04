package com.example.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.myapp.VO.ProductVO;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public String doA(Model model) {
		logger.info("doA called....................");
		
		ProductVO product = new ProductVO("productA", 1000);
		model.addAttribute("pname", product.getName());
		model.addAttribute("pprice", product.getPrice());
		
		return "sample";
	}
}
