package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class FourBarMotor {
    DcMotor motor;
    Robot robot;
    double power = 0;

    FourBarMotor(Robot robot){
        this.robot = robot;
    }

    public void init(){
        motor = robot.hwMap.get(DcMotor.class, "4BarMotor");
        motor.setDirection(DcMotor.Direction.FORWARD);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void changePower(boolean sign){
        if(sign){
            power+=0.005;
        } else if (!sign){
            power-=0.005;
        }
    }

    public void setPower2(boolean direction){
        if(direction){
            motor.setPower(power);
        } else if (!direction){
            motor.setPower(-power);
        }
    }

    public int telemetry() {
        return motor.getPortNumber();
    }

}
