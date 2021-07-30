package sg.edu.rp.c346.id20019652.animallist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDetailsActivity extends AppCompatActivity {

    Animal animal;

    ImageView ivAnimal;
    TextView tvName, tvDescription, tvURL;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        ivAnimal = findViewById(R.id.ivAnimal);
        tvName = findViewById(R.id.tvName);
        tvDescription = findViewById(R.id.tvDescription);
        tvURL = findViewById(R.id.textViewURL);
        btnBack = findViewById(R.id.buttonback);

        Intent i = getIntent();
        animal = (Animal)i.getSerializableExtra("Animal");

        if (animal.getName() == "Eagle"){
            ivAnimal.setImageResource(R.drawable.eagle);
        } else if (animal.getName() == "Elephant"){
            ivAnimal.setImageResource(R.drawable.elephant);
        } else if (animal.getName() == "Emu"){
            ivAnimal.setImageResource(R.drawable.emu);
        } else if (animal.getName() == "Eel"){
            ivAnimal.setImageResource(R.drawable.eel);
        } else if (animal.getName() == "Ermine"){
            ivAnimal.setImageResource(R.drawable.ermine);
        } else if (animal.getName() == "Falcon"){
            ivAnimal.setImageResource(R.drawable.falcon);
        } else if (animal.getName() == "Fennec Fox"){
            ivAnimal.setImageResource(R.drawable.fennec_fox);
        } else if (animal.getName() == "Flying Squirrel"){
            ivAnimal.setImageResource(R.drawable.flying_squirrel);
        } else if (animal.getName() == "Fox"){
            ivAnimal.setImageResource(R.drawable.fox);
        } else {
            ivAnimal.setImageResource(R.drawable.fin_whale);
        }
        tvName.setText(animal.getName());
        tvDescription.setText(animal.getDescription());
        tvURL.setText(animal.getUrl());

        tvURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentURL = new Intent(Intent.ACTION_VIEW, Uri.parse(animal.getUrl()));
                startActivity(intentURL);
            }
        });

        //back button or user to go back to main page
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimalDetailsActivity.this, MainActivity.class));
            }
        });
    }
}