package com.example.cub05.dynamicviews;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cub05.dynamicviews.Demo.ItemNw;
import com.example.cub05.dynamicviews.Demo.SectionNw;

import java.util.List;

/**
 * Created by cub01 on 3/29/2018.
 */

public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<SectionNw> data;

    public RvAdapter(List<SectionNw> sections) {
        this.data = sections;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        double hPerc = Integer.parseInt(data.get(viewType).getHeight());
        hPerc = hPerc / 100;
        double wPerc = Integer.parseInt(data.get(viewType).getWidth());
        wPerc = wPerc / 100;

        FrameLayout section = new FrameLayout(parent.getContext());
        section.setLayoutParams(new FrameLayout.LayoutParams((int) (parent.getWidth() * wPerc), (int) (parent.getHeight() * hPerc)));
        section.setBackgroundColor(Color.parseColor(data.get(viewType).getBgColor()));
        section.setAlpha(Float.parseFloat(data.get(viewType).getAlpha()));

        for (ItemNw item : data.get(viewType).getItems()) {
            addItem(item, section.getWidth(), section.getHeight(), section);
        }

        return new Vh(section);
    }

    private void addItem(ItemNw item, int sectionWidth, int sectionHeight, FrameLayout section) {

        double hPerc = Integer.parseInt(item.getHeight());
        hPerc = hPerc / 100;
        double wPerc = Integer.parseInt(item.getWidth());
        wPerc = wPerc / 100;

        double xPerc = Integer.parseInt(item.getxCoordinate());
        xPerc = xPerc / 100;
        double yPerc = Integer.parseInt(item.getyCoordinate());
        yPerc = yPerc / 100;

        View itemView;

        if (item.getTypeCd().equalsIgnoreCase("Text-Static")) {
            itemView = new TextView(section.getContext());
            ((TextView) itemView).setText(item.getDescText());
            ((TextView) itemView).setTextColor(Color.parseColor(item.getDescTextFontColor()));
            ((TextView) itemView).setTag("textView");
        } else if (item.getTypeCd().equalsIgnoreCase("Image")) {
            itemView = new ImageView(section.getContext());
            ((ImageView) itemView).setImageDrawable(ContextCompat.getDrawable(section.getContext(), R.drawable.ic_launcher_foreground));
            ((ImageView) itemView).setTag("imageView");
        } else {
            itemView = new FrameLayout(section.getContext());
            itemView.setTag("frameLayout");
            itemView.setBackgroundColor(Color.parseColor(item.getDescTextFontColor()));
        }

        itemView.setLayoutParams(new FrameLayout.LayoutParams((int) (sectionWidth * wPerc), (int) (sectionHeight * hPerc)));
        itemView.setAlpha(Float.parseFloat(item.getAlpha()));
        itemView.setX((float) (xPerc * sectionWidth));
        itemView.setY((float) (yPerc * sectionHeight));

        section.addView(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Vh dataVH = (Vh) holder;
        dataVH.bind(data.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Vh extends RecyclerView.ViewHolder {

        private TextView tv;
        private ImageView iv;
        private FrameLayout fl;

        public Vh(View itemView) {
            super(itemView);
            this.tv=itemView.findViewWithTag("textView");

        }

        public void bind(SectionNw sectionNw) {
        }
    }
}
