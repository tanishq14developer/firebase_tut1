package com.example.firebase_tut1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2,t3,t4;
    DataHolder dataHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void process(View view){
        t1 = findViewById(R.id.edittext);
        t2 = findViewById(R.id.edittext1);
        t3 = findViewById(R.id.edittext2);
        t4 = findViewById(R.id.edittext3);

        String name = t1.getText().toString().trim();
        String roll = t2.getText().toString().trim();
        String course = t3.getText().toString().trim();
        String course_duration = t4.getText().toString().trim();

        dataHolder = new DataHolder(name,course,course_duration);
        FirebaseDatabase database =  FirebaseDatabase.getInstance();
        DatabaseReference node = database.getReference("students");
        node.child(roll).setValue(dataHolder);
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        Toast.makeText(getApplicationContext(),"Values Inserted",Toast.LENGTH_LONG).show();
    }
}