package com.parbon.mehduuuportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project[] projects = {
                new Project("Getting Started App", "Our very first project", R.drawable.getting_started),
                new Project("Motivational Quote App", "A project that shows a motivational quote", R.drawable.quote),
                new Project("BMI Calculator App", "A project to calculate the BMI", R.drawable.calculator),
                new Project("Inches Converter", "An App that can convert from meters to inches", R.drawable.tape),
                new Project("Hungry Developer", "An app with a restaurant menu", R.drawable.hungry_developer)

        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);



    }
}