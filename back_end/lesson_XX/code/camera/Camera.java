package camera;

public class Camera {

    // Camera имеет поле - пленка для съемки CameraRoll
    private CameraRoll cameraRoll; // = new CameraRoll();// вставили пленку в фотоаппарат (DI)
    // ссылка на объект cameraRoll пустая, ее надо инициализировать
    // способ 1 (создаем новый объект) = new Camera Roll();

    // способ 2 - делаем конструктор в Camera с полем CameraRoll
    public Camera(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public Camera() {
    }

    // способ 3 - делаем для поля cameraRoll сеттер и "заряжаем" камеру пленкой в Client


    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhoto() {
        System.out.println("Click!..."); // фотоаппарат сработал
        cameraRoll.makeImage(); // 1 кадр израсходовался
    }
}
