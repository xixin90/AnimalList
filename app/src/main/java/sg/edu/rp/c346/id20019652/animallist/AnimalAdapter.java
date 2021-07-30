package sg.edu.rp.c346.id20019652.animallist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Animal> animalList;

    public AnimalAdapter(Context context, int resource,
                         ArrayList<Animal> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        animalList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        ImageView ivAnimal = rowView.findViewById(R.id.imageViewAnimal);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDescription = rowView.findViewById(R.id.textViewDescription);

        // Obtain the Animal information based on the position
        Animal currentAnimal = animalList.get(position);

        //sets a drawable as the content of this ImageView.
        if (currentAnimal.getName() == "Eagle"){
            ivAnimal.setImageResource(R.drawable.eagle);
        } else if (currentAnimal.getName() == "Elephant"){
            ivAnimal.setImageResource(R.drawable.elephant);
        } else if (currentAnimal.getName() == "Emu"){
            ivAnimal.setImageResource(R.drawable.emu);
        } else if (currentAnimal.getName() == "Eel"){
            ivAnimal.setImageResource(R.drawable.eel);
        } else if (currentAnimal.getName() == "Ermine"){
            ivAnimal.setImageResource(R.drawable.ermine);
        } else if (currentAnimal.getName() == "Falcon"){
            ivAnimal.setImageResource(R.drawable.falcon);
        } else if (currentAnimal.getName() == "Fennec Fox"){
            ivAnimal.setImageResource(R.drawable.fennec_fox);
        } else if (currentAnimal.getName() == "Flying Squirrel"){
            ivAnimal.setImageResource(R.drawable.flying_squirrel);
        } else if (currentAnimal.getName() == "Fox"){
            ivAnimal.setImageResource(R.drawable.fox);
        } else {
            ivAnimal.setImageResource(R.drawable.fin_whale);
        }
        // Set values to the TextView to display the corresponding information
        tvName.setText(currentAnimal.getName());
        tvDescription.setText(currentAnimal.getDescription());

        return rowView;
    }
}
