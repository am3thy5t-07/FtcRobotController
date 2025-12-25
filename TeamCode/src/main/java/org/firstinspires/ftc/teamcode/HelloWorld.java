package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled

@Autonomous
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello","Amethyst");
    }

    @Override
    public void loop() {

    }
    // single line comments
    /*
    * 1. Hello: World, change the telemetry data to display "Hello: Your Name"
    * 2. Run this code in the autonomous section of your ds
    * */
}
