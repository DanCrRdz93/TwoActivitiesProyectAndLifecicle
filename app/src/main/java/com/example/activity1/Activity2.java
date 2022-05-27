package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView txt1;
    private static final String LOG_TAG = Activity2.class.getSimpleName();
    public static final String replyMessage = "";
    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        Intent intent1 = getIntent();
        String message = intent1.getStringExtra(MainActivity.newMessage);
        txt1 = findViewById(R.id.txtNew);
        txt1.setText(message);

        mReply = findViewById(R.id.editTxtReply);

    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(replyMessage, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}