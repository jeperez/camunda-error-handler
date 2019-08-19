/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.ApplicationConfiguration
 *
 * @Project:  camunda-firsttouch
 * @Author:   RashadKh
 * @Created:  8/8/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch;

import az.bankrespublika.camunda.demo.camundafirsttouch.listener.ProgressLoggingExecutionListener;
import com.fasterxml.uuid.Generators;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.history.HistoryLevel;
import org.camunda.bpm.engine.impl.persistence.StrongUuidGenerator;
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfiguration {

    @Autowired
    DataSource dataSource;

    @Autowired
    ApplicationContext ctx;
    /*@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:process-engine;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }*/

    @Bean
    public Logger logger(){
        return LoggerFactory.getLogger(CamundaFirsttouchApplication.class);
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public ProgressLoggingExecutionListener getLIstener(){
        return new ProgressLoggingExecutionListener();
    }

    @Bean
    public SpringProcessEngineConfiguration engineConfiguration(DataSource dataSource, PlatformTransactionManager transactionManager) {
        SpringProcessEngineConfiguration configuration = new SpringProcessEngineConfiguration();
        configuration.setDataSource(dataSource);
        configuration.setTransactionManager(transactionManager);
        configuration.setDatabaseSchemaUpdate("true");
        configuration.setJobExecutorActivate(false);
        configuration.setEnableExceptionsAfterUnhandledBpmnError(true);
        configuration.setHistory(ProcessEngineConfiguration.HISTORY_FULL);
        configuration.setHistoryLevel(HistoryLevel.HISTORY_LEVEL_FULL);
        configuration.setEnableExceptionsAfterUnhandledBpmnError(true);
        configuration.setIdGenerator(new StrongUuidGenerator());
        configuration.setCreateIncidentOnFailedJobEnabled(true);
        return configuration;
    }
}
