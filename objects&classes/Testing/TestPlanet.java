// ignore this file

import java.util.Date;

public class TestPlanet {
  Date date = new Date(1846, 9, 23); // September 23, 1846
  Planet planet = new Planet(102.43e24, "Neptune", date);
  date.setYear(2022);
  System.out.println(planet.getDateOfDiscovery().toString());
}

class Planet {
  private double mass; // in kg
  private String name;
  private Date dateOfDiscovery;

  public Planet(double mass, String name, Date dateOfDiscovery) {
    this.mass = mass;
    this.name = name;
    this.dateOfDiscovery = dateOfDiscovery;
  }

  public double getMass() { return mass; }
  public String getName() { return name; }
  public Date getDateOfDiscovery() { return dateDiscovered; }
}