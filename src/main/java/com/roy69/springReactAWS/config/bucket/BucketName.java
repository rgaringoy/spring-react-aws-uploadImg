package com.roy69.springReactAWS.config.bucket;

public enum BucketName {

    PROFILE_IMAGE("roy69-spring-react-img-upload");


    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
