package com.dufuna.berlin.michaelmenebraye.lekki.repository;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);

    LekkiProperty findById(String id);

    List<LekkiProperty> findAll();

    LekkiProperty update(LekkiProperty property);
}
