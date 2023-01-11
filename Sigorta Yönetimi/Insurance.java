package Java102.SigortaYonetim;

import java.util.Calendar;
import java.util.Date;

public class Insurance {
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public abstract void calculate();
}

class HealthInsurance extends Insurance {
    @Override // Özel Sağlık Sigortası
    public void calculate() {
        // doldurulacak
    }
}

class ResidenceInsurance extends Insurance {
    @Override // Konus Sigortası
    public void calculate() {
        // doldurulacak
    }
}

class TravelInsurance extends Insurance {
    @Override // Seyahat Sigortası
    public void calculate() {
        // doldurulacak
    }
}

class CarInsurance extends Insurance {
    public CarInsurance() {
        this.setName("Kasko");
        this.setPrice(2750);
        this.setStartDate(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, 2);
        this.setEndDate(calendar.getTime());
    }

    @Override // Araç Sigortası
    public void calculate() {
        this.setPrice(this.getPrice() * 1.2);
    }
}

class InvalidAuthenticationException extends Exception {
    public InvalidAuthenticationException(String message) {
        super(message);
    }
}
