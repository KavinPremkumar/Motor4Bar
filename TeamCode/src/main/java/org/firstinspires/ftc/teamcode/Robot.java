package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Robot {

    public LinearOpMode myOpMode;
    public HardwareMap hwMap;
    FourBarMotor linkageMotor = new FourBarMotor(this);
    Crossbow stringMotor = new Crossbow(this);
    Robot(LinearOpMode myOpMode){
        this.myOpMode = myOpMode;
    }
    public void init(){
        hwMap = myOpMode.hardwareMap;
        linkageMotor.init();
        stringMotor.init();
    }
}
