package vinay.springframework.spring5framework.repositories;

import org.springframework.data.repository.CrudRepository;
import vinay.springframework.spring5framework.model.AuthorSample;

/**
 * @author kanike
 */
public interface AuthorSampleRepository extends CrudRepository<AuthorSample,Long> {
}
