package com.jrock.springxfire.service;

import com.jrock.springxfire.model.Event.Event;

public interface EventService {

	void sendTestMessage(String message);
	void sendEvent(Event event);
}
