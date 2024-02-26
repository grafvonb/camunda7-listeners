package org.dzbank.zielbildbpm.camunda7listeners;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SaveInDatabaseStableStartListener implements ExecutionListener {

    private static final Logger logger = LoggerFactory.getLogger(SaveInDatabaseStableStartListener.class);

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        logger.info("Execution listener caught the instance: {}", execution.getProcessInstanceId());
    }
}
