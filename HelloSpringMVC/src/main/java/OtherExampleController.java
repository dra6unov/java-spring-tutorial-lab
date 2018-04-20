import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Предназначен для запросов и ответов на запросы

@Controller
public class OtherExampleController {
	@RequestMapping("/other")
	public String requsetResponseExample(HttpServletRequest req, HttpServletResponse res, Model model) {
		return "someview";
	}
}
