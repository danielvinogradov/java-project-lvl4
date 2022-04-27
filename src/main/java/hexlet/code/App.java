package hexlet.code;

import hexlet.code.models.Url;
import hexlet.code.models.query.QUrl;
import io.javalin.Javalin;

import java.util.List;

public final class App {

    public static Javalin getApp() {
        Javalin app = Javalin.create(config -> {
            config.enableDevLogging(); // enable extensive development logging for http and websocket
        });

        app.get("/", ctx -> {
            Url url = new Url("hexlet.io");
            url.save();
            ctx.result("Hello World");
        });

        app.get("/kek", ctx -> {
            List<Url> list = new QUrl().findList();
            ctx.result(list.toString());
        });

        return app;
    }

    public static void main(String[] args) {
        getApp().start();
    }

}
