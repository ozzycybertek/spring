package com.cybertek.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

@Component
public class Java implements Course {
	
	private ExtraSessions extraSessions;
	
	@Autowired
	public Java(ExtraSessions extraSessions) {
		this.extraSessions = extraSessions;
	}

	@Override
	public void getTeachingHours() {
		System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));
	}

}




