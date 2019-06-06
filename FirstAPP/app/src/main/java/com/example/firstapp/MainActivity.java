package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Person> personList=new ArrayList<Person>();
    private Person p;
    EditText editText;
    TextView textView;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        textView = findViewById(R.id.textView1);
        name= editText.getText().toString();


        createPerson();
        updateName();

        Toast.makeText(this ,"Mr: "+p.getName()+" is adult? "+isAdult(p), Toast.LENGTH_LONG).show();

        createListPersona();
        getAllPersonsAdult();
        getAllPersons();
        personList.add(p);
        getAllPersonsA();
        showInterCalation();
       //primo(12,1,0);

    }

    public void createPerson(){
        p=new Person("Ildrus",29);
        Toast.makeText(this ,"hello mr: "+p.getName()+""+" welcome", Toast.LENGTH_LONG).show();
    }

    public void updateName(){
        p.setName("Andreu");
        Toast.makeText(this ,"hello mr: "+p.getName()+""+" welcome", Toast.LENGTH_LONG).show();
    }

    public String isAdult(Person p){
        if(p.getYears()<18){
            return "no adult";
        }
        return "adult";
    }

    public void createListPersona(){
        Random random = new Random();
        for(int i=1;i<=5;i++){
            personList.add(new Person("Person"+i,random.nextInt( 50 - 16)));
        }
    }

    public void getAllPersonsAdult(){
        for(Person p:personList) {
            if (p.getYears() >= 18) {
                if (personList.indexOf(p) + 1 == personList.size()) {
                    Log.v("firstapp", "Name: "+p.getName() + " is adult "+p.getYears() + "last person");
                   // primo(p.getYears(),0,0);
                }
                else {
                    Log.v("firstapp", "Name: "+p.getName() + " is adult "+p.getYears());
                   // primo(p.getYears(),0,0);
                }
            }
            else {
                if (personList.indexOf(p) + 1 == personList.size()) {
                    Log.v("firstapp", "Name: "+p.getName() + " is Not adult "+p.getYears() + "last person");
                   // primo(p.getYears(),0,0);
                }
                else {
                    Log.v("firstapp", "Name: "+p.getName() + " is Not adult "+p.getYears());
                   // primo(p.getYears(),0,0);
                }
            }
        }
    }

    public void getAllPersons(){
        for(Person p:personList) {
            if (p.getYears() >= 18) {
                if (personList.indexOf(p) + 1 == personList.size()) {
                    Log.v("firstapp", "Name: "+p.getName() + " is adult "+p.getYears() + "last person");
                }
                else {
                    Log.v("firstapp", "Name: "+p.getName() + " is adult "+p.getYears());
                }
            }
            else {
                if (personList.indexOf(p) + 1 == personList.size()) {
                    Log.v("firstapp", "Name: "+p.getName() + " is Not adult "+p.getYears() + "last person");
                }
                else {
                    Log.v("firstapp", "Name: "+p.getName() + " is Not adult "+p.getYears());
                }
            }
        }
    }

    public void getAllPersonsA() {
        for (Person p : personList) {
            if (p.getName().startsWith("A")) {
                if (p.getYears() >= 18) {
                    if (personList.indexOf(p) + 1 == personList.size()) {
                        Log.v("firstapp", "Name: "+p.getName() + " is adult "+p.getYears() + "last person");
                    } else {
                        Log.v("firstapp", "Name: "+p.getName() + " is adult "+p.getYears());
                    }
                } else {
                    if (personList.indexOf(p) + 1 == personList.size()) {
                        Log.v("firstapp", "Name: "+p.getName() + " is Not adult "+p.getYears() + "last person");
                    } else {
                        Log.v("firstapp", "Name: "+p.getName() + " is Not adult "+p.getYears());
                    }
                }
            }
        }
    }
    public void showInterCalation () {
        int cont = 0;
        for (Person p : personList) {
            if (cont % 2 == 0) {
                Log.v("firstapp", "Name: " + p.getName() + " Years:" + p.getYears());
            }
            cont += 1;
        }
    }
/*
   public void primo(int years,int valor,int count){
       int valor1=valor,years1=years,count1=count;

       if(valor1>years1){
           if(count1==1){
               Log.v("firstapp", "its primo");
           }
           else{
               Log.v("firstapp", "its No primo");
           }
       }
       else{
           int result=years1%valor1;
           if(result==0){
               valor1+=1;
               count1+=1;
               primo(years1,valor1,count1);
           }
           else{
               valor1+=1;
               primo(years1,valor1,count1);
           }
       }
    }*/

    public void acept(View view){
        if(!name.equals("")) {
            textView.setText(getString(R.string.hello1) + " " + name + getString(R.string.hello2));
        }
        else{
            textView.setText("");
        }
    }

    public void cancel(View view){
        textView.setText("");
        editText.setText("");
    }
}
