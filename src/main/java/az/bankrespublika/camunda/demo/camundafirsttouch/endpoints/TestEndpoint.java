/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.endpoints.TestEndpoint
 *
 * @Project:  camunda-firsttouch
 * @Author:   RashadKh
 * @Created:  8/8/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.endpoints;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineException;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.history.HistoricProcessInstance;
import org.camunda.bpm.engine.impl.persistence.entity.HistoricVariableInstanceEntity;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;

@RestController
public class TestEndpoint{
    @Autowired
    ProcessEngine processEngine;

    @Autowired
    ApplicationContext context;

    @GetMapping(path = "x")
    public String test(){
        /*
        ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey("account_close_flow");

        HistoricVariableInstanceEntity variable = (HistoricVariableInstanceEntity) processEngine.getHistoryService()
                .createHistoricVariableInstanceQuery()
                .processInstanceId(processInstance.getId())
                .variableName("globalError").singleResult();


        if(variable != null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, processInstance.getId() +" "+variable.getTextValue());
        */

        ProcessInstanceWithVariables instanceWithVariables =  processEngine.getRuntimeService()
                                                                            .createProcessInstanceByKey("account_close_flow")
                                                                            .executeWithVariablesInReturn();

        String variable = instanceWithVariables.getVariables().getValue("globalError", String.class);

        if(variable != null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, instanceWithVariables.getId() +" "+variable);

        return "hi";
    }
}
