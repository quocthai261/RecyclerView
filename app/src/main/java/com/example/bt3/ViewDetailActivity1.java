package com.example.bt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewDetailActivity1 extends AppCompatActivity {
    ImageView imageView;
    TextView title;
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_detail1);

        imageView = findViewById(R.id.imageView2);
        description = findViewById(R.id.txtDes);
        title = findViewById(R.id.txtTitleBlog);

        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        imageView.setImageResource(intent.getIntExtra("imageSource", 0));
        description.setText(intent.getStringExtra("description"));
    }
}
