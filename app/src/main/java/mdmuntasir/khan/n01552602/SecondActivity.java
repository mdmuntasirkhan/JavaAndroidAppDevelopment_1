package mdmuntasir.khan.n01552602;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get references to the TextView and ImageView from the layout
        TextView nameDisplayTextView = findViewById(R.id.nameDisplayTextView);
        ImageView imageView = findViewById(R.id.imageView);

        // Get the full name from the intent extras
        String fullName = getIntent().getStringExtra("FULL_NAME");
        nameDisplayTextView.setText(fullName);

        // Set the image for the ImageView
        imageView.setImageResource(R.drawable.your_image); // Replace with your image resource
    }
}
