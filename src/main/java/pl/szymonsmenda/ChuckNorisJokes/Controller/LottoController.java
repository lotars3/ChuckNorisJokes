package pl.szymonsmenda.ChuckNorisJokes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.szymonsmenda.ChuckNorisJokes.model.Lotto;

@Controller
public class LottoController{

    @GetMapping("/lotto")
    public String generateLotto(ModelMap modelMap){
        Lotto lotto = new Lotto();
        modelMap.put("lotto", lotto.generateLotto());
        return "lotto";
    }
}
