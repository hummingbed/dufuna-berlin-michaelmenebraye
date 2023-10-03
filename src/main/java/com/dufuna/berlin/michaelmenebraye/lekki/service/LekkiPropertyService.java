package com.dufuna.berlin.michaelmenebraye.lekki.service;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

public interface LekkiPropertyService {
    void saveProperty(LekkiProperty property);

    LekkiProperty getProperty();
}
