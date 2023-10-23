package com.dufuna.berlin.michaelmenebraye.lekki.service;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.List;

// This is a mock implementation of the LekkiPropertyService interface.
// It provides a basic implementation of the service methods using a List to store LekkiProperty objects.


public class MockLekkiPropertyService implements LekkiPropertyService {

    // List to store LekkiProperty objects.
    private List<LekkiProperty> properties = new ArrayList<>();

    // Method to save a LekkiProperty object.
    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        properties.add(property);
    }

    // Method to retrieve a LekkiProperty object by its ID.
    @Override
    public LekkiProperty getPropertyById(String id) {
        int targetId = Integer.parseInt(id);
    // Loop through the list of properties to find the one with the matching ID.
        for (LekkiProperty property : properties) {
            if (property.getPropertyId() == targetId) {
                return property;
            }
        }
    // Return null if no matching property is found.
        return null;
    }

    // Method to retrieve a list of all LekkiProperty objects.
    @Override
    public List<LekkiProperty> getProperties() {
        return properties;
    }

    // Method to retrieve a single LekkiProperty object (not implemented).
    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
