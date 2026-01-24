package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp
public class odoTest extends OpMode {
    public DcMotorEx encoder;

    @Override
    public void init() {
        encoder = hardwareMap.get(DcMotorEx.class, "ballz");
        encoder.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        telemetry.addData("encoder", encoder.getCurrentPosition());
    }

    @Override
    public void loop() {

        telemetry.addData("encoder", encoder.getCurrentPosition());
    }
}
