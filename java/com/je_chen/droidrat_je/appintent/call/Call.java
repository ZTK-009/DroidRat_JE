package com.je_chen.droidrat_je.appintent.call;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class Call {

    public void call(Context context,String uri){
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+"+uri));
        context.startActivity(intent);
    }

}