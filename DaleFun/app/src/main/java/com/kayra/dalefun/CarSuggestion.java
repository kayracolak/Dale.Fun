package com.kayra.dalefun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.dalefun.R;

public class CarSuggestion extends AppCompatActivity {

    private CheckBox manualCheckbox, automaticCheckbox, smallCheckbox, standardCheckbox, bigCheckbox,
            seat1Checkbox, seat2Checkbox, seat3Checkbox, salary1Checkbox, salary2Checkbox, salary3Checkbox,
            performanceCheckbox, economicalCheckbox;
    private TextView carname;
    private Button backmenus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_suggestion);

        manualCheckbox = findViewById(R.id.manuel);
        automaticCheckbox = findViewById(R.id.automatic);
        smallCheckbox = findViewById(R.id.small);
        standardCheckbox = findViewById(R.id.standart);
        bigCheckbox = findViewById(R.id.big);
        seat1Checkbox = findViewById(R.id.seat1);
        seat2Checkbox = findViewById(R.id.seat2);
        seat3Checkbox = findViewById(R.id.seat3);
        salary1Checkbox = findViewById(R.id.salary1);
        salary2Checkbox = findViewById(R.id.salary2);
        salary3Checkbox = findViewById(R.id.salary3);
        performanceCheckbox = findViewById(R.id.performance);
        economicalCheckbox = findViewById(R.id.economical);
        carname = findViewById(R.id.carname);
        backmenus = findViewById(R.id.backmenus);
        Intent intent = getIntent();
    }
    public void manuel(View view) {
        manualCheckbox.setChecked(true);
        automaticCheckbox.setChecked(false);
    }
    public void auto(View view) {
        manualCheckbox.setChecked(false);
        automaticCheckbox.setChecked(true);
    }
    public void smalls(View view) {
        smallCheckbox.setChecked(true);
        if (smallCheckbox.isChecked()) {
            standardCheckbox.setChecked(false);
            bigCheckbox.setChecked(false);
        } else {
            bigCheckbox.setChecked(false);
            standardCheckbox.setChecked(false);
        }
    }
    public void standarts(View view) {
        standardCheckbox.setChecked(true);
        if (standardCheckbox.isChecked()) {
            smallCheckbox.setChecked(false);
            bigCheckbox.setChecked(false);
        } else {
            bigCheckbox.setChecked(false);
            smallCheckbox.setChecked(false);
        }
    }
    public void bigs(View view) {
        bigCheckbox.setChecked(true);
        if (bigCheckbox.isChecked()) {
            smallCheckbox.setChecked(false);
            standardCheckbox.setChecked(false);
        } else {
            standardCheckbox.setChecked(false);
            smallCheckbox.setChecked(false);
        }
    }
    public void twos(View view) {
        seat1Checkbox.setChecked(true);
        seat2Checkbox.setChecked(false);
        seat3Checkbox.setChecked(false);
    }

    public void fours(View view) {
        seat1Checkbox.setChecked(false);
        seat2Checkbox.setChecked(true);
        seat3Checkbox.setChecked(false);
    }

    public void sixs(View view) {
        seat1Checkbox.setChecked(false);
        seat2Checkbox.setChecked(false);
        seat3Checkbox.setChecked(true);
    }

    public void tens(View view) {
        salary1Checkbox.setChecked(true);
        salary2Checkbox.setChecked(false);
        salary3Checkbox.setChecked(false);
    }

    public void thirtys(View view) {
        salary1Checkbox.setChecked(false);
        salary2Checkbox.setChecked(true);
        salary3Checkbox.setChecked(false);
    }

    public void seventys(View view) {
        salary1Checkbox.setChecked(false);
        salary2Checkbox.setChecked(false);
        salary3Checkbox.setChecked(true);
    }

    public void performances(View view) {
        performanceCheckbox.setChecked(true);
        economicalCheckbox.setChecked(false);
    }
    public void economicals(View view) {
        performanceCheckbox.setChecked(false);
        economicalCheckbox.setChecked(true);
    }
    public void resultbtn(View view) {
        String suggestion = CarsSuggestion();
        String suggestion2 = CarsSuggestion2();
        String suggestion3 = CarsSuggestion3();
        String suggestion4 = CarsSuggestion4();
        String suggestion5 = CarsSuggestion5();
        String suggestion6 = CarsSuggestion6();
        String suggestion7 = CarsSuggestion7();
        String suggestion8 = CarsSuggestion8();
        String suggestion9 = CarsSuggestion9();
        if((manualCheckbox.isChecked() || automaticCheckbox.isChecked()) && bigCheckbox.isChecked() && seat2Checkbox.isChecked() && salary1Checkbox.isChecked()) {
        carname.setText("         " + suggestion); }
        else if(automaticCheckbox.isChecked() && smallCheckbox.isChecked() && seat1Checkbox.isChecked()) {
            carname.setText("         " + suggestion2);
        }
        else if((automaticCheckbox.isChecked() || automaticCheckbox.isChecked()) && standardCheckbox.isChecked() && seat2Checkbox.isChecked() && salary3Checkbox.isChecked()) {
            carname.setText("         " + suggestion3);
        } else if ((automaticCheckbox.isChecked() || manualCheckbox.isChecked()) && bigCheckbox.isChecked() && salary3Checkbox.isChecked()) {
            carname.setText("         " + suggestion4);
        } else if (manualCheckbox.isChecked() && standardCheckbox.isChecked() && salary1Checkbox.isChecked() && economicalCheckbox.isChecked()) {
            carname.setText("         " + suggestion5);
        } else if ((manualCheckbox.isChecked() || automaticCheckbox.isChecked()) && standardCheckbox.isChecked() && seat2Checkbox.isChecked() && salary1Checkbox.isChecked() && performanceCheckbox.isChecked()) {
            carname.setText("         Please choose manuel and economical");
        } else if (automaticCheckbox.isChecked() && standardCheckbox.isChecked() && seat2Checkbox.isChecked() && salary1Checkbox.isChecked() && (performanceCheckbox.isChecked() || economicalCheckbox.isChecked())) {
            carname.setText("         Please choose a manuel gearbox");
        } else if ((manualCheckbox.isChecked() || automaticCheckbox.isChecked()) && standardCheckbox.isChecked() &&  seat2Checkbox.isChecked() && salary2Checkbox.isChecked()) {
            carname.setText("         " + suggestion6);
        } else if ((manualCheckbox.isChecked() || automaticCheckbox.isChecked()) && smallCheckbox.isChecked() && (seat1Checkbox.isChecked() || seat2Checkbox.isChecked())) {
            carname.setText("         Please choose '6+ and Big size'");
        } else if ((manualCheckbox.isChecked() || automaticCheckbox.isChecked()) && standardCheckbox.isChecked() && (seat1Checkbox.isChecked() || seat2Checkbox.isChecked())) {
            carname.setText("Please choose automatic gearbox");
        } else if (automaticCheckbox.isChecked() && bigCheckbox.isChecked() && seat2Checkbox.isChecked() && salary2Checkbox.isChecked()) {
            carname.setText("         " + suggestion7);
        } else if (manualCheckbox.isChecked() && smallCheckbox.isChecked() && seat2Checkbox.isChecked() && salary1Checkbox.isChecked()) {
            carname.setText("         " + suggestion8);
        } else if ((automaticCheckbox.isChecked() || manualCheckbox.isChecked()) && bigCheckbox.isChecked() && seat3Checkbox.isChecked() && (salary2Checkbox.isChecked() || salary1Checkbox.isChecked())) {
            carname.setText("         " + suggestion9);
        } else {
            carname.setText("       This type of car is not available.\n " +
                    "            Please try other options." );
        }
    }
    private String CarsSuggestion() {
        StringBuilder suggestion = new StringBuilder();

        if (manualCheckbox.isChecked() && automaticCheckbox.isChecked()) {
            suggestion.append("");
        } else if (bigCheckbox.isChecked()) {
            suggestion.append("");
        } else if (seat2Checkbox.isChecked()) {
            suggestion.append("");
        } else if (salary1Checkbox.isChecked()) {
            suggestion.append("");
        } else if (performanceCheckbox.isChecked() || economicalCheckbox.isChecked()) ;
        {
            suggestion.append("");
        }
        suggestion.append("Kia Sportage (2010-2014)\n" +
                "          Dacia Duster (2009-2013)\n" + "          VW Tiguan 2009\n" +
                "          Nissan Qashqai (2013-2014)\n" + "        Hyundai Tuscon(2014-2017)\n");

        return suggestion.toString().trim();
    }
    private String CarsSuggestion2() {
        StringBuilder suggestion2 = new StringBuilder();

        if(automaticCheckbox.isChecked()) {
            suggestion2.append("");
        } else if (smallCheckbox.isChecked()) {
            suggestion2.append("");
        } else if (seat1Checkbox.isChecked() && seat2Checkbox.isChecked()) {
            suggestion2.append("");
        } else if (salary1Checkbox.isChecked() && salary2Checkbox.isChecked()) {
            suggestion2.append("");
        } else if(economicalCheckbox.isChecked()) {
            suggestion2.append("");
        }
        suggestion2.append(" Citroen AMI 2023\n" +
                "           Relive BAW1 2023\n" + "           RKD D2 2023\n" +
                "           Rainwoll RW10\n");

        return suggestion2.toString().trim();
    }
    private String CarsSuggestion3() {
        StringBuilder suggestion3 = new StringBuilder();

        if(automaticCheckbox.isChecked()) {
            suggestion3.append("");
        } else if (standardCheckbox.isChecked()) {
            suggestion3.append("");
        } else if (seat2Checkbox.isChecked()) {
            suggestion3.append("");
        } else if (salary3Checkbox.isChecked()) {
            suggestion3.append("");
        } else if(performanceCheckbox.isChecked() || economicalCheckbox.isChecked()) {
            suggestion3.append("");
        }
        suggestion3.append("BMW 3-5-7 Series(2013-2020)\n" +
                "          Audi A4-A5-A8(2013-2018)\n" + "          Mercedes C-E Series(2009-2017)\n" +
                "          Volvo s60-s90(2016-2019)\n" + "          Honda Accord(2022-2023)\n"        +
                "          Tesla Model 3-Y(2023)\n");

        return suggestion3.toString().trim();
    }
    private String CarsSuggestion4() {
        StringBuilder suggestion4 = new StringBuilder();

        if(automaticCheckbox.isChecked()) {
            suggestion4.append("");
        } else if (bigCheckbox.isChecked()) {
            suggestion4.append("");
        } else if (seat2Checkbox.isChecked()) {
            suggestion4.append("");
        } else if (salary3Checkbox.isChecked()) {
            suggestion4.append("");
        } else if(performanceCheckbox.isChecked() || economicalCheckbox.isChecked()) {
            suggestion4.append("");
        }
        suggestion4.append("  Range Rover(2018-2023)\n" +
                "          BMX X Series(2019-2023)\n" + "          Porsche Cayenne(2015-2023)\n" +
                "          Mercedes G Series(2015-2023)\n" + "          TOGG 2023 LONG RANGE\n");

        return suggestion4.toString().trim();
    }
    private String CarsSuggestion5() {
        StringBuilder suggestion5 = new StringBuilder();

        if(manualCheckbox.isChecked()) {
            suggestion5.append("");
        } else if (standardCheckbox.isChecked()) {
            suggestion5.append("");
        } else if (seat2Checkbox.isChecked()) {
            suggestion5.append("");
        } else if (salary1Checkbox.isChecked()) {
            suggestion5.append("");
        } else if(economicalCheckbox.isChecked()) {
            suggestion5.append("");
        }
        suggestion5.append(" Fiat Egea(2013-2015)\n" +
                "          Renault Clio\n" + "          Fiat Linea\n" +
                "          Seat Toledo(2014)\n" +
                "          Renault Megane(2012-2014)\n" + "          Fiat Punto(2013)\n");

        return suggestion5.toString().trim();
    }
    private String CarsSuggestion6() {
        StringBuilder suggestion6 = new StringBuilder();

        if(manualCheckbox.isChecked() || automaticCheckbox.isChecked()) {
            suggestion6.append("");
        } else if (standardCheckbox.isChecked()) {
            suggestion6.append("");
        } else if (seat2Checkbox.isChecked()) {
            suggestion6.append("");
        } else if (salary2Checkbox.isChecked()) {
            suggestion6.append("");
        } else if(performanceCheckbox.isChecked() || economicalCheckbox.isChecked()) {
            suggestion6.append("");
        }
        suggestion6.append("  VW PASSAT(2017-2021)\n" +
                "          Honda Civic(2020-2023)\n" + "          Honda S2000\n" +
                "          Mazda MX\n"               + "          Skoda SuperB(2017-2023)\n");

        return suggestion6.toString().trim();
    }
    private String CarsSuggestion7() {
        StringBuilder suggestion7 = new StringBuilder();

        if (automaticCheckbox.isChecked()) {
            suggestion7.append("");
        } else if (bigCheckbox.isChecked()) {
            suggestion7.append("");
        } else if (seat2Checkbox.isChecked()) {
            suggestion7.append("");
        } else if (salary2Checkbox.isChecked()) {
            suggestion7.append("");
        } else if (performanceCheckbox.isChecked() || economicalCheckbox.isChecked()) ;
        {
            suggestion7.append("");
        }
        suggestion7.append("   Kia Sportage 2020\n" +
                "          Dacia Duster (2019-2023)\n" + "          VW Tiguan (2017-2023)\n" +
                "          Nissan Qashqai (2018-2023)\n" + "          Hyundai Tuscon(2020-2023)\n");

        return suggestion7.toString().trim();
    }
    private String CarsSuggestion8() {
        StringBuilder suggestion8 = new StringBuilder();

        if (manualCheckbox.isChecked()) {
            suggestion8.append("");
        } else if (smallCheckbox.isChecked()) {
            suggestion8.append("");
        } else if (seat2Checkbox.isChecked()) {
            suggestion8.append("");
        } else if (salary1Checkbox.isChecked()) {
            suggestion8.append("");
        } else if (economicalCheckbox.isChecked() || performanceCheckbox.isChecked()) ;
        {
            suggestion8.append("");
        }
        suggestion8.append("   Hyundai Accent 2003\n" +
                "         Tofas Sahin S 1993\n" + "           Fiat Tipo 1998\n" +
                "          Opel Meriva 2004\n" + "          Fiat Albea 2009\n" +
                "          Renault R9 1998\n");

        return suggestion8.toString().trim();
    }
    private String CarsSuggestion9() {
        StringBuilder suggestion9 = new StringBuilder();

        if (automaticCheckbox.isChecked()) {
            suggestion9.append("");
        } else if (bigCheckbox.isChecked()) {
            suggestion9.append("");
        } else if (seat3Checkbox.isChecked()) {
            suggestion9.append("");
        } else if (salary2Checkbox.isChecked()) {
            suggestion9.append("");
        } else if (economicalCheckbox.isChecked() || performanceCheckbox.isChecked()) ;
        {
            suggestion9.append("");
        }
        suggestion9.append("    Chery Tigo 8 Pro\n" +
                "          Fiat Doblo Combi\n" + "         Mercedes-Benz Vito\n" +
                "          VW Caravelle\n" + "          Renault Master\n" +
                "          VW Transporter\n");

        return suggestion9.toString().trim();
    }
    public void btnBack(View view)
    {
        Intent intent = new Intent(CarSuggestion.this , MainActivity.class);
        startActivity(intent);
    }


}