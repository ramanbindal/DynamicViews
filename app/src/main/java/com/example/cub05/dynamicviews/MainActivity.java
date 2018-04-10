package com.example.cub05.dynamicviews;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.cub05.dynamicviews.Demo.ItemNw;
import com.example.cub05.dynamicviews.Demo.IvgContainerNw;
import com.example.cub05.dynamicviews.Demo.SectionNw;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FrameLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rootLayout = new FrameLayout(this);
        rootLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        rootLayout.setBackgroundColor(Color.YELLOW);

        rootLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    rootLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                int rootHeight = rootLayout.getHeight(); //height is ready
                int rootWidth = rootLayout.getWidth(); //width is ready
                renderIVG(rootWidth, rootHeight);
            }
        });


        this.setContentView(rootLayout);
    }

    private void renderIVG(int rootWidth, int rootHeight) {
        List<IvgContainerNw> result = makeData();
        for (IvgContainerNw container : result) {
            RecyclerView containerView = addContainer(container, rootWidth, rootHeight);
            RvAdapter adapter = new RvAdapter(container.getSections());
            containerView.setAdapter(adapter);

//            for (final SectionNw section : container.getSections()) {
//
//                final FrameLayout sectionView = addSection(section, rootWidth, rootHeight, containerView);
//
//                sectionView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//                    @Override
//                    public void onGlobalLayout() {
//                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                            sectionView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//                        }
//                        int sectionHeight = sectionView.getHeight(); //height is ready
//                        int sectionWidth = sectionView.getWidth(); //width is ready
//                        for (ItemNw item : section.getItems()) {
//                            addItem(item, sectionWidth, sectionHeight, sectionView);
//                        }
//                    }
//                });
//
//            }
        }
    }

    private RecyclerView addContainer(IvgContainerNw data, int sectionWidth, int sectionHeight) {
        //todo pixel to dp convert
        double hPerc = Integer.parseInt(data.getHeight());
        hPerc = hPerc / 100;

        RecyclerView container = new RecyclerView(this);
        container.setLayoutParams(new FrameLayout.LayoutParams(sectionWidth, (int) (sectionHeight * hPerc)));
        container.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        container.setBackgroundColor(Color.parseColor(data.getBgColor()));
        container.setAlpha(Float.parseFloat(data.getAlpha()));

        SnapToBlock snapToBlock = new SnapToBlock(1);
        snapToBlock.attachToRecyclerView(container);

        rootLayout.addView(container);
        return container;
    }

    private FrameLayout addSection(SectionNw data, int sectionWidth, int sectionHeight, FrameLayout containerView) {
        double hPerc = Integer.parseInt(data.getHeight());
        hPerc = hPerc / 100;
        double wPerc = Integer.parseInt(data.getWidth());
        wPerc = wPerc / 100;

        FrameLayout section = new FrameLayout(this);
        section.setLayoutParams(new FrameLayout.LayoutParams((int) (sectionWidth * wPerc), (int) (sectionHeight * hPerc)));
        section.setBackgroundColor(Color.parseColor(data.getBgColor()));
        section.setAlpha(Float.parseFloat(data.getAlpha()));
        containerView.addView(section);
        return section;
    }


    private void addItem(ItemNw data, int sectionWidth, int sectionHeight, FrameLayout sectionView) {

        double hPerc = Integer.parseInt(data.getHeight());
        hPerc = hPerc / 100;
        double wPerc = Integer.parseInt(data.getWidth());
        wPerc = wPerc / 100;

        double xPerc = Integer.parseInt(data.getxCoordinate());
        xPerc = xPerc / 100;
        double yPerc = Integer.parseInt(data.getyCoordinate());
        yPerc = yPerc / 100;

        View item;

        if (data.getTypeCd().equalsIgnoreCase("Text-Static")) {
            item = new TextView(this);
            ((TextView) item).setText(data.getDescText());
            ((TextView) item).setTextColor(Color.parseColor(data.getDescTextFontColor()));
        } else if (data.getTypeCd().equalsIgnoreCase("Image")) {
            item = new ImageView(this);
            ((ImageView) item).setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_launcher_foreground));
        } else {
            item = new FrameLayout(this);
            item.setBackgroundColor(Color.parseColor(data.getDescTextFontColor()));
        }
        item.setLayoutParams(new FrameLayout.LayoutParams((int) (sectionWidth * wPerc), (int) (sectionHeight * hPerc)));
        item.setAlpha(Float.parseFloat(data.getAlpha()));
        item.setX((float) (xPerc * sectionWidth));
        item.setY((float) (yPerc * sectionHeight));

        sectionView.addView(item);
    }


    public List<IvgContainerNw> makeData() {
        List<IvgContainerNw> ivgContainerNwList = new ArrayList<>();
        IvgContainerNw ivgContainerNw = new IvgContainerNw();
        ivgContainerNw.setTypeCd("page_view");
        ivgContainerNw.setAlpha("1");
        ivgContainerNw.setBgColor("#ccefff");
        ivgContainerNw.setHeight("100");

        SectionNw sectionNw1 = new SectionNw();
        sectionNw1.setHeight("100");
        sectionNw1.setWidth("100");
        sectionNw1.setAlpha("1");
        sectionNw1.setBgColor("#00ccff");

        SectionNw sectionNw2 = new SectionNw();
        sectionNw2.setHeight("100");
        sectionNw2.setWidth("60");
        sectionNw2.setAlpha("1");
        sectionNw2.setBgColor("#ff00cc");

        SectionNw sectionNw3 = new SectionNw();
        sectionNw3.setHeight("100");
        sectionNw3.setWidth("60");
        sectionNw3.setAlpha("1");
        sectionNw3.setBgColor("#ffcccc");

        SectionNw sectionNw4 = new SectionNw();
        sectionNw4.setHeight("100");
        sectionNw4.setWidth("60");
        sectionNw4.setAlpha("1");
        sectionNw4.setBgColor("#fffccc");

        SectionNw sectionNw5 = new SectionNw();
        sectionNw5.setHeight("100");
        sectionNw5.setWidth("60");
        sectionNw5.setAlpha("1");
        sectionNw5.setBgColor("#fccccc");

        ItemNw itemNw1 = new ItemNw();
        itemNw1.setHeight("25");
        itemNw1.setWidth("25");
        itemNw1.setxCoordinate("0");
        itemNw1.setyCoordinate("0");
        itemNw1.setTypeCd("Image");
        itemNw1.setAlpha("1");
        itemNw1.setDescTextFontColor("#000000");

        ItemNw itemNw2 = new ItemNw();
        itemNw2.setHeight("20");
        itemNw2.setWidth("20");
        itemNw2.setxCoordinate("50");
        itemNw2.setyCoordinate("55");
        itemNw2.setTypeCd("Text-Static");
        itemNw2.setAlpha("1");
        itemNw2.setDescTextFontColor("#000000");
        itemNw2.setDescText("Hello World");

        List<ItemNw> itemNwList = new ArrayList<>();
        itemNwList.add(itemNw1);
        itemNwList.add(itemNw2);

        sectionNw1.setItems(itemNwList);
        sectionNw2.setItems(itemNwList);
        sectionNw3.setItems(itemNwList);
        sectionNw4.setItems(itemNwList);
        sectionNw5.setItems(itemNwList);

        List<SectionNw> sectionNwList = new ArrayList<>();
        sectionNwList.add(sectionNw1);
        sectionNwList.add(sectionNw2);
        sectionNwList.add(sectionNw3);
        sectionNwList.add(sectionNw4);
        sectionNwList.add(sectionNw5);

        ivgContainerNw.setSections(sectionNwList);

        ivgContainerNwList.add(ivgContainerNw);
        return ivgContainerNwList;
    }

}
