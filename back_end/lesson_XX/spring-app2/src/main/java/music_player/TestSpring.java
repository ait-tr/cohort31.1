package music_player;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // считали контекст приложения, получили объект context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // из него получили объект типа TestBean методом .getBean
        // Music music = context.getBean("musicBean", Music.class); // аргументы - имя объекта и имя класса
        // внедряем зависимость
        // MusicPlayer player = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close(); // закрыли контекст приложения

    }
}
