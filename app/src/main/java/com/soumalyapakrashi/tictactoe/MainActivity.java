package com.soumalyapakrashi.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int player = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeText();
    }


    void changeText() {
        final TextView grid1 = findViewById(R.id.grid1);
        grid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid1.getText() != "X"  &&  grid1.getText() != "O") {
                    if(player == 1) {
                        grid1.setText("X");
                        player = 2;
                    }
                    else {
                        grid1.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid2 = findViewById(R.id.grid2);
        grid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid2.getText() != "X"  &&  grid2.getText() != "O") {
                    if(player == 1) {
                        grid2.setText("X");
                        player = 2;
                    }
                    else {
                        grid2.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid3 = findViewById(R.id.grid3);
        grid3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid3.getText() != "X"  &&  grid3.getText() != "O") {
                    if(player == 1) {
                        grid3.setText("X");
                        player = 2;
                    }
                    else {
                        grid3.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid4 = findViewById(R.id.grid4);
        grid4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid4.getText() != "X"  &&  grid4.getText() != "O") {
                    if(player == 1) {
                        grid4.setText("X");
                        player = 2;
                    }
                    else {
                        grid4.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid5 = findViewById(R.id.grid5);
        grid5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid5.getText() != "X"  &&  grid5.getText() != "O") {
                    if(player == 1) {
                        grid5.setText("X");
                        player = 2;
                    }
                    else {
                        grid5.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid6 = findViewById(R.id.grid6);
        grid6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid6.getText() != "X"  &&  grid6.getText() != "O") {
                    if(player == 1) {
                        grid6.setText("X");
                        player = 2;
                    }
                    else {
                        grid6.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid7 = findViewById(R.id.grid7);
        grid7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid7.getText() != "X"  &&  grid7.getText() != "O") {
                    if(player == 1) {
                        grid7.setText("X");
                        player = 2;
                    }
                    else {
                        grid7.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid8 = findViewById(R.id.grid8);
        grid8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid8.getText() != "X"  &&  grid8.getText() != "O") {
                    if(player == 1) {
                        grid8.setText("X");
                        player = 2;
                    }
                    else {
                        grid8.setText("O");
                        player = 1;
                    }
                }
            }
        });


        final TextView grid9 = findViewById(R.id.grid9);
        grid9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(grid9.getText() != "X"  &&  grid9.getText() != "O") {
                    if(player == 1) {
                        grid9.setText("X");
                        player = 2;
                    }
                    else {
                        grid9.setText("O");
                        player = 1;
                    }
                }
            }
        });


        // Reset the grids to default
        final Button resetGrid = findViewById(R.id.resetGrid);
        resetGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid1.setText("");
                grid2.setText("");
                grid3.setText("");
                grid4.setText("");
                grid5.setText("");
                grid6.setText("");
                grid7.setText("");
                grid8.setText("");
                grid9.setText("");

                player = 1;
            }
        });
    }
}
