package com.example.eli.vouchersapplication.model.datasource;
import android.database.Cursor;
import android.database.MatrixCursor;

import java.util.ArrayList;
import org.json.*;
import java.io.*;
import java.util.List;

import com.example.eli.vouchersapplication.model.entities.*;
import com.example.eli.vouchersapplication.model.backend.*;
/**
 * Created by eli on 07/08/2019.
 */

public class DataTools  {

    public  ArrayList<Voucher> convertJsonToClass() {

        ArrayList<Voucher> vouchersList=new ArrayList<Voucher>();
        try {
            JSONObject obj = new JSONObject(printJson("jsonObject.json"));
            JSONObject jsonChildObject = (JSONObject)obj.get("DataObject");

            JSONArray jsonVouchers = jsonChildObject.getJSONArray("DataListObject ");

            for (int i = 0; i < jsonVouchers.length(); i++) {

                Voucher voucher = new Voucher();

                voucher.setCatId(jsonVouchers.getJSONObject(i).getInt("CatId"));
                voucher.setTitle(jsonVouchers.getJSONObject(i).getString("Title"));
                voucher.setsTitle(jsonVouchers.getJSONObject(i).getString("STitle"));
                voucher.setImag(jsonVouchers.getJSONObject(i).getString("Imag"));
                voucher.setId(jsonVouchers.getJSONObject(i).getInt("Id"));
                JSONArray DataListAddr = jsonVouchers.getJSONObject(i).getJSONArray("DataListAddr");
                voucher.setDataListAddr(new Address(DataListAddr.getJSONObject(0).getString("Addr"),
                        DataListAddr.getJSONObject(0).getString("DAd"))
                );

                vouchersList.add(voucher);
            }
        }
        catch(Exception e){
            System.out.println("ERORR converting");
        }

        return vouchersList;
    }

    public String printJson(String file){
        String jsonString="";
        try {
            FileReader fr = new FileReader(file);
            int i;
            while ((i = fr.read()) != -1)
                jsonString+=(char) i;
            fr.close();
        }catch(Exception e){
            System.out.print("ERORR reading jeson");
        }
        return  jsonString;
    }

    public static Cursor vouchersListToCursor(ArrayList<Voucher> voucherList) {

        String[] columns = new String[]{
                "CatId",
                "Title",
                "STitle",
                "Imag",
                "Id"
        };

        MatrixCursor matrixCursor = new MatrixCursor(columns);

        for (Voucher v : voucherList) {
            matrixCursor.addRow(new Object[]{
                    v.getCatId(),
                    v.getTitle(),
                    v.getsTitle(),
                    v.getImag(),
                    v.getId()
            });
        }

        return matrixCursor;
    }


}
