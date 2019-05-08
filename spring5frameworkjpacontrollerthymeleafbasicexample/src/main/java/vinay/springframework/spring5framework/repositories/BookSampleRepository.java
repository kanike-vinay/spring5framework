package vinay.springframework.spring5framework.repositories;

import org.springframework.data.repository.CrudRepository;
import vinay.springframework.spring5framework.model.BookSample;


/**
 * @author kanike
 */
public interface BookSampleRepository extends CrudRepository<BookSample,Long> {
}
