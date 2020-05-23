package android.example.hello_tripper_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {
    ArrayList<String> list;
    Context context;
    public adapter(ArrayList<String> list,Context context)
    {
        this.list = list;
        this.context=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards,
                        parent,
                        false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.textView.setText(list.get(i));
        if(i==0)
        Glide.with(context).load(context.getResources().getIdentifier("himachal","drawable",context.getPackageName())).into(holder.imageView);
        else if(i==1)
            Glide.with(context).load(context.getResources().getIdentifier("blue_wooden_door","drawable",context.getPackageName())).into(holder.imageView);
            else
            Glide.with(context).load(context.getResources().getIdentifier("ponicherry","drawable",context.getPackageName())).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.card_place_text);
            imageView=itemView.findViewById(R.id.card_image);
        }
    }
}
