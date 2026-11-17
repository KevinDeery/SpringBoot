package com.pluralsight.sprongbootweb.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository {

    public List<Event> findByOrganiztionId(int organizationId) {
        return null;
    }

    public Optional<Event> findById(int eventId) {
        return null;
    }
    public List<Event> findAll(){
        return null;
    }
}
