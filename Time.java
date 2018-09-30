package ecms;

import java.time.Duration;
import java.time.Instant;

public class Time {

	public static void main(String[] args) {
		String xmlDateTime = "2007-12-03T10:15:30.00Z";
		Instant time = parseToInstant(xmlDateTime);
		System.out.println("Time: "+ time);

		String xmlDuration = "PT20.345S";
		addXMLDuration(xmlDuration);		
	}

	// Convert XMLdatetimestamp to Instant
	private static Instant parseToInstant(String xmlDateTime) {
		Instant ins = Instant.parse(xmlDateTime);
		return ins;
	}
	
	// Add XML Duration to Instant
	private static void addXMLDuration(String xmlDuration) {
		Duration dur = Duration.parse(xmlDuration);
		String xmlDateTime = "2007-12-03T10:15:30.00Z";
		Instant ins = Instant.parse(xmlDateTime);
		Instant ss = ins.plus(dur);  
		String output = ss.toString();
		System.out.println("Time after add: "+output);		
	}

}
