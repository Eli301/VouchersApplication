package com.example.eli.vouchersapplication.model.backend;

import android.database.Cursor;

/**
 * Created by eli on 07/08/2019.
 */

public interface DB_manager {
    Cursor getvoucher(int id) throws Exception;
    Cursor getAllgetvouchers();
    Cursor getAllgetvouchersBycategory(int category);
}
