package exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import exam.entity.person;

@Repository
public interface personRepository extends JpaRepository<person, Integer> {

}
package exam.repository;

public class personRepository {
}
