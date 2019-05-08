package vinay.springframework.spring5framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vinay.springframework.spring5framework.repositories.AuthorSampleRepository;

/**
 * @author kanike
 */
@Controller
public class AuthorSampleController {

    AuthorSampleRepository authorSampleRepository;

    public AuthorSampleController(AuthorSampleRepository authorSampleRepository) {
        this.authorSampleRepository = authorSampleRepository;
    }

    @RequestMapping("/authors")
    public String getAuthorSample(Model model){
        model.addAttribute("authors",authorSampleRepository.findAll());
        return "authors";
    }
}
