package com.coderbd.clickbank;

public class Product {
    private String currency;
    private String language;
    private double price;
    private String site;
    private String title;
    private String categories;
    private String deliveryMethod;
    private String deliverySpeed;
    private String description;
    private String digital;
    private int duration;
    private String frequency;
    private String pitchPage;
    private double rebillCommission;
    private double rebillPrice;
    private String shippingProfile;
    private String thankYouPage;
    private int trialPeriod;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliverySpeed() {
        return deliverySpeed;
    }

    public void setDeliverySpeed(String deliverySpeed) {
        this.deliverySpeed = deliverySpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDigital() {
        return digital;
    }

    public void setDigital(String digital) {
        this.digital = digital;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getPitchPage() {
        return pitchPage;
    }

    public void setPitchPage(String pitchPage) {
        this.pitchPage = pitchPage;
    }

    public double getRebillCommission() {
        return rebillCommission;
    }

    public void setRebillCommission(double rebillCommission) {
        this.rebillCommission = rebillCommission;
    }

    public double getRebillPrice() {
        return rebillPrice;
    }

    public void setRebillPrice(double rebillPrice) {
        this.rebillPrice = rebillPrice;
    }

    public String getShippingProfile() {
        return shippingProfile;
    }

    public void setShippingProfile(String shippingProfile) {
        this.shippingProfile = shippingProfile;
    }

    public String getThankYouPage() {
        return thankYouPage;
    }

    public void setThankYouPage(String thankYouPage) {
        this.thankYouPage = thankYouPage;
    }

    public int getTrialPeriod() {
        return trialPeriod;
    }

    public void setTrialPeriod(int trialPeriod) {
        this.trialPeriod = trialPeriod;
    }

    @Override
    public String toString() {
        return "Product{" +
                "currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", site='" + site + '\'' +
                ", title='" + title + '\'' +
                ", categories='" + categories + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                ", deliverySpeed='" + deliverySpeed + '\'' +
                ", description='" + description + '\'' +
                ", digital='" + digital + '\'' +
                ", duration=" + duration +
                ", frequency='" + frequency + '\'' +
                ", pitchPage='" + pitchPage + '\'' +
                ", rebillCommission=" + rebillCommission +
                ", rebillPrice=" + rebillPrice +
                ", shippingProfile='" + shippingProfile + '\'' +
                ", thankYouPage='" + thankYouPage + '\'' +
                ", trialPeriod=" + trialPeriod +
                '}';
    }
}
