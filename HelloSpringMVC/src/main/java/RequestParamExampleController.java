import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//В зависимости от передаваемого значения переменной name можем модифицировать страницу

@Controller
public class RequestParamExampleController {
	@RequestMapping("/user")
	public String userInfo(Model model, @RequestParam(value="name", defaultValue="Guset") String name) {
		model.addAttribute("name",name);
		if("admin".equals(name)) {
			model.addAttribute("email", "admin@example.com");
		}
		else {
			model.addAttribute("email", "not set");
		}
		return "userinfo";
	}

}
