package org.o7planning.hellospringboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
@RestController
public class TestController {

	@RequestMapping("/hello.html")
	public String firstPage() {
		return "Hello World";
	}


}
