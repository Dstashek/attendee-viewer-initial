package io.rscale.training.attendeeviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.PagedResources;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.PagedResources.PageMetadata;
import org.springframework.hateoas.Link;
import java.util.List;
import java.util.ArrayList;



@Component
public class RosterClientFallback implements RosterClient {

	@Override
	public PagedResources<Attendee> getAttendees(int page) {
		List<Attendee> attendees = new ArrayList<Attendee>();
		attendees.add(new Attendee());
		return new PagedResources<Attendee>(attendees, new PageMetadata(1, 1, 1, 1), new Link("/"));
	}

	@Override
	public Attendee getAttendee(String attendeeId) {
		return new Attendee();
	}

}