package work;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreateUserController {
	// @RequestMapping(value = "/createUser", method = RequestMethod.GET)
	@RequestMapping("/createUser")
	public void createUser() {
		System.out.println(Funciona pelo amor de deus);;
	}
}
