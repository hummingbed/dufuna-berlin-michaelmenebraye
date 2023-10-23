package com.dufuna.berlin.michaelmenebraye.lekki.repository;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.List;

// This is an interface for interacting with the repository of LekkiProperty objects.
// It defines a set of methods that can be used to perform CRUD operations on LekkiProperty objects.

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);  // Method for saving a LekkiProperty object to the repository

    LekkiProperty findById(String id); // Method for finding a LekkiProperty object by its ID.

    List<LekkiProperty> findAll(); // Method for retrieving a list of all LekkiProperty objects in the repository.

    LekkiProperty update(LekkiProperty property);  // Method for updating a LekkiProperty object in the repository.
}
