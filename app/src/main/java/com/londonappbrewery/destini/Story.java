package com.londonappbrewery.destini;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by shauls on 10/31/2017.
 */

public class Story {

    private int mStoryIndex;
    protected TextView mStoryView;
    protected Button mAnswer1;
    protected Button mAnswer2;
    private final int LAST_STAGE = 4;


    public Story(TextView story, Button b1, Button b2) {
        mStoryIndex = 1;
        mStoryView = story;
        mAnswer1 = b1;
        mAnswer2 = b2;
    }

    public void advanceStory(int step) {

        Log.d("StoryAdvancing", "Original Step: "+mStoryIndex);
        mStoryIndex = step;
        Log.d("StoryAdvancing", "Going to step " + step);
        int[] res = new int[3];

        switch (mStoryIndex) {
            case 1:
                res[0] = R.string.T1_Story;
                res[1] = R.string.T1_Ans1;
                res[2] = R.string.T1_Ans2;
                break;
            case 2:
                res[0] = R.string.T2_Story;
                res[1] = R.string.T2_Ans1;
                res[2] = R.string.T2_Ans2;
                break;
            case 3:
                res[0] = R.string.T3_Story;
                res[1] = R.string.T3_Ans1;
                res[2] = R.string.T3_Ans2;
                break;
            case 4:
                res[0] = R.string.T4_End;
                break;
            case 5:
                res[0] = R.string.T5_End;
                break;
            case 6:
                res[0] = R.string.T6_End;
                break;
        }
        // Change the story text
        mStoryView.setText(res[0]);

        // If we're not at the end of the story, change the text on the buttons as well
        if (mStoryIndex < LAST_STAGE) {
            mAnswer1.setText(res[1]);
            mAnswer2.setText(res[2]);
        } else {
            // Make the buttons disappear at the end of the game
            mAnswer1.setVisibility(View.INVISIBLE);
            mAnswer2.setVisibility(View.INVISIBLE);
        }

    }

    public int getStoryIndex() {
        return mStoryIndex;
    }

    public void setStoryIndex(int mStoryIndex) {
        this.mStoryIndex = mStoryIndex;
    }
}
