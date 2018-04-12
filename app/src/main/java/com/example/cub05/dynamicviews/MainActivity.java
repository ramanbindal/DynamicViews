package com.example.cub05.dynamicviews;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cub05.dynamicviews.Demo.ContainerAdapter;
import com.example.cub05.dynamicviews.Demo.ItemNw;
import com.example.cub05.dynamicviews.Demo.IvgContainerNw;
import com.example.cub05.dynamicviews.Demo.SectionNw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    FrameLayout rootLayout;

    int MAX_CONTAINER = 20;
    int MAX_SECTION = 15;
    int MAX_SECTION_ITEM = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        rootLayout = new FrameLayout(this);
//        rootLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        rootLayout.setBackgroundColor(Color.YELLOW);
//
//        rootLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                    rootLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
//                }
//                int rootHeight = rootLayout.getHeight(); //height is ready
//                int rootWidth = rootLayout.getWidth(); //width is ready
//                renderIVG(rootWidth, rootHeight);
//            }
//        });


        this.setContentView(renderIVG());
    }

    private RecyclerView renderIVG() {
        final List<IvgContainerNw> result = makeData();
        final RecyclerView outerContainer = new RecyclerView(this);
        outerContainer.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        outerContainer.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        outerContainer.setBackgroundColor(Color.BLUE);

        outerContainer.getRecycledViewPool().clear();


        //        SnapToBlock snapToBlock = new SnapToBlock(1);
//        snapToBlock.attachToRecyclerView(outerContainer);
//        rootLayout.addView(outerContainer);
        outerContainer.post(new Runnable() {
            @Override
            public void run() {
                int width = outerContainer.getWidth();
                int height = outerContainer.getHeight();
                ContainerAdapter containerAdapter = new ContainerAdapter(result, width, height);
                outerContainer.setAdapter(containerAdapter);

            }
        });


        return outerContainer;

//        for (IvgContainerNw container : result) {
//            RecyclerView containerView = addContainer(container, rootWidth, rootHeight);
//            SectionAdapter adapter = new SectionAdapter(container.getSections());
//            containerView.setAdapter(adapter);
//
////            for (final SectionNw section : container.getSections()) {
////
////                final FrameLayout sectionView = addSection(section, rootWidth, rootHeight, containerView);
////
////                sectionView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
////                    @Override
////                    public void onGlobalLayout() {
////                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
////                            sectionView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
////                        }
////                        int sectionHeight = sectionView.getHeight(); //height is ready
////                        int sectionWidth = sectionView.getWidth(); //width is ready
////                        for (ItemNw item : section.getItems()) {
////                            addItem(item, sectionWidth, sectionHeight, sectionView);
////                        }
////                    }
////                });
////
////            }
//        }
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


    private ItemNw makeSectionItem(int i, int j, int k) {
        ItemNw itemNw2 = new ItemNw();
        itemNw2.setHeight("20");
        itemNw2.setWidth("20");
        itemNw2.setxCoordinate(k % 2 == 0 ? "50" : "80");
        itemNw2.setyCoordinate(k % 2 == 0 ? "55" : "30");
        itemNw2.setTypeCd(k % 2 == 0 ? "Text-Static" : "Image");
        itemNw2.setAlpha("1");
        itemNw2.setDescTextFontColor("#000000");
        itemNw2.setDescText("Hello World " + i + " " + j + " " + k);
        return itemNw2;
    }

    private SectionNw makeSection(int i, int j) {
        SectionNw sectionNw2 = new SectionNw();
        sectionNw2.setHeight("100");
        sectionNw2.setWidth("100");
        sectionNw2.setAlpha("1");
        sectionNw2.setBgColor(j % 2 == 0 && i % 2 == 0 ? "#ff00cc" : "#ff0000");

        List<ItemNw> itemNwList = new ArrayList<>();
        for (int k = 0; k < MAX_SECTION_ITEM; k++) {
            itemNwList.add(makeSectionItem(i, j, k));
        }

        sectionNw2.setItems(itemNwList);
        return sectionNw2;
    }

    private IvgContainerNw makeContainer(int i) {
        IvgContainerNw ivgContainerNw = new IvgContainerNw();
        ivgContainerNw.setTypeCd("page_view");
        ivgContainerNw.setAlpha("1");
        ivgContainerNw.setBgColor(i % 2 == 0 ? "#ccefff" : "#dfdfdf");
        ivgContainerNw.setHeight(i % 2 == 1 ? "100" : "70");

        List<SectionNw> sectionNwList = new ArrayList<>();

        for (int j = 0; j < MAX_SECTION; j++) {
            sectionNwList.add(makeSection(i, j));
        }
        ivgContainerNw.setSections(sectionNwList);

        return ivgContainerNw;
    }

    public List<IvgContainerNw> makeData() {
        List<IvgContainerNw> ivgContainerNwList = new ArrayList<>();

        for (int i = 0; i < MAX_CONTAINER; i++) {
            ivgContainerNwList.add(makeContainer(i));
        }

        return ivgContainerNwList;
    }

}
