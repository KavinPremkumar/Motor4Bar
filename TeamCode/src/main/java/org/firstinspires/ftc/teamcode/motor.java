package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class motor {
    DcMotorEx motor;
    Robot robot;
    double power = 0;

    motor(Robot robot){
        this.robot = robot;
    }

    public void init(){
        motor = robot.hwMap.get(DcMotorEx.class, "Motor");
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

}
