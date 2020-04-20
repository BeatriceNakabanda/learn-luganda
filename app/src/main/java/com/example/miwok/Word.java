package com.example.miwok;

class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Luganda translation for the word */
    private String mLugandaTranslation;
//    image resource id for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //audio resource for the word
    private int mAudioResourceID;

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Create a new Word object.
     */
    public Word(String defaultTranslation, String lugandaTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mLugandaTranslation = lugandaTranslation;
        mAudioResourceID = audioResourceID;
    }
    /**
     * Create a new Word object with an image resource ID.
     */
    public Word(String defaultTranslation, String lugandaTranslation, int ImageResource, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mLugandaTranslation = lugandaTranslation;
        mImageResourceId = ImageResource;
        mAudioResourceID = audioResourceID;
    }
    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the luganda translation of the word.
     */
    public String getLugandaTranslation() {
        return mLugandaTranslation;
    }

//    return image id of the word
    public int getmImageResourceId(){
        return mImageResourceId;
    }

    //returns whether or not there is an image for this word
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    //return audio resource id for the word
    public int getmAudioResourceID(){ return mAudioResourceID; }
}
