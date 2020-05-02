package com.example.fragmentszadacha3;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddContactsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddContactsFragment extends DialogFragment implements View.OnClickListener {

    private EditText frName;
    private EditText frAddress;
    //private EditText frImage;
    private Button sendButton;


    AddContactDialogListener listener;

    public AddContactsFragment() {
        // Required empty public constructor
    }
    public static AddContactsFragment newInstance(){
        return new AddContactsFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_add_contacts, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        frName = view.findViewById(R.id.fragmentName);
        frAddress = view.findViewById(R.id.fragmentAddress);
        //frImage = view.findViewById(R.id.fragmentImageView);
        sendButton = view.findViewById(R.id.button);
        sendButton.setOnClickListener(this);

        frName.requestFocus();

    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        listener = (AddContactDialogListener)context;
    }

    @Override
    public void onClick(View v){
        Contact contact = new Contact(frName.getText().toString(),frAddress.getText().toString());
        listener.onFinishAddDialog(contact);

        dismiss();
    }


}
