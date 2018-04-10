package com.example.cub05.dynamicviews;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.example.cub05.dynamicviews.Demo.ItemNw;
import com.example.cub05.dynamicviews.Demo.SectionNw;

import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

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

        Log.e("test", "onCreateViewHolder");
        double hPerc = Integer.parseInt(data.get(viewType).getHeight());
        hPerc = hPerc / 100;
        double wPerc = Integer.parseInt(data.get(viewType).getWidth());
        wPerc = wPerc / 100;

        final FrameLayout section = new FrameLayout(parent.getContext());
        section.setLayoutParams(new RecyclerView.LayoutParams((int) (parent.getWidth() * wPerc), (int) (parent.getHeight() * hPerc)));
        section.setBackgroundColor(Color.parseColor(data.get(viewType).getBgColor()));
        section.setAlpha(Float.parseFloat(data.get(viewType).getAlpha()));

//        for (ItemNw item : data.get(viewType).getItems()) {
//            addItem(item, section.getWidth(), section.getHeight(), section);
//        }

        final NewVh holder = new NewVh(section);
        final FrameLayout sectionLayout = ((FrameLayout) holder.itemView);

        sectionLayout.post(new Runnable() {
            @Override
            public void run() {
                int width = sectionLayout.getWidth();
                int height = sectionLayout.getHeight();
                for (ItemNw item : data.get(holder.getAdapterPosition()).getItems()) {
                    Random random = new Random();
                    int a = random.nextInt(10);
                    addItem(item, width, height, sectionLayout, a, a + 3);
                }
            }
        });

//        sectionLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//
////                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
////                    sectionLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
////                }
//                int width = sectionLayout.getWidth();
//                int height = sectionLayout.getHeight();
//                for (ItemNw item : data.get(holder.getAdapterPosition()).getItems()) {
//                    Random random = new Random();
//                    int a = random.nextInt(10);
//                    addItem(item, width, height, sectionLayout, a, a + 3);
//                }
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                    sectionLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//                }
//            }
//        });

        return holder;
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
//            String imgUrl = "www.effigis.com/wp-content/uploads/2015/02/Airbus_Pleiades_50cm_8bit_RGB_Yogyakarta.jpg";
////            String imgUrl = "http://goo.gl/gEgYUd";
//
//            Glide.with(section.getContext()).load(imgUrl).into((ImageView) itemView);

//            ((ImageView) itemView).setImageDrawable(ContextCompat.getDrawable(section.getContext(), R.drawable.));
            ((ImageView) itemView).setImageResource(R.mipmap.test);

//            final ProgressBar progressBar = new ProgressBar(section.getContext());
//
//            Glide.with(section.getContext())
//                    .load("http://www.sample-videos.com/img/Sample-jpg-image-30mb.jpg")
//                    .listener(new RequestListener<String, GlideDrawable>() {
//                        @Override
//                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
//                            progressBar.setVisibility(View.GONE);
//                            return false;
//                        }
//
//                        @Override
//                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
//                            progressBar.setVisibility(View.GONE);
//                            return false;
//                        }
//                    })
//                    .into((ImageView) itemView);
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
        Log.e("test", "onBindViewHolder");

////        Vh dataVH = (Vh) holder;
////        dataVH.bind(data.get(position).getItems());
//        ((FrameLayout) holder.itemView).removeAllViews();
//        final FrameLayout section = ((FrameLayout) holder.itemView);
//        section.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                    section.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//                }
//                int width = section.getWidth();
//                int height = section.getHeight();
//                for (ItemNw item : data.get(holder.getAdapterPosition()).getItems()) {
//                    Random random = new Random();
//                    int a = random.nextInt(10);
//                    addItem(item, width, height, section, a, a + 3);
//                }
//            }
//        });
//
////        int width = 1000;
////        int height = 1500;
////        for (ItemNw item : data.get(holder.getAdapterPosition()).getItems()) {
////            Random random = new Random();
////            int a = random.nextInt(10);
////            addItem(item, width, height, section, a, a + 3);
////        }

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
