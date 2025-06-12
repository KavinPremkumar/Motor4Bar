package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Motor4Bar extends LinearOpMode {
    Robot robot = new Robot(this);

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init();
        waitForStart();
        while (opModeIsActive()) {
            if(gamepad1.dpad_right){
                robot.m1.d1.setPower(0.01);
            } else if(gamepad1.dpad_left){
                robot.m1.d1.setPower(-0.01);
            } else {
                robot.m1.d1.setPower(0);
            }
        }
    }
}
