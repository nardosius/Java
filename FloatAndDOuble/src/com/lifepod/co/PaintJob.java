package com.lifepod.co;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double numberOfBuckets = Math.ceil((((width * height) / areaPerBucket) - extraBuckets));

     return (int)numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBuckets = Math.ceil(((width * height) / areaPerBucket));

        return (int)numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBuckets = Math.ceil(area / areaPerBucket);

        return (int)numberOfBuckets;
    }
}
