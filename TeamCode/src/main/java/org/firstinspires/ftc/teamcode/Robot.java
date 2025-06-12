package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {

    public LinearOpMode myOpMode;
    public HardwareMap h1;
    motor m1 = new motor(this);
    Robot(LinearOpMode myOpMode){
        this.myOpMode = myOpMode;
    }
    public void init(){
        h1 = myOpMode.hardwareMap;
        m1.init();
    }
}
