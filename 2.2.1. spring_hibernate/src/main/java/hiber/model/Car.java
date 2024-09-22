package hiber.model;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    @OneToOne(mappedBy = "car") // Указывает, что поле car в User контролирует связь
    private User user;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "{ model = " + model +
                ", series = '" + series + '\'' +
                '}';
    }
}
