package com.duet.oplianliankan.view;

import android.graphics.Bitmap;

/**
 * Created by Amber on 2015/3/22.
 */
public class PieceImage {
    private Bitmap image;
    private int imageID;
    public PieceImage(Bitmap image,int imageID)
    {
        super();
        this.image=image;
        this.imageID=imageID;
    }
    public Bitmap getImage()
    {
        return image;
    }
    public void setImage(Bitmap image)
    {
        this.image = image;
    }
    public int getImageId()
    {
        return imageID;
    }
    public void setImageId(int imageId)
    {
        this.imageID = imageId;
    }
}
