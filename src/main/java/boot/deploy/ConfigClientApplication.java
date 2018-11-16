package boot.deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@GetMapping("/bar")
	public String bar(@Value("${bar: notDefined}") String bar) {
		return bar;
	}
	
	@GetMapping("/foo")
	public String foo(@Value("${foo: notDefined}") String foo) {
		return foo;
	}

}
