module eu.filip.todoappgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eu.filip.todoappgui to javafx.fxml;
    exports eu.filip.todoappgui;
}