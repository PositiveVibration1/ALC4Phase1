package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button about_alc;
    public Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about_alc=(Button)findViewById(R.id.about_alc);
        profile=(Button)findViewById(R.id.profile);
    }

    public void about_alc(View View){
        Intent ALCIntent=new Intent(MainActivity.this,about_alc.class);
        startActivity(ALCIntent);
    }

    public void profile(View View){
        Intent MyProfile=new Intent(MainActivity.this,my_profile.class);
        startActivity(MyProfile);
    }
}
