package camera;

public class Client {
    public static void main(String[] args) {

        Camera camera = new Camera();
        CameraRoll cameraRoll = new BWCameraRoll();
        camera.setCameraRoll(cameraRoll);
        camera.doPhoto();

    }
}
