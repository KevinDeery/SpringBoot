package com.pluralsight.sprongbootweb.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrganizerRepository {

    private final List<Organizer>  organizers = List.of(
            new Organizer(101, "Globalmantics", "Globalmantics Techniology Corporation"),
            new Organizer(102, "Carved rock", "GCarved Rock Sports Equipmnet")
    );

    public Optional<Organizer> findById(int id) {
        return organizers.stream().filter(organizer -> organizer.id() == id).findAny();
    }

    public List<Organizer> findAll(){
        return organizers;
    }
}
