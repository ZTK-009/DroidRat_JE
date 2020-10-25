package com.je_chen.droidrat_je.appintent.call;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.CallLog;
import android.provider.Telephony;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallLogs {

    private Context context;
    private ContentResolver contentResolver;

    public CallLogs(Context context){
        this.context = context;
        contentResolver = context.getContentResolver();
    }

    public List<String> getCallLogs() {
        Cursor c = contentResolver.query(CallLog.Calls.CONTENT_URI, null, null, null, null);
        List<String> callLogList = new ArrayList<>();
        if (c != null) {
            while (c.moveToNext()) {
                String callDate = c.getString(c.getColumnIndexOrThrow(CallLog.Calls.DATE));
                String phNumber = c.getString(c.getColumnIndexOrThrow(CallLog.Calls.NUMBER));
                String callDuration = c.getString(c.getColumnIndexOrThrow(CallLog.Calls.DURATION));
                Date dateFormat= new Date(Long.parseLong(callDate));
                String callDayTimes = String.valueOf(dateFormat);
                String direction = null;
                switch (Integer.parseInt(c.getString(c.getColumnIndexOrThrow(CallLog.Calls.TYPE)))) {
                    case Telephony.Sms.MESSAGE_TYPE_INBOX:
                        direction = "OUTGOING";
                        break;
                    case Telephony.Sms.MESSAGE_TYPE_SENT:
                        direction = "INGOING";
                        break;
                    case Telephony.Sms.MESSAGE_TYPE_OUTBOX:
                        direction = "MISSED";
                        break;
                    default:
                        break;
                }
                callLogList.add(phNumber +"\n"+ direction +"\n"+ callDuration +"\n"+ callDayTimes);
            }
            c.close();
        }
        return callLogList;
    }
}
