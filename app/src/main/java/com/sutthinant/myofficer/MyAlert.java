package com.sutthinant.myofficer;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Nantha on 4/4/2560.
 */

public class MyAlert {
    //Explicit
    private Context context;
    private String titleString, messageString;

    public MyAlert(Context context,
                   String titleString,
                   String messageString) {
        this.context = context;
        this.titleString = titleString;
        this.messageString = messageString;
    }

    public  void myDialog (){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setIcon(R.drawable.doremon48);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();

    }
} //Main Class
