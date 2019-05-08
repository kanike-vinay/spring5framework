package vinay.springframework.spring5framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vinay.springframework.spring5framework.repositories.BookSampleRepository;

/**
 * @author kanike
 */
@Controller
public class BookSampleController {

    private BookSampleRepository bookSampleRepository;

    public BookSampleController(BookSampleRepository bookSampleRepository) {
        this.bookSampleRepository = bookSampleRepository;
    }

    @RequestMapping("/books")
    public String getSampleBooks(Model model){
        model.addAttribute("books",bookSampleRepository.findAll());
        return "books";
    }
}
