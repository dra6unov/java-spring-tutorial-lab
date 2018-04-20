import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//Благодаря этому контроллеру можно модифицировать страницу в зависимости от URL-а

@Controller
public class PathVariableExampleController {
	@RequestMapping("/web/fe/{sitePrefix}/{lang}/document/{id}/{naturalText}")
	public String documentView(Model model,
			@PathVariable(value="sitePrefix") String sitePrefix,
			@PathVariable(value="lang") String lang,
			@PathVariable(value="id") Long id,
			@PathVariable(value="naturalText") String naturalText
			) 
	{
		model.addAttribute("sitePrefix", sitePrefix);
		model.addAttribute("lang", lang);
		model.addAttribute("id", id);
		model.addAttribute("naturalText", naturalText);
		String documentName="Java tutor";
		if(id==8108) {
			documentName="MVC Spting for me";
		}
		model.addAttribute("documentName", documentName);
				return "documentview";
		
	}

}
