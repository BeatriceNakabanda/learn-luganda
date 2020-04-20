package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of numbers
        final ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("White", "Kyeru", R.drawable.color_white, R.raw.color_white));
        colors.add(new Word("Black", "Kidugavu", R.drawable.color_black, R.raw.color_black));
//        colors.add(new Word("Blue", "Bululu"));
        colors.add(new Word("Green", "Kilagala", R.drawable.color_green, R.raw.color_green));
        colors.add(new Word("Red", "Myufu", R.drawable.color_red, R.raw.color_red));
        colors.add(new Word("Gray", "Erangi", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new Word("Yellow", "Kyenvu", R.drawable.color_mustard_yellow, R.raw.color_yellow));
//        colors.add(new Word("Orange", "Kakyungwa"));
//        colors.add(new Word("Pink", "Kikusikusi "));
//        colors.add(new Word("Purple", "Kakobe"));
        colors.add(new Word("Brown", "Kitaaka", R.drawable.color_brown, R.raw.color_brown));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = colors.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceID());
                mMediaPlayer.start();
            }
        });
    }

}
