package com.example.android.delhiguide;

/**
 * Created by Hritik on 06-05-2017.
 */

public class Place {

    private static final int NO_IMAGE = -1;

    private int mName;

    private int mAddress;

    private int mImageResourceId = NO_IMAGE;

    private double mReview;

    private int mdescription;

    public Place(int name, int address, int desc , int image , double review) {
        mName = name;
        mAddress = address;
        mImageResourceId = image;
        mReview = review;
        mdescription = desc;
    }

    public Place(int name, int address, int desc, double review) {
        mName = name;
        mAddress = address;
        mReview = review;
        mdescription = desc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public float getReview() {
        return (float)mReview;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getName() {
        return mName;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

    public int getDescription()
    {
        return mdescription;
    }
}
