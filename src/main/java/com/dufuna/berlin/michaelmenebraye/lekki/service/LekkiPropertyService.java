package com.dufuna.berlin.michaelmenebraye.lekki.service;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.List;

// This is the interface for the LekkiPropertyService.
// It defines the methods that a service handling LekkiProperty objects should implement.

public interface LekkiPropertyService {
    // Method for saving a LekkiProperty object.
    void saveProperty(LekkiProperty property);

    // Method for retrieving a LekkiProperty object by its ID.
    LekkiProperty getPropertyById(String id);

    // Method for retrieving a list of all LekkiProperty objects.
    List<LekkiProperty> getProperties();

    // Method for retrieving a single LekkiProperty object.
    LekkiProperty getProperty();
}
