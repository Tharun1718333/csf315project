package com.example.csf315projecttest1;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.LocaleList;
import android.speech.RecognizerIntent;
import android.speech.RecognizerResultsIntent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.ClipboardManager;
import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
 TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputText = (TextView) findViewById(R.id.txt_output);
    }

    public void btnspeech(View view) {
        Locale locale;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            locale = (Locale.forLanguageTag("hin"));
        } else {
            locale = (new Locale("hin"));
        }

        String languagePref = "hi";
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, languagePref);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, languagePref);
        intent.putExtra(RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE, languagePref);
        try {
            startActivityForResult(intent,1);
        }
        catch (ActivityNotFoundException e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
    public void opengoogleassist(View view) {
        startActivity(new Intent(Intent.ACTION_VOICE_COMMAND).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }
    public void go_to_call_list(View view) {
        Intent intent = new Intent(this,phone_form.class);
        startActivity(intent);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        switch (requestCode)
        {
            case 1:

                if(resultCode == RESULT_OK && null != data)
                {
                    ArrayList<String> result =
                            data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text_to_be_copied = result.get(0);
                    outputText.setText(text_to_be_copied);
                    ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("Edit text",text_to_be_copied);
                    clipboard.setPrimaryClip(clip);
                    Toast.makeText(this,"✔",Toast.LENGTH_SHORT).show();
                    //String queryString = "How is the weather today?";

                    //startActivity(intent);
                }
                break;

        }
    }


}