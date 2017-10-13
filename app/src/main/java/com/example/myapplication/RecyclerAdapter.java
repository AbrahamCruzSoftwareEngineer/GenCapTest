package com.example.myapplication;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.entities.ResultApus;

import java.util.List;

/**
 * Created by Albrtx on 13/10/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private static final String TAG = "RecyclerAdapterTAG_";
    List<ResultApus> resultApuses;

    public RecyclerAdapter(List<ResultApus> resultApuses) {
        this.resultApuses = resultApuses;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(resultApuses.get(position));
    }

    @Override
    public int getItemCount() {
        return resultApuses == null ? 0 : resultApuses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        final TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(android.R.id.text1);
        }

        public void bind(final ResultApus resultApus) {
            Log.d(TAG, "bind: ");
            textView.setText(resultApus.toString());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DetailsActivity.newIntent(view.getContext(), resultApus);
                }
            });
        }
    }
}
