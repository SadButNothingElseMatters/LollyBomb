package com.company.Conroller;


import com.company.View.ShowResult;

public class Output {
    ShowResult showResult = new ShowResult();
    double result;
    public void getData(double result){
        this.result = result;
        sendData(this.result);
    }
    public void sendData(double result){
        showResult.show(result);
    }
}
