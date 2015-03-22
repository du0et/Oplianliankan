package com.duet.oplianliankan.view;

/**
 * Created by Amber on 2015/3/22.
 */
public class Piece {
    //保存方块对象所对应的图片
    private PieceImage image;
    //该方块左上角的x坐标
    private int beginX;
    //该方块左上角的y坐标
    private int beginY;
    //该对象在Piece[][]数组中第一维的索引值
    private int indexX;
    //该对象在Piece[][]数值中第二维德索引值
    private int indexY;
    public Piece(int indexX,int indexY)
    {
        this.indexX=indexX;
        this.indexY=indexY;
    }
    public int getBeginX()
    {
        return beginX;
    }
    public void setBeginX(int beginX)
    {
        this.beginX=beginX;
    }
    public int getBeginY()
    {
        return beginY;
    }

    public void setBeginY(int beginY)
    {
        this.beginY = beginY;
    }

    public int getIndexX()
    {
        return indexX;
    }

    public void setIndexX(int indexX)
    {
        this.indexX = indexX;
    }

    public int getIndexY()
    {
        return indexY;
    }

    public void setIndexY(int indexY)
    {
        this.indexY = indexY;
    }


    public PieceImage getImage()
    {
        return image;
    }

    public void setImage(PieceImage image)
    {
        this.image = image;
    }

    public boolean isSameImage(Piece other)
    {
        if (image==null)
        {
            if (other.image!=null)
                return false;
        }
        return image.getImageId()==other.image.getImageId();
    }




}
