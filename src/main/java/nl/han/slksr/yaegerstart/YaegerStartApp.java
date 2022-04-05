package nl.han.slksr.yaegerstart;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import nl.han.slksr.yaegerstart.scenes.FirstScreen;

public class YaegerStartApp extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setSize(new Size(1200, 800));
    }

    @Override
    public void setupScenes() {
        addScene(0, new FirstScreen());
    }
}
