package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.googlecode.jmapper.JMapper;

@RestController
@EnableAutoConfiguration
public class Controller {

	@RequestMapping("/")
	public String home() {
		final JMapper<XDTO, X> mapper = new JMapper<>(XDTO.class, X.class);
		final X x = new X();
		x.name = "PETER";
		return mapper.getDestination(x).toString();

	}
}