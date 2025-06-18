package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Motor4Bar extends LinearOpMode {
    Robot robot = new Robot(this);

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init();
        waitForStart();
        while (opModeIsActive()) {
            if(gamepad1.dpad_right){
                robot.linkageMotor.setPower2(true);
            } else if(gamepad1.dpad_left){
                robot.linkageMotor.setPower2(false);
            } else {
                robot.linkageMotor.motor.setPower(0);
            }

            if(gamepad1.dpad_up){
                robot.linkageMotor.changePower(true);
            } else if(gamepad1.dpad_down){
                robot.linkageMotor.changePower(false);
        }

            telemetry.addData("Motor Power", robot.linkageMotor.motor.getPower());
            telemetry.addData("next power value", robot.linkageMotor.power);
            telemetry.update();
    }
}
}
