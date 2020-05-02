package com.example.fragmentszadacha3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AddContactDialogListener{

    RecyclerView rv;
    ContactAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recviewContacts);
        ContactSource contacts = new ContactSource();

        adapter = new ContactAdapter(contacts.getContacts());
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fb = findViewById(R.id.floatingActionButton);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager frManager = getSupportFragmentManager();
                AddContactsFragment addContactsFragment = AddContactsFragment.newInstance();
                addContactsFragment.show(frManager,"fragment_add_contacts");

            }
        });

    }

    @Override
    public void onFinishAddDialog(Contact mcontact){
        adapter.addContacts(mcontact);
    }
}
