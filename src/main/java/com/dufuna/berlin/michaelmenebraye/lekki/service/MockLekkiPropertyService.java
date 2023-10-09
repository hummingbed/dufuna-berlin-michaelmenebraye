package com.dufuna.berlin.michaelmenebraye.lekki.service;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService {

    private List<LekkiProperty> properties = new ArrayList<>();

    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        properties.add(property);
    }

    @Override
    public LekkiProperty getPropertyById(String id) {
        for (LekkiProperty property : properties) {
            if (property.getPropertyId().equals(id)) {
                return property;
            }
        }
        return null;
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return properties;
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
