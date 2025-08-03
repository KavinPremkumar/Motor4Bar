package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Crossbow {
    DcMotorEx motor2;
    Robot robot;
    double power = 0;

    Crossbow(Robot robot) {
        this.robot = robot;
    }

    public void init() {
        motor2 = robot.hwMap.get(DcMotorEx.class, "CrossbowMotor");
        motor2.setDirection(DcMotor.Direction.FORWARD);
        motor2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void changePower(boolean sign) {
        if (sign) {
            power += 0.005;
        } else if (!sign) {
            power -= 0.005;
        }
    }

    public void setPower2(boolean direction) {
        if (direction) {
            motor2.setPower(power);
        } else if (!direction) {
            motor2.setPower(-power);
        }
    }

    public void freeMove() {
        motor2.setMotorDisable();
    }

    public void reStart() {
        motor2.setMotorEnable();
    }


    public int telemetry() {
        return motor2.getPortNumber();
    }
    public double telemetry2() {
        return power;
    }
    public int getPosition(){
        return motor2.getCurrentPosition();
    }
}

