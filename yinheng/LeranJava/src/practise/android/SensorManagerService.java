package practise.android;

/**
 * Learning
 */
public class SensorManagerService {

    public void start() throws StartException{
        System.out.println("SensorMangerService启动");
        initSensor();
    }

    private void initSensor() throws StartException{
        Sensor[] sensors = new Sensor[] {
                new PSensor("PSensor"),
                new GSensor("GSensor")};


        throw new StartException();
    }
}
