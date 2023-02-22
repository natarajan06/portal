
package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Color {
	private String Favcolour="Green";
	@GetMapping("/b")
	public String getMyFav() {
		return "My favourite colour is "+Favcolour;
	}
}