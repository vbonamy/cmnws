package fr.normandieuniv.cmnws.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;

@RequestMapping("/vnormandieleocarte/**")
@Controller
@RooWebScaffold(path = "vnormandieleocarte", formBackingObject = VNormandieLeocarte.class, create = false, delete = false, update = false)
@RooWebFinder
public class VNormandieLeocarteController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
        return "vnormandieleocarte/index";
    }
}
