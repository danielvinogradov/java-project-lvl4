package hexlet.code;

import io.javalin.Javalin;

public final class App {

    public static Javalin getApp() {
        Javalin app = Javalin.create(config -> {
            config.enableDevLogging(); // enable extensive development logging for http and websocket
        });
        app.get("/", ctx -> ctx.result("Hello World"));
        return app;
    }

    public static void main(String[] args) {
        getApp().start();
    }

}
