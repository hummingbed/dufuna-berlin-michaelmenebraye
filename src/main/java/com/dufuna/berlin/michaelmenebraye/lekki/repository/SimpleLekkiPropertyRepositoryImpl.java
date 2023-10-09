package com.dufuna.berlin.michaelmenebraye.lekki.repository;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {

    private final Map<String, LekkiProperty> propertyMap;

    public SimpleLekkiPropertyRepositoryImpl() {
        this.propertyMap = new HashMap<>();
    }

    @Override
    public LekkiProperty save(LekkiProperty property) {
        propertyMap.put(property.getPropertyId() , property);
        return property;
    }

    @Override
    public LekkiProperty findById(String id) {
        return propertyMap.get(id);
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(propertyMap.values());
    }

    @Override
    public LekkiProperty update(LekkiProperty property) {
        propertyMap.put(property.getPropertyId(), property);
        return property;
    }
}
