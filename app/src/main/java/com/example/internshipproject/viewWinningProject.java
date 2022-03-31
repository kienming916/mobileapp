package com.example.internshipproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class viewWinningProject extends AppCompatActivity{

    ImageButton arrow, arrow2;
    LinearLayout hiddenView, view2019, view2018, view2017, view2016, view2015, view2014, view2013, view2012, hiddenView2, ceremony2019, ceremony2018, ceremony2017, ceremony2016, ceremony2015, ceremony2014, ceremony2013, ceremony2012;
    CardView cardView, cardView2;
    final int[] checkedItem = {-1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_winning_project);
        findViews();
        setListeners();
    }

    private void findViews() {
        cardView = findViewById(R.id.base_cardview);
        arrow = findViewById(R.id.arrow_button);
        hiddenView = findViewById(R.id.hidden_view);
        view2019 = findViewById(R.id.choose2019);
        view2018 = findViewById(R.id.choose2018);
        view2017 = findViewById(R.id.choose2017);
        view2016 = findViewById(R.id.choose2016);
        view2015 = findViewById(R.id.choose2015);
        view2014 = findViewById(R.id.choose2014);
        view2013 = findViewById(R.id.choose2013);
        view2012 = findViewById(R.id.choose2012);
        cardView2 = findViewById(R.id.base_cardview2);
        arrow2 = findViewById(R.id.arrow_button2);
        hiddenView2 = findViewById(R.id.hidden_view2);
        ceremony2019 = findViewById(R.id.awardceremony2019);
        ceremony2018 = findViewById(R.id.awardceremony2018);
        ceremony2017 = findViewById(R.id.awardceremony2017);
        ceremony2016 = findViewById(R.id.awardceremony2016);
        ceremony2015 = findViewById(R.id.awardceremony2015);
        ceremony2014 = findViewById(R.id.awardceremony2014);
        ceremony2013 = findViewById(R.id.awardceremony2013);
        ceremony2012 = findViewById(R.id.awardceremony2012);
    }

    private void setListeners() {
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the CardView is already expanded, set its visibility
                //  to gone and change the expand less icon to expand more.
                if (hiddenView.getVisibility() == View.VISIBLE) {
                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.GONE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else{

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });

        view2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2019", "2019 Senior group shortlisted list", "2019 Junior group shortlisted list", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2019%20%E8%8E%B7%E5%A5%96%E5%90%8D%E5%8D%95%20List%20of%20winner%20%E5%85%AC%E5%B8%83.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2019%20Senior%20Interview%20namelist%20%E5%85%A5%E9%80%89%E9%9D%A2%E8%AF%95%E5%90%8D%E5%8D%95%20%E9%AB%98%E4%B8%AD.pdf"));
                            startActivity(browserIntent);
                        }else if (i==2){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2019%20Junior%20Interview%20namelist%20%E5%85%A5%E9%80%89%E9%9D%A2%E8%AF%95%E5%90%8D%E5%8D%95%20%E5%88%9D%E4%B8%AD.pdf"));
                            startActivity(browserIntent);
                        }else if (i==3){
                            Judges2019();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        view2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2018", "2018 Senior group shortlisted list", "2018 Junior group shortlisted list", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2018%20%E8%8E%B7%E5%A5%96%E5%90%8D%E5%8D%95%20List%20of%20winner.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2018%20%E9%AB%98%E4%B8%AD%E7%BB%84.pdf"));
                            startActivity(browserIntent);
                        }else if (i==2){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2018%20%E5%88%9D%E4%B8%AD%E7%BB%84.pdf"));
                            startActivity(browserIntent);
                        }else if (i==3){
                            Judges2018();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        view2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2017", "2017 Senior group shortlisted list", "2017 Junior group shortlisted list", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2017%20%E8%8E%B7%E5%A5%96%E5%90%8D%E5%8D%95%20List%20of%20winner.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2017%20%E5%85%A5%E9%80%89%E9%9D%A2%E8%AF%95%E5%90%8D%E5%8D%95%20%E9%AB%98%E4%B8%AD.pdf"));
                            startActivity(browserIntent);
                        }else if (i==2){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2017%20%E5%85%A5%E9%80%89%E9%9D%A2%E8%AF%95%E5%90%8D%E5%8D%95%20%E5%88%9D%E4%B8%AD.pdf"));
                            startActivity(browserIntent);
                        }else if (i==3){
                            Judges2017();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        view2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2016", "2016 Senior group shortlisted list", "2016 Junior group shortlisted list", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2016%20%E8%8E%B7%E5%A5%96%E5%90%8D%E5%8D%95%20List%20of%20winnier%202016.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2016%20First%20Stage%20Shortlist%20SENIOR_eng.pdf"));
                            startActivity(browserIntent);
                        }else if (i==2){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2016%20First%20Stage%20Shortlist%20JUNIOR_eng.pdf"));
                            startActivity(browserIntent);
                        }else if (i==3){
                            Judges2016();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        view2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2015", "2015 Senior group shortlisted list", "2015 Junior group shortlisted list", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/List%20of%20winnier%202015.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/Shortlist_En_S_2015.pdf"));
                            startActivity(browserIntent);
                        }else if (i==2){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/Shortlist_En_J_2015.pdf"));
                            startActivity(browserIntent);
                        }else if (i==3){
                            Judges2015();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        view2014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2014", "2014 Senior group shortlisted list", "2014 Junior group shortlisted list", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2014WinnersList.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/Shortlist_En_S_2014.pdf"));
                            startActivity(browserIntent);
                        }else if (i==2){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/Shortlist_En_J_2014.pdf"));
                            startActivity(browserIntent);
                        }else if (i==3){
                            Judges2014();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        view2013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2013", "2013 Senior group shortlisted list", "2013 Junior group shortlisted list", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2013WinnersList.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/Shortlist_En_S_2013.pdf"));
                            startActivity(browserIntent);
                        }else if (i==2){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/Shortlist_En_J_2013.pdf"));
                            startActivity(browserIntent);
                        }else if (i==3){
                            Judges2013();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        view2012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(viewWinningProject.this);
                alertDialog.setTitle("Select your choice");
                final String[] listItems = new String[]{"List winners of 2012", "Judges"};

                alertDialog.setSingleChoiceItems(listItems, checkedItem[0], new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        checkedItem[0] = i;
                        dialog.dismiss();
                        if(i==0){
                            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.newera.edu.my/competition/tkkyiam/document/2012WinnersList.pdf"));
                            startActivity(browserIntent);
                        }else if (i==1){
                            Judges2012();
                        }
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                AlertDialog customAlertDialog = alertDialog.create();
                customAlertDialog.show();
            }
        });

        arrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the CardView is already expanded, set its visibility
                //  to gone and change the expand less icon to expand more.
                if (hiddenView2.getVisibility() == View.VISIBLE) {
                    // The transition of the hiddenView is carried out
                    //  by the TransitionManager class.
                    // Here we use an object of the AutoTransition
                    // Class to create a default transition.
                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hiddenView2.setVisibility(View.GONE);
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }

                // If the CardView is not expanded, set its visibility
                // to visible and change the expand more icon to expand less.
                else{

                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hiddenView2.setVisibility(View.VISIBLE);
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });

        ceremony2019.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2019.class);
            startActivity(intent);
        });

        ceremony2018.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2018.class);
            startActivity(intent);
        });

        ceremony2017.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2017.class);
            startActivity(intent);
        });

        ceremony2016.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2016.class);
            startActivity(intent);
        });

        ceremony2015.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2015.class);
            startActivity(intent);
        });

        ceremony2014.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2014.class);
            startActivity(intent);
        });

        ceremony2013.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2013.class);
            startActivity(intent);
        });

        ceremony2012.setOnClickListener(view -> {
            Intent intent = new Intent(viewWinningProject.this,memories2012.class);
            startActivity(intent);
        });
    }

/*    public void onBackPressed() {
        Intent intent = new Intent(viewWinningProject.this,homeActivity.class);
        intent.putExtra("finish", true); // if you are checking for this in your other Activities
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }*/

    public void Judges2019() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2019");
        builder.setMessage("1. Dr. Lim Chong Keang\n" +
                "2. Mr. Chng Chern Wei\n" +
                "3. Dr. Ho Jee Hou\n" +
                "4. Dr. Teh Sze Hong\n" +
                "5. Dr. Chung Fei Fang\n" +
                "6. Dr. Koh Tieng Wei\n" +
                "7. Mr. Lee Boon Kong")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Judges2018() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2018");
        builder.setMessage("1. Dr. Lim Chong Keang\n" +
                "2. Mr. Chng Chern Wei\n" +
                "3. Dr. Teo Lee Peng\n" +
                "4. Dr. Gan Seng Neon\n" +
                "5. Dr. Ho Jee Hou\n" +
                "6. Dr. Teh Sze Hong\n" +
                "7. Dr. Chung Fei Fang\n" +
                "8. Mr. Koong Kok Leong")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Judges2017() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2017");
        builder.setMessage("1. Dr. Lim Chong Keang\n" +
                "2. Dr. Teo Lee Peng\n" +
                "3. Dr. Tan Keng Teh\n" +
                "4. Dr. Gan Seng Neon\n" +
                "5. Dr. Ho Jee Hou\n" +
                "6. Dr. Teh Sze Hong\n" +
                "7. Mr. Koong Kok Leong\n" +
                "8. Dr. Chin Kok Goon")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Judges2016() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2016");
        builder.setMessage("1.   Dr. Chin Ting Yun\n" +
                "2.   Dr. Yap Chee Sing\n" +
                "3.   Dr. Teo Lee Peng\n" +
                "4.   Dr. Tan Keng Teh\n" +
                "5.   Dr. Lim Ying\n" +
                "6.   Dr. Chia Swee Ping\n" +
                "7.   Dr. Gan Seng Neon\n" +
                "8.   Dr. Ho Jee Hou\n" +
                "9.   Dr. Lim Chong Keang\n" +
                "10. Mr Koong Kok Leong\n" +
                "11. Mr Heng Han Kok")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Judges2015() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2015");
        builder.setMessage("1.   Dr. Lim Chong Keang\n" +
                "2.   Dr. Chia Swee Ping\n" +
                "3.   Dr. Tong Soo Long\n" +
                "4.   Dr. Yap Chee Sing\n" +
                "5.   Dr. Yap Kon Sang\n" +
                "6.   Dr. Teo Lee Peng\n" +
                "7.   Dr. Tan Keng Teh\n" +
                "8.   Dr. Chung Fei Fang\n" +
                "9.   Mr. Koong Kok Leong\n" +
                "10. Mr. Lee Chyuan Chuan")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Judges2014() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2014");
        builder.setMessage("1. Dr. Yap Chee Sing\n" +
                "2. Dr. Chin Ting Yun\n" +
                "3. Dr. Yap Kon Sang\n" +
                "4. Dr. Teo Lee Peng\n" +
                "5. Dr. Chia Swee Ping\n" +
                "6. Dr. Tong Soo Long")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Judges2013() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2013");
        builder.setMessage("1. Dr. Yap Chee Sing\n" +
                "2. Dr. Chia Swee Ping\n" +
                "3. Dr. Lim Chong Keang\n" +
                "4. Dr. Tong Soo Long\n" +
                "5. Dr. Chung Fei Fang\n" +
                "6. Dr. Lim Ying")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void Judges2012() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Judges of Tan Kah Kee Young Inventors' Award 2012");
        builder.setMessage("1. Dato’ Dr. Chuah Hean Teik\n" +
                "2. Dr. Tong Soo Long\n" +
                "3. Dr. Yap Chee Sing\n" +
                "4. Dr. Chia Swee Ping\n" +
                "5. Dr. Lim Chong Keang\n" +
                "6. Dr. Mok Soon Chong")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        android.app.AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}