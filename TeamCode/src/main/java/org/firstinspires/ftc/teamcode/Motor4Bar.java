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
            if (gamepad1.dpad_right) {
                robot.linkageMotor.setPower2(true);
            } else if (gamepad1.dpad_left) {
                robot.linkageMotor.setPower2(false);
            } else {
                robot.linkageMotor.motor.setPower(0);
            }

            if (gamepad1.dpad_left) {
                robot.linkageMotor.changePower(true);
            } else if (gamepad1.dpad_right) {
                robot.linkageMotor.changePower(false);
            }
//Crossbow
            if (gamepad2.dpad_up) {
                robot.stringMotor.changePower(true);
            } else if (gamepad2.dpad_down) {
                robot.stringMotor.changePower(false);
            }


            if (gamepad2.dpad_right) {
                robot.stringMotor.setPower2(true);
            } else if (gamepad2.dpad_left) {
                robot.stringMotor.setPower2(false);
            } else {
                robot.stringMotor.motor2.setPower(0);
            }

            if (gamepad2.a){
                robot.stringMotor.freeMove();
            } else if(gamepad2.b){
                robot.stringMotor.reStart();
            }

            telemetry.addData("String Motor Encoder Value", robot.stringMotor.motor2.getCurrentPosition());
            telemetry.addData("Next string motor power", robot.stringMotor.telemetry2());
            telemetry.addData("Linkage Motor connected", robot.linkageMotor.telemetry());
            telemetry.addData("Crossbow Motor connected", robot.stringMotor.telemetry());
            telemetry.update();
        }
    }
}
