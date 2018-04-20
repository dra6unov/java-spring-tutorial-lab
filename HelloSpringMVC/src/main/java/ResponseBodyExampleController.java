import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Контроллер возвращает текстовое значение вместо конкретного представления. Происходит это благодаря @ResponseBody

@Controller
public class ResponseBodyExampleController {
@RequestMapping(value="/saveResult")
@ResponseBody
public String authorInfo(Model model) {
	return "saved";
}
}
