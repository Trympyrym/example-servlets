package test.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class App {
	@RequestMapping(path="/calc/{value}", method = RequestMethod.GET)
	public String calc(@PathVariable String value, Model model) {
		model.addAttribute("value", value);
		return "calc";
	}
}
