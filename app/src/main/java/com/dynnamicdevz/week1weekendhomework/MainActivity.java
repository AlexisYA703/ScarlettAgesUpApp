package com.dynnamicdevz.week1weekendhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    private Button increaseButton;
    private Button decreaseButton;
    private TextView ageTextView;
    private ImageView scarlettImageView;
    int duration = Toast.LENGTH_SHORT;


    String TAG = "TAG_X";
    private int count = 0;
    //Context context = getApplicationContext();
    /*CharSequence stageBaby = "Baby"; // 1-2 y/o
    CharSequence stageToddler = "Toddler"; // 3-11 y/o
    CharSequence stageTeen = "Teen"; // 12-17 y/o
    CharSequence stageAdult = "Young Adult"; // 18-21 y/o
    CharSequence bottomLimit = "Bottom age limit reached"; // 18-21 y/o
    CharSequence topLimit = "Top age limit reached"; // 18-21 y/o*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ageTextView = findViewById(R.id.age_count_textview);
        increaseButton = findViewById(R.id.increase_button);
        decreaseButton = findViewById(R.id.decrease_button);
        scarlettImageView = findViewById(R.id.scarlett_stage_imageview);


        increaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                setCountAgeText();
                imageHandler();
                /*if (count>0 && count<3){
                    //scarlettImageView.setImageResource(R.drawable.scarlettbaby);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarlettbaby)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageBaby, duration).show();
                }
                else if (count>2 && count<12){
                    //scarlettImageView.setImageResource(R.drawable.scarletttoddler);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarletttoddler)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageToddler, duration).show();
                }
                else if (count>11 && count<18){
                    //scarlettImageView.setImageResource(R.drawable.scarlettteen);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarlettteen)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageTeen, duration).show();
                }
                else if (count>17 && count<22){
                    //scarlettImageView.setImageResource(R.drawable.scarlettyoungadult);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarlettyoungadult)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageAdult, duration).show();
                }
                else if (count>21){
                    count=21;
                    ageTextView.setText("21");
                    Toast.makeText(context, topLimit, duration).show();
                }

                 */
            }
        });
        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                setCountAgeText();
                imageHandler();
                /*if (count>0 && count<3){
                    //scarlettImageView.setImageResource(R.drawable.scarlettbaby);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarlettbaby)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageBaby, duration).show();
                }
                else if (count>2 && count<12){
                    //scarlettImageView.setImageResource(R.drawable.scarletttoddler);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarletttoddler)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageToddler, duration).show();
                }
                else if (count>11 && count<18){
                    //scarlettImageView.setImageResource(R.drawable.scarlettteen);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarlettteen)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageTeen, duration).show();
                }
                else if (count>17 && count<22){
                    //scarlettImageView.setImageResource(R.drawable.scarlettyoungadult);
                    Glide.with(MainActivity.this)
                            .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                            .load(R.drawable.scarlettyoungadult)
                            .into(scarlettImageView);
                    Toast.makeText(context, stageAdult, duration).show();
                }
                else if (count<=0){
                    count=0;
                    ageTextView.setText("1");
                    Toast.makeText(context, bottomLimit, duration).show();
                }

                 */
            }
        });

        if(savedInstanceState!=null){
            count = savedInstanceState.getInt("COUNT_KEY");
            setCountAgeText();
        }

    }

    private void imageHandler(){
        Context context = getApplicationContext();
        CharSequence stageBaby = "Baby"; // 1-2 y/o
        CharSequence stageToddler = "Toddler"; // 3-11 y/o
        CharSequence stageTeen = "Teen"; // 12-17 y/o
        CharSequence stageAdult = "Young Adult"; // 18-21 y/o
        CharSequence bottomLimit = "Bottom age limit reached"; // 18-21 y/o
        CharSequence topLimit = "Top age limit reached"; // 18-21 y/o

        if (count>0 && count<3){
            //scarlettImageView.setImageResource(R.drawable.scarlettbaby);
            Glide.with(MainActivity.this)
                    .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                    .load(R.drawable.scarlettbaby)
                    .into(scarlettImageView);
            Toast.makeText(context, stageBaby, duration).show();
        }
        else if (count>2 && count<12){
            //scarlettImageView.setImageResource(R.drawable.scarletttoddler);
            Glide.with(MainActivity.this)
                    .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                    .load(R.drawable.scarletttoddler)
                    .into(scarlettImageView);
            Toast.makeText(context, stageToddler, duration).show();
        }
        else if (count>11 && count<18){
            //scarlettImageView.setImageResource(R.drawable.scarlettteen);
            Glide.with(MainActivity.this)
                    .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                    .load(R.drawable.scarlettteen)
                    .into(scarlettImageView);
            Toast.makeText(context, stageTeen, duration).show();
        }
        else if (count>17 && count<22){
            //scarlettImageView.setImageResource(R.drawable.scarlettyoungadult);
            Glide.with(MainActivity.this)
                    .applyDefaultRequestOptions(RequestOptions.circleCropTransform())
                    .load(R.drawable.scarlettyoungadult)
                    .into(scarlettImageView);
            Toast.makeText(context, stageAdult, duration).show();
        }
        else if (count>21){
            count=21;
            ageTextView.setText("21");
            Toast.makeText(context, topLimit, duration).show();
        }
        else if (count<=0){
            count=0;
            ageTextView.setText("1");
            Toast.makeText(context, bottomLimit, duration).show();
        }
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("COUNT_KEY");
        setCountAgeText();
        imageHandler();
    }

    private void setCountAgeText(){
        ageTextView.setText(" " + count);
    }



    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");
        outState.putInt("COUNT_KEY", count);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: Activity visible but not interactive");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: Activity visible and interactive");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: Activity slightly visible going into the background");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Activity in the background but still in memory");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: Activity removed from memory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: Coming from onStop to onStart");
    }
}