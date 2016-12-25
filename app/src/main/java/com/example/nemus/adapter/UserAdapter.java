package com.example.nemus.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nemus.model.User;

import java.util.List;

/**
 * Created by nemus on 25-Dec-16.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private List<User> users;
    private Context context;
    private int rowLayout;


    public UserAdapter(List<User> users, Context context, int rowLayout){
        this.setUsers(users);
        this.setContext(context);
        this.setRowLayout(rowLayout);
    }
    public UserAdapter(){}

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getRowLayout() {
        return rowLayout;
    }

    public void setRowLayout(int rowLayout) {
        this.rowLayout = rowLayout;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{

        LinearLayout usersLayout;
        TextView userName;
        TextView userReputation;
        TextView userLocation;

        TextView goldenBadge;
        TextView goldenValue;
        TextView silverBadge;
        TextView silverValue;
        TextView bronzeBadge;
        TextView bronzeValue;

        public UserViewHolder(View itemView) {
            super(itemView);
        }
    }
}
