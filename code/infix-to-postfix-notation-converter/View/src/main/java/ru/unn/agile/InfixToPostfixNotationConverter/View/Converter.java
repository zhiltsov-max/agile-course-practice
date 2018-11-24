package ru.unn.agile.InfixToPostfixNotationConverter.View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import ru.unn.agile.InfixToPostfixNotationConverter.ViewModel.ViewModel;

public class Converter {
    @FXML
    private ViewModel viewModel;
    @FXML
    private TextField infixExpression;
    @FXML
    private TextField postfixExpression;
    @FXML
    private TextField expressionResult;
    @FXML
    private Text status;
    @FXML
    private Button convertAndCalculateButton;

    @FXML
    void initialize() {
        viewModel = new ViewModel();

        infixExpression.textProperty().bindBidirectional(viewModel.infixExpressionProperty());
        postfixExpression.textProperty().bindBidirectional(viewModel.postfixExpressionProperty());
        expressionResult.textProperty().bindBidirectional(viewModel.expressionResultProperty());
        status.textProperty().bindBidirectional(viewModel.statusProperty());
    }
}
