package com.example.csf315projecttest1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class phone_form extends AppCompatActivity {
private static final int request_call = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_form);
    }

    public void call_cricket(View view) {
        if(ContextCompat.checkSelfPermission(phone_form.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(phone_form.this,new String[] {Manifest.permission.CALL_PHONE},request_call);
            String dial = "tel:" + "18002082030";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
        else
        {
            String dial = "tel:" + "18002082030";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    public void call_fire_truck(View view) {
        if(ContextCompat.checkSelfPermission(phone_form.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(phone_form.this,new String[] {Manifest.permission.CALL_PHONE},request_call);
            String dial = "tel:" + "101";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
        else
        {
            String dial = "tel:" + "101";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    public void call_ambulance(View view) {
        if(ContextCompat.checkSelfPermission(phone_form.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(phone_form.this,new String[] {Manifest.permission.CALL_PHONE},request_call);
            String dial = "tel:" + "108";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
        else
        {
            String dial = "tel:" + "108";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    public void call_cops(View view) {
        if(ContextCompat.checkSelfPermission(phone_form.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(phone_form.this,new String[] {Manifest.permission.CALL_PHONE},request_call);
            String dial = "tel:" + "100";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
        else
        {
            String dial = "tel:" + "100";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    public void call_elections_helpline(View view) {
        if(ContextCompat.checkSelfPermission(phone_form.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(phone_form.this,new String[] {Manifest.permission.CALL_PHONE},request_call);
            String dial = "tel:" + "1950";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
        else
        {
            String dial = "tel:" + "1950";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    public void call_weather(View view) {
        if(ContextCompat.checkSelfPermission(phone_form.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(phone_form.this,new String[] {Manifest.permission.CALL_PHONE},request_call);
            String dial = "tel:" + "18001801717";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
        else
        {
            String dial = "tel:" + "18001801717";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }


}