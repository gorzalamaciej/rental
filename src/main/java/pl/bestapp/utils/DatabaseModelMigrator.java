package pl.bestapp.utils;

import com.googlecode.flyway.core.Flyway;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseModelMigrator {
  private final Logger logger = LoggerFactory.getLogger(DatabaseModelMigrator.class);

  @Autowired
  private DataSource dataSource;

  @PostConstruct
  private void onStartup() {
    if (dataSource == null) {
      logger.error("No datasource found to execute the db migrations!");
    }
    Flyway flyway = new Flyway();
    flyway.setInitOnMigrate(true);
    flyway.setDataSource(dataSource);
    flyway.setOutOfOrder(true);

    logger.info("*** Flyway db.migration start ***");
    //flyway.migrate();
    logger.info("*** Flyway db.migration stop ***");
  }
}