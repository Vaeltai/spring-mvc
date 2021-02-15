package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCars(Integer count) {
        cars.add(new Car("Toyota", 2005, "A543EX"));
        cars.add(new Car("Lada", 2003, "E982OH"));
        cars.add(new Car("BMW", 2015, "C439BK"));
        cars.add(new Car("Lexus", 1995, "K378OT"));
        cars.add(new Car("Kia", 2010, "P641AM"));
        if(count == null || count >= 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}

