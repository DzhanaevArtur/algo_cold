package dataManagement;

import data.DATA;
import dataValue.Attribute;

/*
 * ING (Integer status setting)
 * Целочисленная установка состояния
 */

public class ING extends DATA {

    private Attribute<Integer> setVal = new Attribute<>(0); //Настройка параметра состояния

    public ING(Integer setVal) {
        this.setVal.setValue(setVal);
    } //Первичное определение параметра состояния

    public Attribute<Integer> getSetVal() {
        return setVal;
    } //Получение значения состояния

    public void setSetVal(Attribute<Integer> setVal) {
        this.setVal = setVal;
    } //Определение
}
