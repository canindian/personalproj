package com.neelpatel;

public class ExteriorFeature implements Feature {
  private String exteriorFeature;

  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }

  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }
}
