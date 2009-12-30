package com.jrock.springxfire.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.jrock.springxfire.model.Event;

public class EventServiceImpl implements EventService {

	private static final Logger log = Logger.global.getLogger(EventServiceImpl.class.getName());
	
	public void sendEvent(Event event) {
		log.log(Level.FINE, "got message: " + event.toString());
	}

	public void sendTestMessage(String message) {
		log.log(Level.FINE, "got test message: " + message);
	}

}
