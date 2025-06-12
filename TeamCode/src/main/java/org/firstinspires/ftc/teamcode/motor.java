package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class motor {
    DcMotorEx d1;
    Robot robot;

    motor(Robot robot){
        this.robot = robot;
    }

    public void init(){
        d1 = robot.h1.get(DcMotorEx.class, "Motor");
        d1.setDirection(DcMotor.Direction.FORWARD);
        d1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

}
