package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {

    public LinearOpMode myOpMode;
    public HardwareMap hwMap;
    motor linkageMotor = new motor(this);
    Robot(LinearOpMode myOpMode){
        this.myOpMode = myOpMode;
    }
    public void init(){
        hwMap = myOpMode.hardwareMap;
        linkageMotor.init();
    }
}
