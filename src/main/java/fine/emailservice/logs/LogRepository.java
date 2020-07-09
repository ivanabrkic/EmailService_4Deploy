package fine.emailservice.logs;

import fine.emailservice.logs.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository  extends CrudRepository<Log, Long> {

}
