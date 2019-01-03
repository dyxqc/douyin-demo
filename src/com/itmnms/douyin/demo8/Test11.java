package com.itmnms.douyin.demo8;

public class Test11 {

    public static void main(String[] args) {

    }

    public static double distance(double oneLon, double oneLat, double anOtherLon, double anOtherLat) {
        double radLat1 = rad(oneLat);
        double radLat2 = rad(anOtherLat);
        double a = radLat1 - radLat2;
        double b = rad(oneLon) - rad(anOtherLon);
        double distanceValue = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        distanceValue = distanceValue * EARTH_RADIUS;
        distanceValue = Math.round(distanceValue * 10000d) / 10000d;
        return distanceValue;
    }

    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

}
