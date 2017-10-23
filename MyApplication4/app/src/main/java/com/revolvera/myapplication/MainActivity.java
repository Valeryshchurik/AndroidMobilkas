package com.revolvera.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickQuit(View v){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                System.exit(0);
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) { }
        }).setMessage(R.string.quit_question);
        alertDialogBuilder.create().show();
    }

    public void onClickLoadGame(View v) {
        Intent intent = new Intent(this, MyActivity.class);
        intent.putExtra("loadMode", true);
        startActivity(intent);
    }

    //public void onClickNewGame(View v) {
    //    startActivity(new Intent(this, NewGameActivity.class));
   // }
}
