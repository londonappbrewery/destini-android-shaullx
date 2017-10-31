package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected Story mStory;
    protected TextView mStoryView;
    protected Button mAnswer1;
    protected Button mAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mStoryView = (TextView)findViewById(R.id.storyTextView);
        mAnswer1 =   (Button)findViewById(R.id.buttonTop);
        mAnswer2 =   (Button)findViewById(R.id.buttonBottom);

        //start a new story, and pass to the story class constructor the resources
        mStory = new Story(mStoryView, mAnswer1, mAnswer2);

        /* Listener for Upper Button */
        mAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (mStory.getStoryIndex())
                {
                    case 1:
                        mStory.advanceStory(3);
                        break;
                    case 2:
                        mStory.advanceStory(3);
                        break;
                    case 3:
                        mStory.advanceStory(6);
                        break;
                }

            }
        });

        /* Listener for Bottom Button */
        mAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (mStory.getStoryIndex())
                {
                    case 1:
                        mStory.advanceStory(2);
                        break;
                    case 2:
                        mStory.advanceStory(4);
                        break;
                    case 3:
                        mStory.advanceStory(5);
                        break;
                }
            }
        });

    }
}
