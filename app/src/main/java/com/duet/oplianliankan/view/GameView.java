package com.duet.oplianliankan.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import com.duet.oplianliankan.board.GameService;
import com.duet.oplianliankan.object.LinkInfo;
import com.duet.oplianliankan.util.ImageUtil;

import java.util.jar.Attributes;

/**
 * Created by Amber on 2015/3/21.
 */
public class GameView extends View {
    private GameService gameService;
    private Piece selectPiece;
    private LinkInfo linkInfo;
    private Paint paint;
    private Bitmap selectImage;
    public GameView(Context context,AttributeSet attrs)
    {
        super(context,attrs);
        this.paint=new Paint();
        //使用位图平铺作为连接线条
        this.paint.setShader(new BitmapShader(BitmapFactory.decodeResource(context.getResources(), android.R.drawable.dark_header), Shader.TileMode.REPEAT,Shader.TileMode.REPEAT));
        // 设置连接线的颜色
        this.paint.setColor(Color.RED);
        // 设置连接线的粗细
        this.paint.setStrokeWidth(3);
        this.selectImage = ImageUtil.getSelectImage(context);
    }
    public void setLinkInfo(LinkInfo linkInfo)
    {
        this.linkInfo=linkInfo;
    }
    public  void setGameService(GameService gameService)
    {
        this.gameService=gameService;
    }


}
