import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


public class lognControler {

    @FXML
    private Button btnEntrar;

    @FXML
    private Label lblFalha;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void btnEntrar_Click(ActionEvent event) {
        lblFalha.setVisible(false);
        String usuario = txtEmail.getText();
        String senha = txtSenha.getText();
        if (usuario.equals("admin") && senha.equals("admin")) {
            lblFalha.setText("login successful!");
            lblFalha.setStyle("-fx-border-color: rgb(25,130,25)");
            lblFalha.setTextFill(Color.rgb(25,130,25));
            lblFalha.setVisible(true);
        } else {
            System.out.println("Usuário: " + usuario + " | Senha: " + senha);
            lblFalha.setText("Wrong, try again!");
            lblFalha.setStyle("-fx-border-color: rgb(130,25,25)");
            lblFalha.setTextFill(Color.rgb(130,25,25));
            lblFalha.setVisible(true);
            txtEmail.clear();
            txtSenha.clear();
        }
        
    }
    
    @FXML
    void lblFalha_Click(MouseEvent event) {
        lblFalha.setVisible(false);
    }

}
