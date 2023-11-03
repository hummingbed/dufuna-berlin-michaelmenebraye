package com.dufuna.berlin.michaelmenebraye.lekki.model;

/**
 *  This class represents a model for Lekki Properties. It contains various attributes that
 *define a property, such as propertyId, address, property type, number of rooms, etc.
 *
 * @author michael menebraye
 *
 */

public class LekkiProperty {
    int propertyId;
    String address;
    String propertyType;
    int numBedrooms;
    int numSittingRooms;
    int numKitchens;
    int numBathrooms;
    int numToilets;
    String propertyOwner;
    String description;
    String validFrom;
    String validTo;

    // Getter method for retrieving the property ID.

    public int getPropertyId() {
        return propertyId;
    }

    // Setter method for setting the property ID.
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    // getter method for getting the property address.
    public String getAddress() {
        return address;
    }

    // Setter method for setting the property address.
    public void setAddress(String address) {
        this.address = address;
    }

    // Getters method for getting the property type.
    public String getPropertyType() {
        return propertyType;
    }

    // Setter method for setting the property type.address
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    // getter method for getting the no of bedrooms.
    public int getNumBedrooms() {
        return numBedrooms;
    }

    // Setter method for setting the no of bedrooms.
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }
    // getter method for getting the no. of sitting rooms.
    public int getNumSittingRooms() {
        return numSittingRooms;
    }

    // Setter method for setting the no. of sitting rooms
    public void setNumSittingRooms(int numSittingRooms) {
        this.numSittingRooms = numSittingRooms;
    }

    // getter method for getting the no. of Kitchens.
    public int getNumKitchens() {
        return numKitchens;
    }

    // Setter method for setting the no. of Kitchens.
    public void setNumKitchens(int numKitchens) {
        this.numKitchens = numKitchens;
    }

    // getter method for getting the no. of Bathrooms.
    public int getNumBathrooms() {
        return numBathrooms;
    }

    // setter method for setting the no. of Bathrooms.
    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    // getter method for getting the no. of Toilets.
    public int getNumToilets() {
        return numToilets;
    }

    // setter method for setting the no. of Toilets.
    public void setNumToilets(int numToilets) {
        this.numToilets = numToilets;
    }

    // getter method for getting the PropertyOwner.
    public String getPropertyOwner() {
        return propertyOwner;
    }

    // setter method for setting the PropertyOwner.
    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    // getter method to getDescription
    public String getDescription() {
        return description;
    }

    // setter method to setDescription
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter method for get date

    public String getValidFrom() {
        return validFrom;
    }

    // Setter method for setting date

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    // Getter method for getting date
    public String getValidTo() {
        return validTo;
    }

    // Setter method for setting date

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }


    // string representation of the Lekki Property.
    @Override
    public String toString() {
        return propertyId + ", " + address + ", " + propertyType + ", " + numBedrooms
                + ", " + numSittingRooms + ", " + numKitchens + ", " + numBathrooms
                + ", " + numToilets + ", " + propertyOwner + ", " + description
                + ", " + validFrom + ", " + validTo;
    }
    // equals method for comparing two LekkiProperty objects.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekkiProperty that = (LekkiProperty) o;
        return Integer.valueOf(propertyId).equals(that.propertyId);
    }

    // hashCode method to generate a unique hash code for this object.

    @Override
    public int hashCode() {
        return Integer.valueOf(propertyId).hashCode();
    }
}
