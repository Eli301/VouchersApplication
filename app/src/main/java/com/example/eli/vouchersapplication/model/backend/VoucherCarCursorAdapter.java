package com.example.eli.vouchersapplication.model.backend;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.eli.vouchersapplication.R;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

import static android.R.attr.path;

/**
 * Created by eli on 07/08/2019.
 */

public class VoucherCarCursorAdapter extends CursorAdapter {
    private LayoutInflater cursorInflater;
    public VoucherCarCursorAdapter(Context context, Cursor c) {
        super(context, c, 0);
        cursorInflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
    }
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return cursorInflater.inflate(R.layout.one_voucher, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView titelStitel = (TextView) view.findViewById(R.id.titel_Stitel);
        String strContent = cursor.getString(cursor.getColumnIndex("Title"));
        strContent += "  ";
        strContent +=  cursor.getString(cursor.getColumnIndex("STitle"));
        titelStitel.setText(strContent);



        File imgFile = new File(String.valueOf(R.drawable.defva));
        ImageView imageCar = (ImageView)view.findViewById(R.id.voucherImage);
        if(imgFile.exists())
        {
            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            ImageView imageView=(ImageView)view.findViewById(R.id.voucherImage);
            imageView.setImageBitmap(myBitmap);
        }

//        GlideApp.with(context)
//                .load(cursor.getString(cursor.getColumnIndexOrThrow( "Imag")))
//                .centerCrop()
//                .placeholder(R.drawable.default_car)
//                .into(voucherImage);
    }
}
