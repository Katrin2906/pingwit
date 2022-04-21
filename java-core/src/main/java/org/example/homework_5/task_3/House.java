package org.example.homework_5.task_3;

public abstract class House {

    private Integer floorNumber;
    private Integer residentNumber;
    private Boolean heatOn;

    public House(Integer floorNumber, Integer residentNumber, Boolean heatOn) {
        this.floorNumber = floorNumber;
        this.residentNumber = residentNumber;
        this.heatOn = true;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public Integer getResidentNumber() {
        return residentNumber;
    }

    public Boolean getHeatOn() {
        return heatOn;
    }

    public Boolean setHeatOn(Boolean heatOn) {
        return this.heatOn = heatOn;
    }
}
