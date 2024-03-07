package com.directi.training.srp.exercise_refactored;

public class CarManager {

    CarDAO dao = new CarDAO() ;
    CarsNames carsNames = new CarsNames();
    BestCar bestCar = new BestCar();

    public Car getBestCar() {
        return bestCar.getBestCar(dao.getAll());
    }
    public String getCarsNames() {
        return carsNames.getCarsNames(dao.getAll());
    }
    public Car getCarById(String carId) {
        return dao.getCarByIdFromDb(carId);
    }

}
