package com.je_chen.droidrat_je.appintent.call;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class Call {

    public void call(Context context,String phoneNumber){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneNumber));
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
