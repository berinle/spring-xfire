package com.jrock.springxfire.service;


import org.apache.log4j.Logger;

import com.jrock.springxfire.model.Event;

public class EventServiceImpl implements EventService {

	private static final Logger log = Logger.getLogger(EventService.class);
	
	public void sendEvent(Event event) {
		log.debug("got message: " + event.toString());
	}

	public void sendTestMessage(String message) {
		log.debug("got test message: " + message);
	}

}
