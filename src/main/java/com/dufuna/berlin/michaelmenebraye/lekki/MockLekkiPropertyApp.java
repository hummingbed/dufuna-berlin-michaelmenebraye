package com.dufuna.berlin.michaelmenebraye.lekki;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;
import com.dufuna.berlin.michaelmenebraye.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.michaelmenebraye.lekki.service.MockLekkiPropertyService;

import java.util.List;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiPropertyService propertyService = new MockLekkiPropertyService();

        // Create and save multiple LekkiProperty objects
        for (int i = 0; i < 3; i++) {
            LekkiProperty property = new LekkiProperty();
            property.setPropertyId("Lekki00" + i);
            property.setAddress("Lekki phase " + (i + 1) + " Street");
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

            propertyService.saveProperty(property);
        }

        // Get a single LekkiProperty and print it
        LekkiProperty retrievedProperty = propertyService.getPropertyById("Lekki001");
        System.out.println("\nsingle Property:");
        System.out.println(retrievedProperty);

        // Get multiple LekkiProperty objects and print them
        List<LekkiProperty> properties = propertyService.getProperties();
        System.out.println("\nAll Properties:");
        for (LekkiProperty property : properties) {
            System.out.println(property);
        }
    }
}
