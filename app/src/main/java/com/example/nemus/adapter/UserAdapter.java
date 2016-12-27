package com.example.nemus.adapter;

import android.app.Application;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nemus.model.User;
import com.example.nemus.stackexchangeapi.R;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by nemus on 25-Dec-16.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private List<User> users;
    private Context context;
    private int rowLayout;


    public UserAdapter(List<User> users, int rowLayout, Context context){
        this.setUsers(users);
        this.setContext(context);
        this.setRowLayout(rowLayout);
    }
    public UserAdapter(){}

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(rowLayout, parent, false);

        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.userLocation.setText("Location: " + users.get(position).getLocation());
        holder.userReputation.setText("Reputation: " + users.get(position).getReputation());
        holder.userName.setText("Username: " + users.get(position).getUserName());

        Iterator<Map.Entry<String,Integer>> it =
                users.get(position).getBadges().entrySet().iterator();

        Map.Entry<String,Integer> pair = it.next();

        holder.goldenBadge.setText(pair.getKey()+" : ");
        holder.goldenValue.setText(pair.getValue().toString());

        pair = it.next();

        holder.silverBadge.setText(pair.getKey()+" : ");
        holder.silverValue.setText(pair.getValue().toString());

        pair = it.next();

        holder.bronzeBadge.setText(pair.getKey()+" : ");
        holder.bronzeValue.setText(pair.getValue().toString());
    }

    @Override
    public int getItemCount() {
        return users.size();
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

            usersLayout = (LinearLayout) itemView.findViewById(R.id.usersLayout);
            userName = (TextView) itemView.findViewById(R.id.userName);
            userReputation = (TextView) itemView.findViewById(R.id.userReputation);
            userLocation = (TextView) itemView.findViewById(R.id.userLocation);
            goldenBadge = (TextView) itemView.findViewById(R.id.goldenBadge);
            goldenValue = (TextView) itemView.findViewById(R.id.goldenValue);
            silverBadge = (TextView) itemView.findViewById(R.id.silverBadge);
            silverValue = (TextView) itemView.findViewById(R.id.silverValue);
            bronzeBadge = (TextView) itemView.findViewById(R.id.bronzeBadge);
            bronzeValue = (TextView) itemView.findViewById(R.id.bronzeValue);
        }
    }
}
