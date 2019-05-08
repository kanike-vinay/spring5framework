package vinay.springframework.spring5framework.repositories;

import org.springframework.data.repository.CrudRepository;
import vinay.springframework.spring5framework.model.PublisherSample;

/**
 * @author kanike
 */
public interface PublisherSampleRepository extends CrudRepository<PublisherSample,Long> {
}
