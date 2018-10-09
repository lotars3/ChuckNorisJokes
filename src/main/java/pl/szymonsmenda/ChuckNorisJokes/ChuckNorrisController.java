package pl.szymonsmenda.ChuckNorisJokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChuckNorrisController{

    @GetMapping("/")
    public String generator(ModelMap modelMap){

        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        modelMap.put("joke", chuckNorrisQuotes.getRandomQuote());
        return "jokes";

    }




}
