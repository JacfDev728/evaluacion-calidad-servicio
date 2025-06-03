module com.seeusa.evaluacioncalidadservicio {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.seeusa.evaluacioncalidadservicio to javafx.fxml;
    exports com.seeusa.evaluacioncalidadservicio;
}