package com.tibco.exchange.tibreview.processor;

import com.tibco.exchange.tibreview.engine.Context;
import com.tibco.exchange.tibreview.exception.ProcessorException;
import com.tibco.exchange.tibreview.view.TIBProcess;

public class JavaProcessor implements Processable {

	@Override
	public boolean process(Context context, TIBProcess process, Object impl) throws ProcessorException {
		//TODO Java processor
		return false;
	}

}
