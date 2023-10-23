import com.dufuna.berlin.michaelmenebraye.lekki.model.LekkiProperty;
import com.dufuna.berlin.michaelmenebraye.lekki.service.MockLekkiPropertyService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MockLekkiPropertyAppTest {
    @Test
    public void testPropertyCreationAndRetrieval() {
        MockLekkiPropertyService propertyService = new MockLekkiPropertyService();

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

            propertyService.saveProperty(property);
        }

        LekkiProperty retrievedProperty = propertyService.getPropertyById(Integer.toString(1));
        assertNotNull(retrievedProperty);
        assertEquals("Lekki phase 1 Street", retrievedProperty.getAddress());
        assertEquals("bungalow", retrievedProperty.getPropertyType());
        assertEquals(3, retrievedProperty.getNumBedrooms());
        assertEquals(2, retrievedProperty.getNumSittingRooms());
        assertEquals(1, retrievedProperty.getNumKitchens());
        assertEquals(2, retrievedProperty.getNumBathrooms());
        assertEquals(3, retrievedProperty.getNumToilets());
        assertEquals("james brown", retrievedProperty.getPropertyOwner());
        assertEquals("A beautiful 3 bedroom bungalow in Lekki", retrievedProperty.getDescription());
        assertEquals("2023-10-01", retrievedProperty.getValidFrom());
        assertEquals("2023-12-31", retrievedProperty.getValidTo());
    }
}
