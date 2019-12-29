package com.ericliu.spring.listerner;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: liuhaoeric
 * Create time: 2019/12/29
 * Description:
 */
public class CoustomEvent extends ApplicationEvent {
	private String name;
	private String eventType;
	private String summary;

	public CoustomEvent(Object source, String name, String eventType, String summary) {
		this(source);
		this.name = name;
		this.eventType = eventType;
		this.summary = summary;
	}

	public CoustomEvent(Object source) {
		super(source);
	}

	public String getName() {
		return name;
	}

	public String getEventType() {
		return eventType;
	}

	public String getSummary() {
		return summary;
	}

	public Object getObject() {
		return this.source;
	}


	@Override
	public String toString() {
		return "CoustomEvent{" +
				"name='" + name + '\'' +
				", eventType='" + eventType + '\'' +
				", summary='" + summary + '\'' +
				'}';
	}
}
