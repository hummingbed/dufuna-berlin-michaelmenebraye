package com.dufuna.berlin.michaelmenebraye.lekki.service;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {
    void saveProperty(LekkiProperty property);

    LekkiProperty getPropertyById(String id);

    List<LekkiProperty> getProperties();

    LekkiProperty getProperty();
}
