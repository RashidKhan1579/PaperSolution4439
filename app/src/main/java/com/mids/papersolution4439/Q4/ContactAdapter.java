package com.mids.papersolution4439.Q4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mids.papersolution4439.R;

import java.net.CookieHandler;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {
    private Context context;
    private List<Contact> contactList;
    private LayoutInflater layoutInflater;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_contact_items, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Contact contact = contactList.get(position);
        holder.layoutContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.onLayoutContactClick(context,contact.getName(), contact.getPhone());
            }
        });

        holder.setTxtName(contact.getName());
        holder.setTxtPhone(contact.getPhone());
    }

    @Override
    public int getItemCount() {
        return contactList == null ? 0 : contactList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout layoutContact;
        private ImageView imgContact;
        private TextView txtName;
        private TextView txtPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutContact = itemView.findViewById(R.id.layoutContact);
            imgContact=itemView.findViewById(R.id.imgContact);
            txtName = itemView.findViewById(R.id.txtName);
            txtPhone = itemView.findViewById(R.id.txtPhone);
        }

        private void onLayoutContactClick(Context context, String name, String phone) {
            Toast.makeText(context, "Name : " + name + " Phone : " + phone, Toast.LENGTH_SHORT).show();
        }
        private void setImgContact(int imgContact){
            this.imgContact.setImageResource(imgContact);
        }

        private void setTxtName(String txtName) {
            this.txtName.setText(txtName);
        }

        private void setTxtPhone(String txtPhone) {
            this.txtPhone.setText(txtPhone);
        }
    }
}

