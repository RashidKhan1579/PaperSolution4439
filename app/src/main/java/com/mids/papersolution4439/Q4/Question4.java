package com.mids.papersolution4439.Q4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mids.papersolution4439.R;

import java.util.ArrayList;
import java.util.List;

public class Question4 extends AppCompatActivity {
    private RecyclerView recyclerContacts;
    private ContactAdapter contactAdapter;
    private List<Contact> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        recyclerContacts = findViewById(R.id.recyclerContacts);
        loadContacts();
    }

    private void loadContacts() {
        contactList = new ArrayList<>();

        //Adding Contacts in contactList
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));
        contactList.add(new Contact(R.drawable.ic_baseline_person, "Rashid Khan", "12345678910"));


        contactAdapter = new ContactAdapter(Question4.this, contactList);

        //Adding Layout To Recycler View
        recyclerContacts.setLayoutManager(new LinearLayoutManager(Question4.this));
        //Setting Adapter
        recyclerContacts.setAdapter(contactAdapter);
    }

}