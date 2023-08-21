package fon.bg.ac.rs.masterApp.controllers;

import fon.bg.ac.rs.masterApp.dtos.TextileStatusDto;
import fon.bg.ac.rs.masterApp.servicesImpl.TextileStatusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TextileStatusController {

    @Autowired
    private TextileStatusServiceImpl textileStatusServiceImpl;

    @GetMapping("/textileStatuses")
    public String getTextileStatus(Model model) {

        List<TextileStatusDto> textileStatuses = textileStatusServiceImpl.getTextileStatuses();
        System.out.println(textileStatuses);
        model.addAttribute("textileStatuses", textileStatuses);
                if(textileStatuses.isEmpty()){
            model.addAttribute("textileStatuses", null);
        }else {
            model.addAttribute("textileStatuses", textileStatuses);
        }
        //ovaj model saljem ka HTML stranici
        return "TextileStatus";
    }

    @PostMapping("/textileStatuses/addNew")
    public String addBew(TextileStatusDto textileStatus) {
        TextileStatusDto savedTextileStatus = textileStatusServiceImpl.saveTextileStatus(textileStatus);
        System.out.println(textileStatus.getId());
        return "redirect:/textileStatuses";
    }

    @RequestMapping(value = "/textileStatuses/findById/", params = {"id"}, method = RequestMethod.GET)
    @ResponseBody
    public TextileStatusDto findById(@RequestParam("id") Integer id) {
        TextileStatusDto textileStatus = textileStatusServiceImpl.findById(id);
        System.out.println(textileStatus);
        return textileStatusServiceImpl.findById(id);
    }
}
