package com.neelpatel;

public class InteriorFeature implements Feature {

  private String interiorFeature;

  public  InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getFeature() {
    return this.interiorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  @Override
  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }
}
