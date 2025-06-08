class RoyalEnfield {
    String model;
    int speed;
    int cc;

    // Constructor
    RoyalEnfield(String model, int speed, int cc) {
        this.model = model;
        this.speed = speed;
        this.cc = cc;
    }

    void display() {
        System.out.println("Model: " + model + ", Speed: " + speed + " km/h, CC: " + cc);
    }
}

public class Mainn
{
    public static void main(String[] args)
    {
        RoyalEnfield[] models = {
            new RoyalEnfield("Classic 350", 120, 346),
            new RoyalEnfield("Bullet 500", 130, 499),
            new RoyalEnfield("Himalayan", 140, 411),
            new RoyalEnfield("Interceptor 650", 160, 648)
        };

        // Print details of each model
        
        for (RoyalEnfield model : models) {
            model.display();
        }
    }
}