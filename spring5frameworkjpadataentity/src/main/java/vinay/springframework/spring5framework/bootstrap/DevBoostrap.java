package vinay.springframework.spring5framework.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import vinay.springframework.spring5framework.model.AuthorSample;
import vinay.springframework.spring5framework.model.BookSample;
import vinay.springframework.spring5framework.repositories.AuthorSampleRepository;
import vinay.springframework.spring5framework.repositories.BookSampleRepository;

/**
 * @author kanike
 */
@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorSampleRepository authorSampleRepository;
    private BookSampleRepository bookSampleRepository;

    public DevBoostrap(AuthorSampleRepository authorSampleRepository, BookSampleRepository bookSampleRepository) {
        this.authorSampleRepository = authorSampleRepository;
        this.bookSampleRepository = bookSampleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        AuthorSample vinay = new AuthorSample("Vinay","Kanike");
        BookSample ada = new BookSample("Algorithm and Design","5481","Prism");
        vinay.getBookSampleSet().add(ada);
        ada.getAuthorSampleSet().add(vinay);
        authorSampleRepository.save(vinay);
        bookSampleRepository.save(ada);


        AuthorSample nihar = new AuthorSample("Nihar","Kanike");
        BookSample mp = new BookSample("Micro Processor","777","Novel");
        nihar.getBookSampleSet().add(mp);
        mp.getAuthorSampleSet().add(nihar);
        authorSampleRepository.save(nihar);
        bookSampleRepository.save(mp);
    }
}
