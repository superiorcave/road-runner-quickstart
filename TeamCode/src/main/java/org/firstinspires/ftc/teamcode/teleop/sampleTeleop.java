package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class sampleTeleop extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        while (opModeInInit()){

        }

        waitForStart();

        while (opModeIsActive()){
            telemetry.addLine("hello world");
            telemetry.addData("location", "[add data here]");
            telemetry.update();
        }

    }
}