/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.listener.SendEventListenerPlugin
 *
 * @Project:  camunda-demo-standalone
 * @Author:   RashadKh
 * @Created:  8/16/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.listener;

import org.camunda.bpm.engine.impl.bpmn.parser.BpmnParseListener;
import org.camunda.bpm.engine.impl.cfg.AbstractProcessEnginePlugin;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class SendEventListenerPlugin  extends AbstractProcessEnginePlugin {

    @Override
    public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
        System.err.println("PreInit");
        if (processEngineConfiguration.getCustomPostBPMNParseListeners() == null) {
            processEngineConfiguration.setCustomPostBPMNParseListeners(new ArrayList<BpmnParseListener>());
        }
        processEngineConfiguration.getCustomPostBPMNParseListeners().add(new AddSendEventListenerToBpmnParseListener());

    }

}
