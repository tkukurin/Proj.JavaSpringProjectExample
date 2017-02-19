package co.kukurin;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    // alternate example of data source config bound to the dev profile
    // does essentially the same job as in application-dev.yaml.

//    @Profile("dev")
//    @Bean
//    public DataSource embeddedDataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:schema.sql")
//                .addScript("classpath:data-h2.sql")
//                .build();
//    }

}
