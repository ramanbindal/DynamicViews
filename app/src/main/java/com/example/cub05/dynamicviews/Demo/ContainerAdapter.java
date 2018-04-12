package com.example.cub05.dynamicviews.Demo;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.cub05.dynamicviews.SectionAdapter;

import java.util.List;

/**
 * Created by cub05 on 4/10/2018.
 */

public class ContainerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<IvgContainerNw> data;
    private int rootWidth, rootHeight;

    public ContainerAdapter(List<IvgContainerNw> data, int rooWidth, int rootHeight) {
        this.data = data;
        this.rootWidth = rooWidth;
        this.rootHeight = rootHeight;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        double hPerc = Integer.parseInt(data.get(viewType).getHeight());
        hPerc = hPerc / 100;

        RecyclerView container = new RecyclerView(parent.getContext());
        container.setLayoutParams(new RecyclerView.LayoutParams(rootWidth, (int) (rootHeight * hPerc)));
        container.setLayoutManager(new LinearLayoutManager(parent.getContext(), LinearLayoutManager.HORIZONTAL, false));
        container.setBackgroundColor(Color.parseColor(data.get(viewType).getBgColor()));
        container.setAlpha(Float.parseFloat(data.get(viewType).getAlpha()));
//
//        SnapToBlock snapToBlock = new SnapToBlock(1);
//        snapToBlock.attachToRecyclerView(container);

        SectionAdapter adapter = new SectionAdapter(data.get(viewType).getSections());
        container.setAdapter(adapter);
//        View line = new View(parent.getContext());
//        line.setLayoutParams(new RecyclerView.LayoutParams(rootWidth, 5));
//        line.setBackgroundColor(Color.BLACK);
//        container.addView(line);

        return new NewVh(container);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return 21;
    }

    public class NewVh extends RecyclerView.ViewHolder {

        public NewVh(View itemView) {
            super(itemView);
        }


    }
}
