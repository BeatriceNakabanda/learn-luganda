package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //find the root of the whole layout
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //create an array of numbers
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","Emmu", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Two","Bbili", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Three","Satu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Four","Nnya", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Five","Taano", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Six","Mukaaga", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven","Musanvu", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight","Munana", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine","Mwenda", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten","Kumi", R.drawable.number_ten, R.raw.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

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
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceID());
                mMediaPlayer.start();
            }
        });

    }

}
