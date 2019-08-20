/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.delegate.AccountInfo
 *
 * @Project:  camunda-firsttouch
 * @Author:   RashadKh
 * @Created:  8/9/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.joda.time.LocalDateTime;

public class AccountInfo implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.err.println("Start Account Info fetching" + LocalDateTime.now());
        execution.setVariable("currency", "AZN");
        execution.setVariable("balance", 0);
        execution.setVariable("blockamount", 0);
        execution.setVariable("credit", true);
        execution.setVariable("eyesColor" , "red" );
    }
}
