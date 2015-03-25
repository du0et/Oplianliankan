package com.duet.oplianliankan.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.duet.oplianliankan.view.Piece;
import com.duet.oplianliankan.R;
import com.duet.oplianliankan.view.PieceImage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Amber on 2015/3/22.
 */
public class ImageUtil
{
	// ��������������ͼƬ��Դֵ(int����)
	private static List<Integer> imageValues = getImageValues();

	//��ȡ����������ͼƬ��ID��Լ������ͼƬID��p_��ͷ��
	public static List<Integer> getImageValues()
	{
		try
		{
			// �õ�R.drawable���е�����, ����ȡdrawableĿ¼�µ�����ͼƬ
			Field[] drawableFields = R.drawable.class.getFields();
			List<Integer> resourceValues = new ArrayList<Integer>();
			for (Field field : drawableFields)
			{
				// �����Field��������p_��ͷ
				if (field.getName().indexOf("p_") != -1)
				{
					resourceValues.add(field.getInt(R.drawable.class));
				}
			}
			return resourceValues;
		}
		catch (Exception e)
		{
			return null;
		}
	}

    public static List<Integer> getRandomValues(List<Integer> sourceValues,int size)
    {
        Random random=new Random();
        List<Integer> result=new ArrayList<Integer>();
        for (int i=0;i<size;i++)
        {
            try
            {
                int index=random.nextInt(sourceValues.size());
                Integer image=sourceValues.get(index);
                result.add(image);
            }
            catch (IndexOutOfBoundsException e)
            {
                return result;
            }
        }
        return result;
    }

    public static List<Integer> getPlayValues(int size)
    {
        if (size%2!=0)
        {
            size+=1;
        }
        List<Integer> playImageValues=getRandomValues(imageValues,size/2);
        playImageValues.addAll(playImageValues);
        Collections.shuffle(playImageValues);
        return playImageValues;
    }

    public static List<PieceImage> getPlayImages(Context context,int size)
    {
        List<Integer> resourceValues=getPlayValues(size);
        List<PieceImage> result=new ArrayList<PieceImage>();
        for (Integer value:resourceValues)
        {
            Bitmap bm= BitmapFactory.decodeResource(context.getResources(),value);
            PieceImage pieceImage=new PieceImage(bm,value);
            result.add(pieceImage);
        }
        return result;
    }

	// ��ȡѡ�б�ʶ��ͼƬ
	public static Bitmap getSelectImage(Context context)
	{
		Bitmap bm = BitmapFactory.decodeResource(context.getResources(),
			R.drawable.selected);
		return bm;
	}
}
