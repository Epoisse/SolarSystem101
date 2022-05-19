package com.syntax;

public class Main {

    public static void main(String[] args) {
	SolarSystem factoX=new SolarSystem();
        factoX.moon = "4";
        factoX.planet = "2";
        factoX.stars = "10000";
        factoX.sun = "1";

        // adding features to our sun
        FeatureSun xFact = new FeatureSun();
        xFact.color = "green";
        xFact.radius = "10000000";
        xFact.heat = "89485720807245";

        // adding the features for star in the solar system
        FeatureStars facX=new FeatureStars();
        facX.color = "green";
        facX.radius = "428572845km";
        facX.size = "345435";

        // adding features for planet 2
        Planet2 oslo = new Planet2();
        oslo.color = "red";
        oslo.size = "245425cm";
        oslo.name = "Some";
    }
}
