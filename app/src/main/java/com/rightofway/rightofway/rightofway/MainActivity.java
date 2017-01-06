package com.rightofway.rightofway.rightofway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Safety Warning
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("This app is for reference purposes only. Please consult your local, state, or country driving laws.");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"Accept",
                new DialogInterface.OnClickListener()
                {public void onClick (DialogInterface dialog,int which){
                    dialog.dismiss();
                }
                });
        alertDialog.show();
    }
}
