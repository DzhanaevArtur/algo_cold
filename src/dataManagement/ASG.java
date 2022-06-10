package dataManagement;

import data.DATA;
import dataAttribute.AnalogueValue;

/*
 * ASG (Analogue setting)
 * Задание значения аналогового сигнала
 */

public class ASG extends DATA {


    private AnalogueValue setMag = new AnalogueValue(); //Значение параметра аналогово сигнала

    public ASG(Float setMag) {
        this.setMag.getF().setValue(setMag);
    } //Первичное определение значения

    public AnalogueValue getSetMag() {
        return setMag;
    } //Получение значения
}
