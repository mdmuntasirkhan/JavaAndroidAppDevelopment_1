package mdmuntasir.khan.n01552602;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the TextView and Button from the layout
        TextView nameTextView = findViewById(R.id.nameTextView);
        Button submitButton = findViewById(R.id.submitButton);

        // Set a click listener for the submit button
        submitButton.setOnClickListener(v -> {
            String fullName = getString(R.string.your_full_name);

            // i. Display a toast
            Toast.makeText(this, fullName, Toast.LENGTH_SHORT).show();

            // ii. Display a second screen
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("FULL_NAME", fullName);

            // Start the second activity
            startActivity(intent);
        });
    }
}