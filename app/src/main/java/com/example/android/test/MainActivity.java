package com.example.android.test;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.android.test.R.id.answers;
import static com.example.android.test.R.id.war;


public class MainActivity extends AppCompatActivity {
    String showR1, showR2, showR3, showR4, showR5, showR6, showR7, showR8, showR9, showR10, message;
    int score = 0;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void checkAnswer167(View view) {

        EditText result1 = (EditText) findViewById(R.id.question1);
        String q1 = result1.getText().toString();
        EditText result6 = (EditText) findViewById(R.id.question6);
        String q6 = result6.getText().toString();
        EditText result7 = (EditText) findViewById(R.id.question7);
        String q7 = result7.getText().toString();
        View show = findViewById(R.id.button);
        View sendan = findViewById(R.id.send);

        if (q1.contains("Dostoyevsky")) {

            showR1 = "Correct!";
            score += 1;

        } else {
            showR1 = "Wrong!";
        }

        if (q6.contains("Don Quixote")) {

            showR6 = "Correct!";
            score += 1;

        } else {
            showR6 = "Wrong!";

        }


        if (q7.contains("Leo Buscaglia")) {

            showR7 = "Correct!";
            score += 1;

        } else {
            showR7 = "Wrong!";

        }
        if (q1 != null && !q1.isEmpty() && q6 != null && !q6.isEmpty() && q7 != null && !q7.isEmpty()) {
            show.setVisibility(View.VISIBLE);
            sendan.setVisibility(View.VISIBLE);
        }

    }

    public void question2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Button e = (Button) findViewById(R.id.engineer);
        Button f = (Button) findViewById(R.id.football);
        Button p = (Button) findViewById(R.id.poet);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.engineer:
                if (checked)
                    e.setEnabled(true);
                f.setEnabled(false);
                p.setEnabled(false);
                // engineer correct answer
                showR2 = "Wrong!";
                break;
            case R.id.football:
                if (checked)
                    e.setEnabled(false);
                f.setEnabled(true);
                p.setEnabled(false);
                //football player correct answer
                showR2 = "Wrong!";
                break;
            case R.id.poet:
                if (checked)
                    e.setEnabled(false);
                f.setEnabled(false);
                p.setEnabled(true);
                //poet correct answer
                showR2 = "Correct!";
                score += 1;
                break;
        }


    }

    public void question3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Button r = (Button) findViewById(R.id.romance);
        Button d = (Button) findViewById(R.id.detective);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.romance:
                if (checked)
                    r.setEnabled(true);
                d.setEnabled(false);

                showR3 = "Wrong!";
                // romance novels correct answer
                break;
            case R.id.detective:
                if (checked)
                    r.setEnabled(false);
                d.setEnabled(true);
                showR3 = "Correct!";
                score += 1;
                //detective novels correct answer
                break;
        }


    }


    public void question4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Button w = (Button) findViewById(R.id.war);
        Button b = (Button) findViewById(R.id.bro);
        Button c = (Button) findViewById(R.id.crime);

        // Check which radio button was clicked
        switch (view.getId()) {
            case war:
                if (checked)
                    w.setEnabled(true);
                b.setEnabled(false);
                c.setEnabled(false);
                showR4 = "Correct!";
                score += 1;

                break;
            case R.id.bro:
                if (checked)
                    b.setEnabled(true);
                w.setEnabled(false);
                c.setEnabled(false);
                showR4 = "Wrong!";

                break;
            case R.id.crime:
                if (checked)
                    b.setEnabled(false);
                w.setEnabled(false);
                c.setEnabled(true);
                showR4 = "Wrong!";

                break;
        }
    }

    public void question5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Button gr = (Button) findViewById(R.id.greece);
        Button ro = (Button) findViewById(R.id.rome);


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.greece:
                if (checked)
                    gr.setEnabled(true);
                ro.setEnabled(false);
                showR5 = "Correct!";
                score += 1;
                // Greece correct answer
                break;
            case R.id.rome:
                if (checked)
                    gr.setEnabled(false);
                ro.setEnabled(true);
                showR5 = "Wrong";
                //Rome correct answer
                break;

        }
    }


    public void checkAnswer8(View view) {

        CheckBox harryPotter = (CheckBox) findViewById(R.id.harry);
        boolean isHarry = harryPotter.isChecked();
        CheckBox hermioneGrandger = (CheckBox) findViewById(R.id.hermione);
        boolean isHermione = hermioneGrandger.isChecked();
        CheckBox drakoMalfoy = (CheckBox) findViewById(R.id.draco);
        boolean isDrako = drakoMalfoy.isChecked();
        CheckBox ronWeasley = (CheckBox) findViewById(R.id.ron);
        boolean isRon = ronWeasley.isChecked();

        if (isHermione && isHarry && isRon && !isDrako) {

            showR8 = "Correct!";
            score += 1;

        } else
            showR8 = "Wrong!";

    }


    public void question9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Button m = (Button) findViewById(R.id.mirror);
        Button p = (Button) findViewById(R.id.painting);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.mirror:
                if (checked)
                    m.setEnabled(true);
                p.setEnabled(false);
                showR9 = "Wrong!";
                // mirror correct answer
                break;
            case R.id.painting:
                if (checked)
                    m.setEnabled(false);
                p.setEnabled(true);
                showR9 = "Correct!";
                score += 1;
                //painting correct answer
                break;

        }
    }

    public void question10(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Button t = (Button) findViewById(R.id.tolkien);
        Button row = (Button) findViewById(R.id.rowling);

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.tolkien:
                if (checked)
                    t.setEnabled(true);
                row.setEnabled(false);
                showR10 = "Correct!";
                // tolkien correct answer
                break;
            case R.id.rowling:
                if (checked)
                    t.setEnabled(false);
                row.setEnabled(true);
                showR10 = "Wrong!";
                score += 1;
                //rowling correct answer
                break;

        }
    }


    public void showResults(View view) {

        EditText namefield = (EditText) findViewById(R.id.name);
        String who = namefield.getText().toString();
        String message = "Your results " + who + " are:";
        message += "\n 1. " + showR1;
        message += "\n 2. " + showR2;
        message += "\n 3. " + showR3;
        message += "\n 4. " + showR4;
        message += "\n 5. " + showR5;
        message += "\n 6. " + showR6;
        message += "\n 7. " + showR7;
        message += "\n 8. " + showR8;
        message += "\n 9. " + showR9;
        message += "\n10. " + showR10;
        displayresults(message);

        Context context = getApplicationContext();
        CharSequence text = "You have " + score + " correct answers!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void displayresults(String message) {
        TextView resquiz = (TextView) findViewById(answers);
        resquiz.setText(String.valueOf(message));
    }

    public void sendResults(View view) {

        Button sendres = (Button) findViewById(R.id.send);
        EditText namefield = (EditText) findViewById(R.id.name);
        String who = namefield.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Literature Quiz");
        intent.putExtra(Intent.EXTRA_TEXT, "Well done " + who + "!" + "\nYou finished the literature quiz with " + score + " correct answers!\nThank you!");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}