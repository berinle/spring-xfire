package com.jrock.springxfire.cli;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

import com.jrock.springxfire.model.Bar;
import com.jrock.springxfire.model.Baz;
import com.jrock.springxfire.model.Event;
import com.jrock.springxfire.model.Foo;
import com.jrock.springxfire.service.EventService;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		EventService eventService = (EventService) ctx.getBean("eventService");
		eventService.sendTestMessage("Spring XFire goodies await you!" + new Date());
		
		Event event = new Event();
		event.setType("SOME TYPE");
		Foo foo = new Foo();
		foo.setAmt(15.15);
		foo.setCount(10);
		foo.setDate(new Date());
		
		Bar bar1 = new Bar();
		bar1.setAttr("bar1");
		
		Bar bar2 = new Bar();
		bar2.setAttr("bar2");
		
		foo.getBars().add(bar1);
		foo.getBars().add(bar2);
		
		Baz baz = new Baz();
		baz.setName("BAZRUS");
		
		event.setBaz(baz);
		event.setFoo(foo);
		
		eventService.sendEvent(event);
		
		System.out.println("****** Done invoking WS calls ********");
		
	}
}
