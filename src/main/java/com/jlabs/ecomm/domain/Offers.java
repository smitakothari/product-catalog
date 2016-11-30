package com.jlabs.ecomm.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by sjain on 11/14/2016.
 */

@org.springframework.data.mongodb.core.mapping.Document(collection = "Offers")
public class Offers {

    @Id
    private Object _id;
    private String offerName;
    private String offerType;
    private double offerPercentage;

    public Offers(String offerName, String offerType, double offerPercentage) {
        this.offerName = offerName;
        this.offerType = offerType;
        this.offerPercentage = offerPercentage;
    }

    public Object get_id() {
        return _id;
    }

    public void set_id(Object _id) {
        this._id = _id;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public double getOfferPercentage() {
        return offerPercentage;
    }

    public void setOfferPercentage(double offerPercentage) {
        this.offerPercentage = offerPercentage;
    }
}
