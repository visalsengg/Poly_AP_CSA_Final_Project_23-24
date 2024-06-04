package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameLaiNicholas extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;

    private boolean isWon;
    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    @Override
    protected void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        tvTitle.setText("CHRISTMAS ADVENTURE");
        //initialize number of lives
        numLives = 3;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    private void start()
    {
        //start adventure here

        isWon = false;

        ivStory.setImageResource(R.drawable.im_christmasadventure_title);

        tv.Story.Text.setText("It's Christmas! Let's go on a Christmas Adventure!");

        setAllBtnsVisible();
        btn1.setText("Go to the North Pole");
        btn2.setText("Go Ice Skating");
        btn3.setText("Go See Christmas Lights");

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){goToNorthPole();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){goIceSkating();}
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){goSeeChristmasLights(); }
        });
        Util.clearConsole();
        System.out.println("CHRISTMAS ADVENTURE");

        System.out.println("\nIts Christmas, let's go have fun!");
        Util.pauseConsole();
        System.out.println("\nWhere would you like to go?");
        System.out.println("1. Go to the North Pole\n2. Go Ice Skating\n3. Go See Christmas Lights");
        int choice = Util.enterInt(1, 3);

        if (choice == 1)
        {
            goToNorthPole();
        }
        else if (choice == 2)
        {
            goIceSkating();
        }
        else if (choice == 3)
        {
            goSeeChristmasLights();
        }
    }

    private void goToNorthPole() {
        tvStoryText.setText("You decide to go to the North Pole.");

        ivStory.setImageResource(R.drawable.im_laborday_beach);

        setAllBtnsVisible();
        btn1.setText("Go see Santa");
        btn2.setText("Encounter a polar bear");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goSeeSanta();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                encounterPolarBear();
            }
        });

    }

    private void goSeeSanta()
    {
        tvStoryText.setText("Santa asks what you want for Christmas?");

        ivStory.setImageResource(R.drawable.im_laborday_beach);

        setAllBtnsVisible();
        btn1.setText("Santa Hands You a Present");
        btn2.setText("Santa Kills You");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                santaHandsYouPresent();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                santaKillsYou();
            }
        });

    }

    private void santaKillsYou()
    {
        tvStoryText.setText("Santa kills you, game over.");

        setAllBtnsVisible();
        btn1.setText("Game Over");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void santaHandsYouPresent()
    {
        tvStoryText.setText("Santa turns around with the present, what happens next?");

        ivStory.setImageResource(R.drawable.im_laborday_beach);

        setAllBtnsVisible();
        btn1.setText("Santa tosses you in the cold ocean");
        btn2.setText("Santa gives you what you want");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                santaTossesYouInTheColdOcean();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                santaGivesYouWhatYouWant();
            }
        });

    }

    private void santaTossesYouInTheColdOcean()
    {
        tvStoryText.setText("You get tossed in the ocean and freeze to death");

        setAllBtnsVisible();
        btn1.setText("Game Over");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }

    private void santaGivesYouWhatYouWant()
    {
        tvStoryText.setText("Santa gives you what you want, you WIN!");

        setAllBtnsVisible();
        btn1.setText("Game Over");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }

    private void encounterPolarBear()
    {
        tvStoryText.setText("You encounter the Polar bear, he eats you and you die.");

        setAllBtnsVisible();
        btn1.setText("Game Over");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }

    private void goIceSkating()
    {
        tvStoryText.setText("How would you like to get in?");

        ivStory.setImageresource(R.drawable.im_laborday_beach);

        setAllBtnsVisible();
        btn1.setText("Pay $15");
        btn2.setText("Sneak in without paying");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {goIceSkating();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                pay15(); }
        });

    }

    private void pay15()
    {
        tvStoryText.setText("You pay $15 and get into the ice skating rink, go get your skates!");

        ivStory.setImageresource(R.drawable.im_laborday_beach);

        setAllBtnsVisible();
        btn1.setText("Go get your skates");
        btn2.setText("They don't have enough skates, you lose");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goGetSkates();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                doNotHaveEnoughSkates(); }
        });

    }

    private void doNotHaveEnoughSkates()
    {
        tvStoryText.setText("They don't have enough skates for you, you lose.");

        setAllBtnsVisible();
        btn1.setText("Game Over");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void goGetSkates()
    {
        tvStoryText.setText("You ask for your skates in your size, what happens next?");

        ivStory.setImageresource(R.drawable.im_laborday_beach);

        setAllBtnsVisible();
        btn1.setText("They give you your skates");
        btn2.setText("They don't have your size, you lose");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getSkatesYourSize();}
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                doNotHaveYourSize(); }
        });

    }

    private void doNotHaveYourSize()
    {
        tvStoryText.setText("They don't have skates your size, you lose.");

        setAllBtnsVisible();
        btn1.setText("Game Over");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                defeat();
            }
        });
    }

    private void getSkatesYourSize()
    {
        tvStoryText.setText("You skate like a pro, you WIN!");

        setAllBtnsVisible();
        btn1.setText("Game Over");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                defeat();
            }
        });

    }


    private void sneakIn()
    {
        Util.clearConsole();
        System.out.println("\nYou sneak into the rink without paying, what happens next?");
        System.out.println("1. Security catches you and throws you out, you lose.\n2. Everyone sees and they collectively kick you out, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            defeat();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void goSeeChristmasLights()
    {
        Util.clearConsole();
        System.out.println("\nWould you like to see lights inside or outside?");
        System.out.println("1. Go Outside\n2. Go Inside");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goOutside();
        }
        else if (choice == 2)
        {
            goInside();
        }
    }

    private void goOutside()
    {
        Util.clearConsole();
        System.out.println("\nYou go outside, what happens next?");
        System.out.println("1. It leads into a forest! Follow it!\n2. The lights outside don't work, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            followForest();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void followForest()
    {
        Util.clearConsole();
        System.out.println("\nYou follow the forest, what happens next?");
        System.out.println("1. You see beautiful lights, you look at lights for almost an hour!\n2. The forest catches on fire from the lights, you lose");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            lookAtLights();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }

    private void lookAtLights()
    {
        Util.clearConsole();
        System.out.println("You have a great night looking at lights and you go home happy, You WIN");
        Util.pauseConsole();
        numLives++;
        start();
    }

    private void goInside()
    {
        Util.clearConsole();
        System.out.println("\nYou go inside, what happens next?");
        System.out.println("1. The light catch on fire and you die, you lose.\n2. The light don't work, you get mad and you go home, you lose.");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            defeat();
        }
        else if (choice == 2)
        {
            defeat();
        }
    }




    //run method when defeated
    private void defeat()
    {

        //lose a life
        numLives--;

        //clear console, display text, etc
        Util.clearConsole();
        System.out.println("Careful before you lose too many lives!");
        Util.pauseConsole();


        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            //print game over message
            System.out.println("GAME OVER");
        }

    }
}
