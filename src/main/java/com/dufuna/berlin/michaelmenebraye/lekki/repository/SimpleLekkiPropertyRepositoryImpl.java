package com.dufuna.berlin.michaelmenebraye.lekki.repository;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// This is the implementation of the SimpleLekkiPropertyRepository interface.
// It provides concrete implementations for the methods defined in the interface.


public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {

    // A map to store LekkiProperty objects, with their propertyId as the key.
    private final Map<Integer, LekkiProperty> propertyMap;

    // Constructor initializes the propertyMap as a new HashMap.
    public SimpleLekkiPropertyRepositoryImpl() {
        this.propertyMap = new HashMap<>();
    }
    // Method for saving a LekkiProperty object to the repository.
    @Override
    public LekkiProperty save(LekkiProperty property) {
        propertyMap.put(property.getPropertyId() , property);
        return property;
    }

    // Method for finding a LekkiProperty object by its ID.
    @Override
    public LekkiProperty findById(String id) {
        return propertyMap.get(id);
    }

    // Method for retrieving a list of all LekkiProperty objects in the repository.
    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(propertyMap.values());
    }

    // Method for updating a LekkiProperty object in the repository.
    @Override
    public LekkiProperty update(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(), property);
        return null;
    }
}
