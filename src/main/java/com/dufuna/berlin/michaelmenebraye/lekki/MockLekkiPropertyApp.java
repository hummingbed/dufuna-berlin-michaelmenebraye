package com.dufuna.berlin.michaelmenebraye.lekki;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;
import com.dufuna.berlin.michaelmenebraye.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.michaelmenebraye.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiProperty property = new LekkiProperty();
        property.setPropertyId(1);
        property.setAddress("Lekki phase 1 Street");
        property.setPropertyType("bungalow");
        property.setNumBedrooms(3);
        property.setNumSittingRooms(2);
        property.setNumKitchens(1);
        property.setNumBathrooms(2);
        property.setNumToilets(3);
        property.setPropertyOwner("james brown");
        property.setDescription("A beautiful house in 3 bedroom bungalow in Lekki");
        property.setValidFrom("2023-10-01");
        property.setValidTo("2023-12-31");

        LekkiPropertyService propertyService = new MockLekkiPropertyService();

        propertyService.saveProperty(property);

        LekkiProperty retrievedProperty = propertyService.getProperty();
    }
}
