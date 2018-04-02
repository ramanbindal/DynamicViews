package com.example.cub05.dynamicviews;

import android.graphics.Color;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cub05.dynamicviews.Demo.ItemNw;
import com.example.cub05.dynamicviews.Demo.SectionNw;

import java.util.List;
import java.util.Random;

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
        section.setLayoutParams(new RecyclerView.LayoutParams((int) (parent.getWidth() * wPerc), (int) (parent.getHeight() * hPerc)));
        section.setBackgroundColor(Color.parseColor(data.get(viewType).getBgColor()));
        section.setAlpha(Float.parseFloat(data.get(viewType).getAlpha()));

//        for (ItemNw item : data.get(viewType).getItems()) {
//            addItem(item, section.getWidth(), section.getHeight(), section);
//        }

        return new NewVh(section);
    }

    private void addItem(ItemNw item, int sectionWidth, int sectionHeight, FrameLayout section, int sx, int sy) {

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
            ((TextView) itemView).setBackgroundColor(Color.BLACK);

            ((TextView) itemView).setTextColor(Color.parseColor(item.getDescTextFontColor()));
        } else if (item.getTypeCd().equalsIgnoreCase("Image")) {
            itemView = new ImageView(section.getContext());
            ((ImageView) itemView).setImageDrawable(ContextCompat.getDrawable(section.getContext(), R.drawable.ic_launcher_foreground));
        } else {
            itemView = new FrameLayout(section.getContext());
            itemView.setBackgroundColor(Color.parseColor(item.getDescTextFontColor()));
        }

        itemView.setLayoutParams(new FrameLayout.LayoutParams((int) (sectionWidth * wPerc), (int) (sectionHeight * hPerc)));
        itemView.setAlpha(Float.parseFloat(item.getAlpha()));
        itemView.setX((float) (xPerc * sectionWidth) + sx);
        itemView.setY((float) (yPerc * sectionHeight) + sy);
        itemView.setTag("item");
        Log.e("test", itemView.toString());
        section.addView(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
//        Vh dataVH = (Vh) holder;
//        dataVH.bind(data.get(position).getItems());
        ((FrameLayout) holder.itemView).removeAllViews();
        final FrameLayout section = ((FrameLayout) holder.itemView);
        section.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    section.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                int width = section.getWidth();
                int height = section.getHeight();
                for (ItemNw item : data.get(holder.getAdapterPosition()).getItems()) {
                    Random random = new Random();
                    int a = random.nextInt(10);
                    addItem(item, width, height, section, a, a + 3);
                }
            }
        });

//        int width = 1000;
//        int height = 1500;
//        for (ItemNw item : data.get(holder.getAdapterPosition()).getItems()) {
//            Random random = new Random();
//            int a = random.nextInt(10);
//            addItem(item, width, height, section, a, a + 3);
//        }

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

        private View view;
        private View itemView;

        public Vh(View itemView) {
            super(itemView);
            this.itemView = itemView;
//            this.tv = itemView.findViewWithTag("textView");
//            this.iv = itemView.findViewWithTag("imageView");
            // this.view=itemView.findViewWithTag("view");

        }

        public void bind(List<ItemNw> itemNws) {

            for (ItemNw itemNw : itemNws) {
                if (itemNw.getTypeCd().equalsIgnoreCase("Text-Static")) {
                    //view = new TextView(itemView.getContext());

                    ((TextView) view).setText(itemNw.getDescText());
                    ((TextView) view).setTextColor(Color.parseColor(itemNw.getDescTextFontColor()));
                } else if (itemNw.getTypeCd().equalsIgnoreCase("Image")) {
                    view = new ImageView(itemView.getContext());
                    ((ImageView) view).setImageDrawable(ContextCompat.getDrawable(itemView.getContext(), R.drawable.ic_launcher_foreground));
                } else {
                    view = new FrameLayout(itemView.getContext());
                    view.setBackgroundColor(Color.parseColor(itemNw.getDescTextFontColor()));
                }
            }
        }
    }

    public class NewVh extends RecyclerView.ViewHolder {

        public NewVh(View itemView) {
            super(itemView);
        }


    }

}
