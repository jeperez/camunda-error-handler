/*
 * Copyright (c) 2019.
 * For internal use only — Not for external distribution.
 * It contains proprietary and confidential information.
 * This source code is the property of Bank Respublika ©1992 - 2019.
 * If you encountered with this code on public resources, please contact with admin@bankrespublika.az
 *
 * az.bankrespublika.camunda.demo.camundafirsttouch.DelegateBeans
 *
 * @Project:  camunda-firsttouch
 * @Author:   RashadKh
 * @Created:  8/8/2019
 */

package az.bankrespublika.camunda.demo.camundafirsttouch;

import az.bankrespublika.camunda.demo.camundafirsttouch.delegate.AccountInfo;
import az.bankrespublika.camunda.demo.camundafirsttouch.delegate.CloseAccount;
import az.bankrespublika.camunda.demo.camundafirsttouch.delegate.CustomerInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DelegateBeans {

    @Bean
    public CloseAccount closeAcc(){
        return new CloseAccount();
    }

    @Bean
    public AccountInfo accountInfo(){
        return new AccountInfo();
    }

    @Bean
    public CustomerInfo customerInfo(){
        return new CustomerInfo();
    }
}
