package sg.edu.rp.c346.id20019652.animallist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAnimal;
    ArrayList<Animal> alAnimalList;
    AnimalAdapter aaAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAnimal = findViewById(R.id.listViewAnimals);
        alAnimalList = new ArrayList<>();
        Animal animal1 = new Animal("Eagle", "Eagles are large, powerfully built birds of prey, with heavy heads and beaks",
                "https://a-z-animals.com/animals/eagle/");
        alAnimalList.add(animal1);
        Animal animal2 = new Animal("Elephant", "Elephants are the largest existing land animals.",
                "https://a-z-animals.com/animals/elephant/");
        alAnimalList.add(animal2);
        Animal animal3 = new Animal("Emu", "Flightless bird of Australia that is the second largest living bird.",
                "https://a-z-animals.com/animals/emu/");
        alAnimalList.add(animal3);
        Animal animal4 = new Animal("Eel", "Eels are ray-finned fish belonging to the order Anguilliformes.",
                "https://a-z-animals.com/animals/eel/");
        alAnimalList.add(animal4);
        Animal animal5 = new Animal("Ermine", "A stoat, especially when in its white winter coat.",
                "https://a-z-animals.com/animals/ermine/");
        alAnimalList.add(animal5);
        Animal animal6 = new Animal("Falcon", "Falcons are birds of prey in the genus Falco",
                "https://a-z-animals.com/animals/falcon/");
        alAnimalList.add(animal6);
        Animal animal7 = new Animal("Fennec Fox", "Fennec fox is a small crepuscular fox native to the Sahara Desert and the Sinai Peninsula",
                "https://a-z-animals.com/animals/fennec-fox/");
        alAnimalList.add(animal7);
        Animal animal8 = new Animal("Flying Squirrel", "Not capable of flight but they glide between trees.",
                "https://a-z-animals.com/animals/fly/");
        alAnimalList.add(animal8);
        Animal animal9 = new Animal("Fox", "Foxes are small to medium-sized, omnivorous mammals belonging to several genera of the family Canidae.",
                "https://a-z-animals.com/animals/fox/");
        alAnimalList.add(animal9);
        Animal animal10 = new Animal("Fin Whale", "Fin whale is the second largest mammal in the world.",
                "https://a-z-animals.com/animals/fin-whale/");
        alAnimalList.add(animal10);

        aaAnimal = new AnimalAdapter(this, R.layout.row, alAnimalList);
        lvAnimal.setAdapter(aaAnimal);

        lvAnimal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, AnimalDetailsActivity.class);
                Animal animal = alAnimalList.get(position);
                intent.putExtra("Animal", animal);
                startActivity(intent);
            }
        });
    }
}