/*
 * @诗屿星河
 */
package jp.co.syxh.controller.syxh2001Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SYXH2001Controller.<br>
 * 
 * @author M
 */
@Controller
public class SYXH2001Controller {
	
	@RequestMapping(path="SYXH/SYXH2001",method=RequestMethod.GET)
	public String syxh2001Controller(Model model) {
		
		model.addAttribute("name", "qq");
		model.addAttribute("age", 20);
		
		return "index";
		
	}

}
