package com.dufuna.berlin.michaelmenebraye.lekki;

import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;
import com.dufuna.berlin.michaelmenebraye.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.michaelmenebraye.lekki.service.MockLekkiPropertyService;

import java.util.List;


/**
 *  This is the main class for running the MockLekkiPropertyApp.
 *It demonstrates the usage of MockLekkiPropertyService to save and retrieve LekkiProperty objects.
 *
 * @author michael menebraye
 *
 */

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        // Initialize an instance of MockLekkiPropertyService.

        MockLekkiPropertyService propertyService = new MockLekkiPropertyService();
        // Loop to create and save 3 LekkiProperty objects.
        for (int i = 0; i < 3; i++) {
            LekkiProperty property = new LekkiProperty();
            property.setPropertyId(1 + i);
            property.setAddress("Lekki phase " + (i + 1) + " Street");
            property.setPropertyType("bungalow");
            property.setNumBedrooms(3);
            property.setNumSittingRooms(2);
            property.setNumKitchens(1);
            property.setNumBathrooms(2);
            property.setNumToilets(3);
            property.setPropertyOwner("james brown");
            property.setDescription("A beautiful 3 bedroom bungalow in Lekki");
            property.setValidFrom("2023-10-01");
            property.setValidTo("2023-12-31");

            // Save the property.
            propertyService.saveProperty(property);
        }

        // Retrieve and print a single LekkiProperty object by ID.
        LekkiProperty retrievedProperty = propertyService.getPropertyById(Integer.toString(1));
        System.out.println("\nsingle Property:");
        System.out.println(retrievedProperty);

        // Retrieve and print all LekkiProperty objects.
        List<LekkiProperty> properties = propertyService.getProperties();
        System.out.println("\nAll Properties:");
        for (LekkiProperty property : properties) {
            System.out.println(property);
        }
    }
}
