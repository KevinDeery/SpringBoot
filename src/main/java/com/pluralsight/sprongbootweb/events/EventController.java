package com.pluralsight.sprongbootweb.events;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EventController {

    private final OrganizerRepository organizerRepository;
    private final EventRepository eventRepository;
    private final ProductRepository productRepository;

    public EventController(OrganizerRepository organizerRepository,
                           EventRepository eventRepository,
                           ProductRepository productRepository
    ) {
        this.organizerRepository = organizerRepository;
        this.eventRepository = eventRepository;
        this.productRepository = productRepository;
    }

    //@RequestMapping(method = RequestMethod.GET, path="/organizers")
    @RequestMapping(path="/organizers") // Defaults to GET method
    public List<Organizer> getOrganizers() {
        return organizerRepository.findAll();
    }

    @RequestMapping(path="/events") // Path to method with request parameter  /evernts?organizerId=101
    public List<Event> getEventsByOrganizer(@RequestParam("organizerId") int organizationId){
        return eventRepository.findByOrganiztionId(organizationId);
    }

    @RequestMapping(path="/events/{id}") // specify full path, input parameter uses path to get the variable
    public Event getEventById(@PathVariable("id") int eventId){
        return eventRepository.findById(eventId).get();
    }

    @RequestMapping(path="/produ")
    public List<Product> getProductsByEvent(@RequestParam("organizerId") int eventId){
        return productRepository.findByEventId(eventId);
    }
}
