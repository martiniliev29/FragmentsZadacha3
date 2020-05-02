package com.example.fragmentszadacha3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    public class ContactViewHolder extends RecyclerView.ViewHolder {


        public TextView nameTextView;
        public TextView addressTextView;



        public ContactViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            addressTextView = (TextView) itemView.findViewById(R.id.contact_address);


        }



    }

        private List<Contact> mContacts;

        public ContactAdapter(List<Contact> contacts){

            mContacts = contacts;
        }


        @Override
        public ContactAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            View contactView = inflater.inflate(R.layout.contact_layout,parent, false);
            ContactViewHolder contactViewHolder = new ContactViewHolder(contactView);
            return contactViewHolder;
        }

        @Override
        public void onBindViewHolder(ContactAdapter.ContactViewHolder viewHolder,int position){

            Contact contact = mContacts.get(position);

            TextView textView = viewHolder.nameTextView;
            textView.setText(contact.getmName());
            TextView textView2 = viewHolder.addressTextView;
            textView2.setText(contact.getmAddress());



        }

        @Override
        public int getItemCount(){
            return mContacts.size();
        }

        public void addContacts(Contact contact){
            mContacts.add(0,contact);
            notifyItemChanged(0);
        }

    }


