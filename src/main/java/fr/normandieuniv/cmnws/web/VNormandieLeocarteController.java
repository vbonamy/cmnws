package fr.normandieuniv.cmnws.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.normandieuniv.cmnws.db.VNormandieLeocarte;

@RequestMapping("/vnormandieleocarte")
@Controller
@RooWebScaffold(path = "vnormandieleocarte", formBackingObject = VNormandieLeocarte.class, create = false, delete = false, update = false)
@RooWebFinder
public class VNormandieLeocarteController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping(value = "/{leocode}", produces = "text/html")
    public String show(@PathVariable("leocode") String leocode, Model uiModel) {
        uiModel.addAttribute("vnormandieleocarte_", VNormandieLeocarte.findVNormandieLeocarte(leocode));
        uiModel.addAttribute("itemId", leocode);
        return "vnormandieleocarte/show";
    }
    
    @RequestMapping(produces = "text/html", value="")
    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("vnormandieleocartes", VNormandieLeocarte.findVNormandieLeocarteEntries(firstResult, sizeNo));
            float nrOfPages = (float) VNormandieLeocarte.countVNormandieLeocartes() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("vnormandieleocartes", VNormandieLeocarte.findAllVNormandieLeocartes());
        }
        return "vnormandieleocarte/list";
    }
}
