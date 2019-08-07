package com.example.eli.vouchersapplication.controller;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.eli.vouchersapplication.R;
import com.example.eli.vouchersapplication.model.backend.VoucherCarCursorAdapter;
import com.example.eli.vouchersapplication.model.datasource.DataTools;
import com.example.eli.vouchersapplication.model.entities.Voucher;

import java.util.ArrayList;


public class AllCatFragment extends  Fragment {
   protected ListView allCatListViewListView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        allCatListViewListView = (ListView)getActivity().findViewById( R.id.allCatListViewListView);
//        new AsyncTask<Void, Void, Cursor>() {
//            private ProgressDialog dialog;
//
//            @Override
//            protected void onPreExecute() {
//                dialog = new ProgressDialog(getActivity());
//                dialog.setMessage("Contacting Json, please wait ...");
//                dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
//                dialog.setCancelable(false);
//                dialog.show();
//            }
//
//            @Override
//            protected Cursor doInBackground(Void... params) {
//                try {
//                    DataTools dataTools = new DataTools();
//                    ArrayList<Voucher> voucherArrayList = dataTools.convertJsonToClass();
//                    Cursor cursor = dataTools.vouchersListToCursor(voucherArrayList);
//                    return cursor;
//
//                } catch (Exception e) {
//                    return null;
//                }
//            }
//
//            @Override
//            protected void onPostExecute(Cursor cursor) {
//                super.onPostExecute(cursor);
//                dialog.dismiss();
//                if(cursor != null){
//                    //set the items in listArray
//                    allCatListViewListView.setAdapter(new VoucherCarCursorAdapter(getActivity(),cursor));
//
//                }
//            }
//
//        }.execute();
        // Inflate view
        View view = inflater.inflate(R.layout.fragment_all_cat,
                container, false);
        Toast.makeText(getActivity()," AllCatFragment to do",Toast.LENGTH_LONG).show();
        // Return view
        return view;

    }


}
