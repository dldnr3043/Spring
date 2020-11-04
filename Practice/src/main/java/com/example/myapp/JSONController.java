package com.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myapp.VO.ProductVO;

@Controller
public class JSONController {
	@RequestMapping("doJson")
	public @ResponseBody ProductVO doJson() {
		ProductVO product = new ProductVO("productB", 2000);
		return product;
	}
}
