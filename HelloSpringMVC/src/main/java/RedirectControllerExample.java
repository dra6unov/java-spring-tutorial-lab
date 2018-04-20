import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Метод позволяет редиректить на различные страницы

@Controller
public class RedirectControllerExample {
	@RequestMapping(value="/redirect", method=RequestMethod.GET)
	public String authorInfo(Model model) {
		return "redirect:hello";
	}
	
	//@RequestMapping()
}
