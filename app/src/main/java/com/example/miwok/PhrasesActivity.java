package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        //create an array of phrases
        final ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Good morning","Wasuze otya nno", R.raw.phrases_good_morning));
        phrases.add(new Word("Good evening","Osiibye otya nno",  R.raw.phrases_good_evening));
        phrases.add(new Word("Hi","Ki kati", R.raw.phrases_hi));
        phrases.add(new Word("How are you?","Oli otya", R.raw.phrases_how_are_you));
        phrases.add(new Word("I am OK","Gyendi", R.raw.phrases_am_ok));
        phrases.add(new Word("Have a nice day","Siiba bulungi", R.raw.phrases_nice_day));
        phrases.add(new Word("Good night","Sula bulungi", R.raw.phrases_good_night));
        phrases.add(new Word("Thank you ","Webale", R.raw.phrases_thank_you));
        phrases.add(new Word("Please","Mwattu", R.raw.phrases_please));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, phrases, R.color.category_phrases);

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
                Word word = phrases.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceID());
                mMediaPlayer.start();
            }
        });
    }
}
